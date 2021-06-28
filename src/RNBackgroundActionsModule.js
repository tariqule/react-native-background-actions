import { NativeEventEmitter, NativeModules } from 'react-native';

const { RNBackgroundActions, RNPassKit } = NativeModules;

const nativeEventEmitter = new NativeEventEmitter(RNBackgroundActions);

export { RNBackgroundActions, nativeEventEmitter, RNPassKit };
