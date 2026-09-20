package w7;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
public abstract class k {
    public static a3.z a(File file, ki.q qVar, long j3, long j10, boolean z10) {
        long e = e(file);
        long max = Math.max(0L, j3 * 1000);
        long min = Math.min(e, Math.max(max, j10 * 1000));
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            mediaExtractor.setDataSource(file.getAbsolutePath());
            int d = d(mediaExtractor, true);
            long j11 = -1;
            if (d >= 0) {
                mediaExtractor.selectTrack(d);
                mediaExtractor.seekTo(max, 1);
                long sampleTime = mediaExtractor.getSampleTime();
                if (sampleTime >= 0 && sampleTime < min) {
                    j11 = sampleTime;
                }
            }
            if (j11 >= 0 && j11 < min) {
                mediaExtractor = new MediaExtractor();
                try {
                    mediaExtractor.setDataSource(file.getAbsolutePath());
                    int d10 = d(mediaExtractor, true);
                    int d11 = d(mediaExtractor, false);
                    if (d10 >= 0 && (!z10 || d11 >= 0)) {
                        qVar.f(mediaExtractor.getTrackFormat(d10), true);
                        if (z10) {
                            qVar.f(mediaExtractor.getTrackFormat(d11), false);
                        }
                        mediaExtractor.release();
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(2097152);
                        long j12 = j11;
                        b(file, qVar, true, j12, min, allocateDirect);
                        if (z10) {
                            b(file, qVar, false, j12, min, allocateDirect);
                        }
                        return new a3.z(j12 / 1000, (min - j12) / 1000);
                    }
                    throw new IOException("Source file has no required tracks");
                } finally {
                }
            }
            throw new IOException("Trim range has no video sync sample");
        } finally {
        }
    }

    public static void b(File file, ki.q qVar, boolean z10, long j3, long j10, ByteBuffer byteBuffer) {
        int i10;
        boolean z11 = z10;
        MediaExtractor mediaExtractor = new MediaExtractor();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        try {
            mediaExtractor.setDataSource(file.getAbsolutePath());
            int d = d(mediaExtractor, z11);
            if (d >= 0) {
                mediaExtractor.selectTrack(d);
                if (z11) {
                    i10 = 1;
                } else {
                    i10 = 2;
                }
                mediaExtractor.seekTo(j3, i10);
                while (mediaExtractor.getSampleTime() >= 0 && mediaExtractor.getSampleTime() < j3) {
                    mediaExtractor.advance();
                }
                while (mediaExtractor.getSampleTime() >= 0 && mediaExtractor.getSampleTime() < j10) {
                    byteBuffer.clear();
                    int readSampleData = mediaExtractor.readSampleData(byteBuffer, 0);
                    if (readSampleData >= 0) {
                        bufferInfo.set(0, readSampleData, mediaExtractor.getSampleTime(), mediaExtractor.getSampleFlags());
                        qVar.g(z11, byteBuffer, bufferInfo, -j3);
                        mediaExtractor.advance();
                        z11 = z10;
                    }
                }
                return;
            }
            throw new IOException("Source track disappeared");
        } finally {
            mediaExtractor.release();
        }
    }

    public static void c(File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.setLength(0L);
            randomAccessFile.close();
        } catch (IOException unused) {
        }
        if (file.exists()) {
            file.delete();
        }
    }

    public static int d(MediaExtractor mediaExtractor, boolean z10) {
        String str;
        if (z10) {
            str = "video/";
        } else {
            str = "audio/";
        }
        for (int i10 = 0; i10 < mediaExtractor.getTrackCount(); i10++) {
            String string = mediaExtractor.getTrackFormat(i10).getString("mime");
            if (string != null && string.startsWith(str)) {
                return i10;
            }
        }
        return -1;
    }

    public static long e(File file) {
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            mediaExtractor.setDataSource(file.getAbsolutePath());
            long j3 = 0;
            for (int i10 = 0; i10 < mediaExtractor.getTrackCount(); i10++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i10);
                if (trackFormat.containsKey("durationUs")) {
                    j3 = Math.max(j3, trackFormat.getLong("durationUs"));
                }
            }
            return j3;
        } finally {
            mediaExtractor.release();
        }
    }
}
