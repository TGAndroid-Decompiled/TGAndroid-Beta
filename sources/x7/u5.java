package x7;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import b8.ig;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
public abstract class u5 {
    public static m2.r0 a(File file, wi.w wVar, long j10, long j11, boolean z10, a7.d dVar) {
        MediaFormat mediaFormat;
        long j12;
        long j13;
        String str;
        MediaFormat mediaFormat2;
        boolean z11;
        wi.w wVar2 = wVar;
        long max = Math.max(0L, j10 * 1000);
        long max2 = Math.max(max, j11 * 1000);
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            mediaExtractor.setDataSource(file.getAbsolutePath());
            int d = d(mediaExtractor, true);
            int d10 = d(mediaExtractor, false);
            if (d >= 0 && (!z10 || d10 >= 0)) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(d);
                if (z10) {
                    mediaFormat = mediaExtractor.getTrackFormat(d10);
                } else {
                    mediaFormat = null;
                }
                mediaExtractor.release();
                int i3 = dVar.f140c;
                synchronized (wVar) {
                    wVar2.f58115s = i3;
                }
                if (mediaFormat != null) {
                    wVar2.n(mediaFormat, false);
                }
                mediaExtractor = new MediaExtractor();
                try {
                    mediaExtractor.setDataSource(file.getAbsolutePath());
                    int d11 = d(mediaExtractor, true);
                    long j14 = Long.MAX_VALUE;
                    if (d11 >= 0) {
                        mediaExtractor.selectTrack(d11);
                        j12 = Long.MIN_VALUE;
                        while (true) {
                            if (mediaExtractor.getSampleTime() < 0) {
                                break;
                            }
                            long sampleTime = mediaExtractor.getSampleTime();
                            if ((mediaExtractor.getSampleFlags() & 1) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (sampleTime >= max2) {
                                break;
                            }
                            if (z11) {
                                if (sampleTime <= max) {
                                    j12 = sampleTime;
                                } else {
                                    j14 = sampleTime;
                                    break;
                                }
                            }
                            mediaExtractor.advance();
                        }
                    } else {
                        j12 = Long.MIN_VALUE;
                    }
                    mediaExtractor.release();
                    long[] jArr = {j12, j14};
                    long j15 = jArr[0];
                    long j16 = jArr[1];
                    if (j15 != Long.MIN_VALUE) {
                        if (j15 == max) {
                            wVar2.n(trackFormat, true);
                            b(file, wVar2, max, max, max2);
                            str = "copy";
                            j13 = 0;
                        } else {
                            long min = Math.min(j16, max2);
                            p7.d dVar2 = new p7.d(19);
                            j13 = 0;
                            v5.c(file, j15, max, min, dVar.f138a, dVar.f139b, dVar.f140c, dVar2);
                            if (((MediaFormat) dVar2.f53346c) != null && !((ArrayList) dVar2.f53345b).isEmpty()) {
                                boolean m10 = wi.w.m(trackFormat, (MediaFormat) dVar2.f53346c, "csd-0", "csd-1");
                                if (min >= max2) {
                                    if (m10) {
                                        mediaFormat2 = trackFormat;
                                    } else {
                                        mediaFormat2 = (MediaFormat) dVar2.f53346c;
                                    }
                                    wVar2.n(mediaFormat2, true);
                                    e(wVar2, dVar2, max);
                                    str = "reencode-range-in-gop";
                                    max = max;
                                } else if (m10) {
                                    wVar2.n(trackFormat, true);
                                    e(wVar2, dVar2, max);
                                    b(file, wVar2, j16, max, max2);
                                    max = max;
                                    str = "reencode-head";
                                } else {
                                    max = max;
                                    v5.c(file, j15, max, max2, dVar.f138a, dVar.f139b, dVar.f140c, new ig(wVar2, max, 9));
                                    str = "reencode-all";
                                }
                            } else {
                                throw new IOException("Re-encoded trim start produced no frames");
                            }
                        }
                        if (z10) {
                            mediaExtractor = new MediaExtractor();
                            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(2097152);
                            try {
                                mediaExtractor.setDataSource(file.getAbsolutePath());
                                int d12 = d(mediaExtractor, false);
                                if (d12 >= 0) {
                                    mediaExtractor.selectTrack(d12);
                                    mediaExtractor.seekTo(max, 2);
                                    while (mediaExtractor.getSampleTime() >= j13 && mediaExtractor.getSampleTime() < max) {
                                        mediaExtractor.advance();
                                    }
                                    while (mediaExtractor.getSampleTime() >= j13 && mediaExtractor.getSampleTime() < max2) {
                                        allocateDirect.clear();
                                        int readSampleData = mediaExtractor.readSampleData(allocateDirect, 0);
                                        if (readSampleData >= 0) {
                                            bufferInfo.set(0, readSampleData, mediaExtractor.getSampleTime(), mediaExtractor.getSampleFlags());
                                            ByteBuffer byteBuffer = allocateDirect;
                                            wVar2.q(false, byteBuffer, bufferInfo, -max);
                                            mediaExtractor.advance();
                                            allocateDirect = byteBuffer;
                                            wVar2 = wVar;
                                        }
                                    }
                                } else {
                                    throw new IOException("Source track disappeared");
                                }
                            } finally {
                            }
                        }
                        long h = wVar.h();
                        ?? obj = new Object();
                        obj.f18973a = max / 1000;
                        obj.f18974b = h;
                        obj.f18975c = str;
                        return obj;
                    }
                    throw new IOException("Trim range has no video sync sample");
                } finally {
                }
            }
            throw new IOException("Source file has no required tracks");
        } finally {
        }
    }

    public static void b(File file, wi.w wVar, long j10, long j11, long j12) {
        ByteBuffer byteBuffer;
        MediaCodec.BufferInfo bufferInfo;
        wi.w wVar2;
        MediaExtractor mediaExtractor = new MediaExtractor();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(2097152);
        try {
            mediaExtractor.setDataSource(file.getAbsolutePath());
            int d = d(mediaExtractor, true);
            if (d >= 0) {
                mediaExtractor.selectTrack(d);
                mediaExtractor.seekTo(j10, 0);
                while (mediaExtractor.getSampleTime() >= 0) {
                    long sampleTime = mediaExtractor.getSampleTime();
                    if (sampleTime < j12) {
                        if (sampleTime >= j10) {
                            allocateDirect.clear();
                            int readSampleData = mediaExtractor.readSampleData(allocateDirect, 0);
                            if (readSampleData < 0) {
                                break;
                            }
                            bufferInfo2.set(0, readSampleData, sampleTime, mediaExtractor.getSampleFlags());
                            byteBuffer = allocateDirect;
                            bufferInfo = bufferInfo2;
                            wVar2 = wVar;
                            wVar2.q(true, byteBuffer, bufferInfo, -j11);
                        } else {
                            byteBuffer = allocateDirect;
                            bufferInfo = bufferInfo2;
                            wVar2 = wVar;
                        }
                        mediaExtractor.advance();
                        wVar = wVar2;
                        allocateDirect = byteBuffer;
                        bufferInfo2 = bufferInfo;
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
        for (int i3 = 0; i3 < mediaExtractor.getTrackCount(); i3++) {
            String string = mediaExtractor.getTrackFormat(i3).getString("mime");
            if (string != null && string.startsWith(str)) {
                return i3;
            }
        }
        return -1;
    }

    public static void e(wi.w wVar, p7.d dVar, long j10) {
        ArrayList arrayList = (ArrayList) dVar.f53345b;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            wVar.q(true, (ByteBuffer) arrayList.get(i3), (MediaCodec.BufferInfo) ((ArrayList) dVar.d).get(i3), -j10);
        }
    }
}
