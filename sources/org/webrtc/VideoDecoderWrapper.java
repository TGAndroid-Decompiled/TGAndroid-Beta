package org.webrtc;

import org.webrtc.NativeLifecycleLock;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderWrapper;
class VideoDecoderWrapper {

    public interface Natives {
        void onDecodedFrame(long j, VideoFrame videoFrame, Integer num, Integer num2);
    }

    public static NativeDecoderCallback createDecoderCallback(long j) {
        return new NativeDecoderCallback(j);
    }

    static class NativeDecoderCallback implements VideoDecoder.Callback {
        private final NativeLifecycleLock lifecycleLock;

        public NativeDecoderCallback(long j) {
            this.lifecycleLock = new NativeLifecycleLock("VideoDecoderWrapper", j);
        }

        public static void lambda$onDecodedFrame$0(VideoFrame videoFrame, Integer num, Integer num2, long j) {
            VideoDecoderWrapperJni.get().onDecodedFrame(j, videoFrame, num, num2);
        }

        public void invalidate() {
            this.lifecycleLock.dispose(new g((byte) 0));
        }

        @Override
        public void onDecodedFrame(final VideoFrame videoFrame, final Integer num, final Integer num2) {
            this.lifecycleLock.runIfAlive(new NativeLifecycleLock.NativePointerRunnable() {
                @Override
                public final void run(long j) {
                    VideoDecoderWrapper.NativeDecoderCallback.lambda$onDecodedFrame$0(VideoFrame.this, num, num2, j);
                }
            });
        }

        public static void lambda$invalidate$1(long j) {
        }
    }
}
