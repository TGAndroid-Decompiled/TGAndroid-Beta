package org.telegram.ui.web;

import android.os.AsyncTask;
import android.os.Build;
import android.webkit.MimeTypeMap;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BetaUpdaterController$$ExternalSyntheticLambda2;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer$6$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.VoIPFragment$8$$ExternalSyntheticLambda1;

public final class HttpGetFileTask extends AsyncTask {
    public final Utilities.Callback doneCallback;
    public Exception exception;
    public File file;
    public long max_size = -1;
    public String overrideExt;
    public final BetaUpdaterController$$ExternalSyntheticLambda2 progressCallback;

    public HttpGetFileTask(Utilities.Callback callback, BetaUpdaterController$$ExternalSyntheticLambda2 betaUpdaterController$$ExternalSyntheticLambda2) {
        this.doneCallback = callback;
        this.progressCallback = betaUpdaterController$$ExternalSyntheticLambda2;
    }

    @Override
    public final Object doInBackground(Object[] objArr) throws Throwable {
        long j;
        long j2;
        String str;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        FileChannel channel;
        Throwable th3;
        int i;
        int i2 = 0;
        String str2 = ((String[]) objArr)[0];
        long j3 = 0;
        long j4 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= 5) {
                this.exception = new RuntimeException("too many retries");
                return null;
            }
            boolean z = i3 > 0;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
                httpURLConnection.setRequestMethod("GET");
                if (z) {
                    httpURLConnection.setRequestProperty("Range", "bytes=" + j4 + "-");
                }
                httpURLConnection.setDoInput(true);
                int responseCode = httpURLConnection.getResponseCode();
                InputStream errorStream = (responseCode < 200 || responseCode >= 300) ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
                int responseCode2 = httpURLConnection.getResponseCode();
                j2 = j4;
                if (z && responseCode2 != 206) {
                    j2 = j4;
                    FileLog.d("failed to resume, server doesn't support partial content. downloading from the beginning");
                    try {
                        File file = this.file;
                        if (file != null) {
                            try {
                                file.delete();
                            } catch (Exception unused) {
                            }
                            this.file = null;
                        }
                        j2 = j3;
                        z = false;
                    } catch (Exception e) {
                        e = e;
                        long j5 = j3;
                        j = j5;
                        j2 = j5;
                        str = str2;
                        if (e instanceof ProtocolException) {
                            this.exception = e;
                            FileLog.e(e);
                            return null;
                        }
                        FileLog.d("got unexpected end of stream, lets try to resume");
                        i3++;
                        str2 = str;
                        j3 = j;
                        i2 = 0;
                        j4 = j2;
                    }
                }
                j2 = j4;
                long contentLengthLong = Build.VERSION.SDK_INT >= 24 ? httpURLConnection.getContentLengthLong() : httpURLConnection.getContentLength();
                long j6 = this.max_size;
                int i4 = (j6 > j3 ? 1 : (j6 == j3 ? 0 : -1));
                j = i4;
                if (i4 > 0 && contentLengthLong > j6) {
                    j = i;
                    errorStream.close();
                    if (this.file == null) {
                        return null;
                    }
                    this.file = null;
                    return null;
                }
                j = i;
                if (this.file == null) {
                    String extensionFromMimeType = this.overrideExt;
                    if (extensionFromMimeType == null) {
                        extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(httpURLConnection.getContentType());
                    }
                    this.file = StoryEntry.makeCacheFile(UserConfig.selectedAccount, extensionFromMimeType);
                }
                try {
                    bufferedInputStream = new BufferedInputStream(errorStream, 16384);
                    try {
                        try {
                            fileOutputStream = new FileOutputStream(this.file, z);
                            try {
                                try {
                                    channel = fileOutputStream.getChannel();
                                    try {
                                        byte[] bArr = new byte[16384];
                                        j3 = j3;
                                        j2 = j2;
                                        while (true) {
                                            int i5 = bufferedInputStream.read(bArr);
                                            j = j3;
                                            BetaUpdaterController$$ExternalSyntheticLambda2 betaUpdaterController$$ExternalSyntheticLambda2 = this.progressCallback;
                                            if (i5 == -1) {
                                                if (betaUpdaterController$$ExternalSyntheticLambda2 != null) {
                                                    AndroidUtilities.runOnUIThread(new VoIPFragment$8$$ExternalSyntheticLambda1(this, 24));
                                                }
                                                if (channel != null) {
                                                    channel.close();
                                                }
                                                fileOutputStream.close();
                                                bufferedInputStream.close();
                                                if (isCancelled()) {
                                                    return null;
                                                }
                                                return this.file;
                                            }
                                            try {
                                                channel.write(ByteBuffer.wrap(bArr, i2, i5));
                                                str = str2;
                                                j2 += (long) i5;
                                                try {
                                                    if (isCancelled()) {
                                                        try {
                                                            this.file.delete();
                                                            break;
                                                        } catch (Exception e2) {
                                                            FileLog.e(e2);
                                                        }
                                                    } else {
                                                        if (contentLengthLong > j) {
                                                            float fClamp01 = Utilities.clamp01(j2 / contentLengthLong);
                                                            if (betaUpdaterController$$ExternalSyntheticLambda2 != null) {
                                                                AndroidUtilities.runOnUIThread(new PhotoViewer$6$$ExternalSyntheticLambda0(this, fClamp01, 5));
                                                            }
                                                        }
                                                        str2 = str;
                                                        j3 = j;
                                                        i2 = 0;
                                                        j2 = j2;
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    th3 = th;
                                                    if (channel != null) {
                                                        throw th3;
                                                    }
                                                    try {
                                                        channel.close();
                                                        throw th3;
                                                    } catch (Throwable th5) {
                                                        th3.addSuppressed(th5);
                                                        throw th3;
                                                    }
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                str = str2;
                                                th3 = th;
                                                if (channel != null) {
                                                    throw th3;
                                                }
                                                channel.close();
                                                throw th3;
                                            }
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        j = j3;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    j = j3;
                                    str = str2;
                                    th2 = th;
                                    try {
                                        fileOutputStream.close();
                                        throw th2;
                                    } catch (Throwable th9) {
                                        th2.addSuppressed(th9);
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                th2 = th;
                                fileOutputStream.close();
                                throw th2;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            th = th;
                            try {
                                bufferedInputStream.close();
                                throw th;
                            } catch (Throwable th12) {
                                th.addSuppressed(th12);
                                throw th;
                            }
                        }
                    } catch (Throwable th13) {
                        th = th13;
                        j = j3;
                        str = str2;
                        th = th;
                        bufferedInputStream.close();
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    if (e instanceof ProtocolException) {
                        this.exception = e;
                        FileLog.e(e);
                        return null;
                    }
                    FileLog.d("got unexpected end of stream, lets try to resume");
                    i3++;
                    str2 = str;
                    j3 = j;
                    i2 = 0;
                    j4 = j2;
                }
            } catch (Exception e4) {
                e = e4;
                j = j3;
                j2 = j4;
            }
            FileLog.d("got unexpected end of stream, lets try to resume");
            i3++;
            str2 = str;
            j3 = j;
            i2 = 0;
            j4 = j2;
        }
        channel.close();
        fileOutputStream.close();
        bufferedInputStream.close();
        return null;
    }

    @Override
    public final void onPostExecute(Object obj) {
        File file = (File) obj;
        Utilities.Callback callback = this.doneCallback;
        if (callback != null) {
            if (this.exception == null) {
                callback.run(file);
            } else {
                callback.run(null);
            }
        }
    }
}
