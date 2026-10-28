package w7;

import a8.lg;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
public abstract class x {
    public static k2.t0 a(File file, vi.w wVar, long j10, long j11, boolean z10, a3.l lVar) {
        MediaFormat mediaFormat;
        long j12;
        long j13;
        String str;
        MediaFormat mediaFormat2;
        boolean z11;
        vi.w wVar2 = wVar;
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
                int i10 = lVar.f141c;
                synchronized (wVar) {
                    wVar2.f50677s = i10;
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
                            s4.d dVar = new s4.d(6);
                            j13 = 0;
                            y.c(file, j15, max, min, lVar.f139a, lVar.f140b, lVar.f141c, dVar);
                            if (((MediaFormat) dVar.f47756c) != null && !((ArrayList) dVar.d).isEmpty()) {
                                boolean m10 = vi.w.m(trackFormat, (MediaFormat) dVar.f47756c, "csd-0", "csd-1");
                                if (min >= max2) {
                                    if (m10) {
                                        mediaFormat2 = trackFormat;
                                    } else {
                                        mediaFormat2 = (MediaFormat) dVar.f47756c;
                                    }
                                    wVar2.n(mediaFormat2, true);
                                    e(wVar2, dVar, max);
                                    str = "reencode-range-in-gop";
                                    max = max;
                                } else if (m10) {
                                    wVar2.n(trackFormat, true);
                                    e(wVar2, dVar, max);
                                    b(file, wVar2, j16, max, max2);
                                    max = max;
                                    str = "reencode-head";
                                } else {
                                    max = max;
                                    y.c(file, j15, max, max2, lVar.f139a, lVar.f140b, lVar.f141c, new lg(wVar2, max, 9));
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
                        obj.f16275a = max / 1000;
                        obj.f16276b = h;
                        obj.f16277c = str;
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

    public static void b(File file, vi.w wVar, long j10, long j11, long j12) {
        ByteBuffer byteBuffer;
        MediaCodec.BufferInfo bufferInfo;
        vi.w wVar2;
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
        for (int i10 = 0; i10 < mediaExtractor.getTrackCount(); i10++) {
            String string = mediaExtractor.getTrackFormat(i10).getString("mime");
            if (string != null && string.startsWith(str)) {
                return i10;
            }
        }
        return -1;
    }

    public static void e(vi.w wVar, s4.d dVar, long j10) {
        ArrayList arrayList = (ArrayList) dVar.d;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            wVar.q(true, (ByteBuffer) arrayList.get(i10), (MediaCodec.BufferInfo) ((ArrayList) dVar.f47755b).get(i10), -j10);
        }
    }
}
