package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
class MediaCodecWrapperFactoryImpl implements MediaCodecWrapperFactory {

    public static class MediaCodecWrapperImpl implements MediaCodecWrapper {
        private final MediaCodec mediaCodec;

        public MediaCodecWrapperImpl(MediaCodec mediaCodec) {
            this.mediaCodec = mediaCodec;
        }

        @Override
        public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i7) {
            this.mediaCodec.configure(mediaFormat, surface, mediaCrypto, i7);
        }

        @Override
        public Surface createInputSurface() {
            return this.mediaCodec.createInputSurface();
        }

        @Override
        public int dequeueInputBuffer(long j3) {
            return this.mediaCodec.dequeueInputBuffer(j3);
        }

        @Override
        public int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j3) {
            return this.mediaCodec.dequeueOutputBuffer(bufferInfo, j3);
        }

        @Override
        public void flush() {
            this.mediaCodec.flush();
        }

        @Override
        public MediaCodecInfo getCodecInfo() {
            return this.mediaCodec.getCodecInfo();
        }

        @Override
        public ByteBuffer getInputBuffer(int i7) {
            return this.mediaCodec.getInputBuffer(i7);
        }

        @Override
        public MediaFormat getInputFormat() {
            return this.mediaCodec.getInputFormat();
        }

        @Override
        public ByteBuffer getOutputBuffer(int i7) {
            return this.mediaCodec.getOutputBuffer(i7);
        }

        @Override
        public MediaFormat getOutputFormat() {
            return this.mediaCodec.getOutputFormat();
        }

        @Override
        public void queueInputBuffer(int i7, int i10, int i11, long j3, int i12) {
            this.mediaCodec.queueInputBuffer(i7, i10, i11, j3, i12);
        }

        @Override
        public void release() {
            this.mediaCodec.release();
        }

        @Override
        public void releaseOutputBuffer(int i7, boolean z9) {
            this.mediaCodec.releaseOutputBuffer(i7, z9);
        }

        @Override
        public void setParameters(Bundle bundle) {
            this.mediaCodec.setParameters(bundle);
        }

        @Override
        public void start() {
            this.mediaCodec.start();
        }

        @Override
        public void stop() {
            this.mediaCodec.stop();
        }

        @Override
        public MediaFormat getOutputFormat(int i7) {
            return this.mediaCodec.getOutputFormat(i7);
        }
    }

    @Override
    public MediaCodecWrapper createByCodecName(String str) {
        return new MediaCodecWrapperImpl(MediaCodec.createByCodecName(str));
    }
}
