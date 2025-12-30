package org.webrtc;

import android.content.Context;
import android.os.SystemClock;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class FileVideoCapturer implements VideoCapturer {
    private static final String TAG = "FileVideoCapturer";
    private CapturerObserver capturerObserver;
    private final VideoReader videoReader;
    private final Timer timer = new Timer();
    private final TimerTask tickTask = new TimerTask() {
        @Override
        public void run() {
            FileVideoCapturer.this.tick();
        }
    };

    private interface VideoReader {
        void close();

        VideoFrame getNextFrame();
    }

    @Override
    public void changeCaptureFormat(int i, int i2, int i3) {
    }

    @Override
    public boolean isScreencast() {
        return false;
    }

    private static class VideoReaderY4M implements VideoReader {
        private static final int FRAME_DELIMETER_LENGTH = 6;
        private static final String TAG = "VideoReaderY4M";
        private static final String Y4M_FRAME_DELIMETER = "FRAME";
        private final int frameHeight;
        private final int frameWidth;
        private final RandomAccessFile mediaFile;
        private final FileChannel mediaFileChannel;
        private final long videoStart;

        public VideoReaderY4M(String str) throws IOException, NumberFormatException {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
            this.mediaFile = randomAccessFile;
            this.mediaFileChannel = randomAccessFile.getChannel();
            StringBuilder sb = new StringBuilder();
            while (true) {
                int i = this.mediaFile.read();
                if (i == -1) {
                    throw new RuntimeException("Found end of file before end of header for file: " + str);
                }
                if (i != 10) {
                    sb.append((char) i);
                } else {
                    this.videoStart = this.mediaFileChannel.position();
                    String strSubstring = "";
                    int i2 = 0;
                    int i3 = 0;
                    for (String str2 : sb.toString().split("[ ]")) {
                        char cCharAt = str2.charAt(0);
                        if (cCharAt == 'C') {
                            strSubstring = str2.substring(1);
                        } else if (cCharAt == 'H') {
                            i3 = Integer.parseInt(str2.substring(1));
                        } else if (cCharAt == 'W') {
                            i2 = Integer.parseInt(str2.substring(1));
                        }
                    }
                    Logging.d("VideoReaderY4M", "Color space: " + strSubstring);
                    if (!strSubstring.equals("420") && !strSubstring.equals("420mpeg2")) {
                        throw new IllegalArgumentException("Does not support any other color space than I420 or I420mpeg2");
                    }
                    if (i2 % 2 == 1 || i3 % 2 == 1) {
                        throw new IllegalArgumentException("Does not support odd width or height");
                    }
                    this.frameWidth = i2;
                    this.frameHeight = i3;
                    Logging.d("VideoReaderY4M", "frame dim: (" + i2 + ", " + i3 + ")");
                    return;
                }
            }
        }

        @Override
        public VideoFrame getNextFrame() throws IOException {
            long nanos = TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
            JavaI420Buffer javaI420BufferAllocate = JavaI420Buffer.allocate(this.frameWidth, this.frameHeight);
            ByteBuffer dataY = javaI420BufferAllocate.getDataY();
            ByteBuffer dataU = javaI420BufferAllocate.getDataU();
            ByteBuffer dataV = javaI420BufferAllocate.getDataV();
            javaI420BufferAllocate.getStrideY();
            javaI420BufferAllocate.getStrideU();
            javaI420BufferAllocate.getStrideV();
            try {
                int i = FRAME_DELIMETER_LENGTH;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
                if (this.mediaFileChannel.read(byteBufferAllocate) < i) {
                    this.mediaFileChannel.position(this.videoStart);
                    if (this.mediaFileChannel.read(byteBufferAllocate) < i) {
                        throw new RuntimeException("Error looping video");
                    }
                }
                String str = new String(byteBufferAllocate.array(), Charset.forName("US-ASCII"));
                if (!str.equals("FRAME\n")) {
                    throw new RuntimeException("Frames should be delimited by FRAME plus newline, found delimter was: '" + str + "'");
                }
                this.mediaFileChannel.read(dataY);
                this.mediaFileChannel.read(dataU);
                this.mediaFileChannel.read(dataV);
                return new VideoFrame(javaI420BufferAllocate, 0, nanos);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void close() throws IOException {
            try {
                this.mediaFile.close();
            } catch (IOException e) {
                Logging.e("VideoReaderY4M", "Problem closing file", e);
            }
        }
    }

    public FileVideoCapturer(String str) throws IOException {
        try {
            this.videoReader = new VideoReaderY4M(str);
        } catch (IOException e) {
            Logging.d("FileVideoCapturer", "Could not open video file: " + str);
            throw e;
        }
    }

    public void tick() {
        VideoFrame nextFrame = this.videoReader.getNextFrame();
        this.capturerObserver.onFrameCaptured(nextFrame);
        nextFrame.release();
    }

    @Override
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver) {
        this.capturerObserver = capturerObserver;
    }

    @Override
    public void startCapture(int i, int i2, int i3) {
        this.timer.schedule(this.tickTask, 0L, 1000 / i3);
    }

    @Override
    public void stopCapture() {
        this.timer.cancel();
    }

    @Override
    public void dispose() {
        this.videoReader.close();
    }
}
