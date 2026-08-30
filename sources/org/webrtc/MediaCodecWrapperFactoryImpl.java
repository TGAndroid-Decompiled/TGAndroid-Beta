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
        public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
            this.mediaCodec.configure(mediaFormat, surface, mediaCrypto, i10);
        }

        @Override
        public Surface createInputSurface() {
            return this.mediaCodec.createInputSurface();
        }

        @Override
        public int dequeueInputBuffer(long j10) {
            return this.mediaCodec.dequeueInputBuffer(j10);
        }

        @Override
        public int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j10) {
            return this.mediaCodec.dequeueOutputBuffer(bufferInfo, j10);
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
        public ByteBuffer getInputBuffer(int i10) {
            return this.mediaCodec.getInputBuffer(i10);
        }

        @Override
        public MediaFormat getInputFormat() {
            return this.mediaCodec.getInputFormat();
        }

        @Override
        public ByteBuffer getOutputBuffer(int i10) {
            return this.mediaCodec.getOutputBuffer(i10);
        }

        @Override
        public MediaFormat getOutputFormat() {
            return this.mediaCodec.getOutputFormat();
        }

        @Override
        public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
            this.mediaCodec.queueInputBuffer(i10, i11, i12, j10, i13);
        }

        @Override
        public void release() {
            this.mediaCodec.release();
        }

        @Override
        public void releaseOutputBuffer(int i10, boolean z4) {
            this.mediaCodec.releaseOutputBuffer(i10, z4);
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
        public MediaFormat getOutputFormat(int i10) {
            return this.mediaCodec.getOutputFormat(i10);
        }
    }

    @Override
    public MediaCodecWrapper createByCodecName(String str) {
        return new MediaCodecWrapperImpl(MediaCodec.createByCodecName(str));
    }
}
