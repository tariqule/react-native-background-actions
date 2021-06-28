import React from 'react'
import { View, Text } from 'react-native'
import {RNPassKit} from "react-native-wallet-pass-kit"
const App = () => {
    React.useEffect(() =>{
        RNPassKit.addPass()
    },[])
    return (
        <View>
            <Text>test</Text>
        </View>
    )
}

export default App
