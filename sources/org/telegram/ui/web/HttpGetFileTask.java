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
import lh.z7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

public class HttpGetFileTask extends AsyncTask<String, Void, File> {
    private Utilities.Callback<File> doneCallback;
    private Exception exception;
    private File file;
    private long max_size = -1;
    private String overrideExt;
    private Utilities.Callback<Float> progressCallback;

    public HttpGetFileTask(Utilities.Callback<File> callback, Utilities.Callback<Float> callback2) {
        this.doneCallback = callback;
        this.progressCallback = callback2;
    }

    public void lambda$doInBackground$0(float f10) {
        this.progressCallback.run(Float.valueOf(f10));
    }

    public void lambda$doInBackground$1() {
        this.progressCallback.run(Float.valueOf(1.0f));
    }

    public HttpGetFileTask setDestFile(File file) {
        this.file = file;
        return this;
    }

    public HttpGetFileTask setMaxSize(long j10) {
        this.max_size = j10;
        return this;
    }

    public HttpGetFileTask setOverrideExtension(String str) {
        this.overrideExt = str;
        return this;
    }

    @Override
    public File doInBackground(String... strArr) throws Throwable {
        long j10;
        long contentLength;
        int i10;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        FileChannel channel;
        byte[] bArr;
        int i11;
        float fClamp01;
        String extensionFromMimeType;
        int i12;
        String str = strArr[0];
        long j11 = 0;
        long j12 = 0;
        int i13 = 0;
        while (true) {
            if (i13 >= 5) {
                this.exception = new RuntimeException("too many retries");
                return null;
            }
            boolean z10 = i13 > 0;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setRequestMethod("GET");
                if (z10) {
                    httpURLConnection.setRequestProperty("Range", "bytes=" + j12 + "-");
                }
                httpURLConnection.setDoInput(true);
                int responseCode = httpURLConnection.getResponseCode();
                InputStream errorStream = (responseCode < 200 || responseCode >= 300) ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
                int responseCode2 = httpURLConnection.getResponseCode();
                j12 = j12;
                if (!z10 || responseCode2 == 206) {
                    j12 = j12;
                    if (Build.VERSION.SDK_INT >= 24) {
                        contentLength = httpURLConnection.getContentLengthLong();
                    } else {
                        contentLength = httpURLConnection.getContentLength();
                    }
                    long j13 = this.max_size;
                    i10 = (j13 > j11 ? 1 : (j13 == j11 ? 0 : -1));
                    j10 = i10;
                    if (i10 > 0 || contentLength <= j13) {
                        j10 = i12;
                        if (this.file == null) {
                            extensionFromMimeType = this.overrideExt;
                            if (extensionFromMimeType == null) {
                                extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(httpURLConnection.getContentType());
                            }
                            this.file = z7.w(UserConfig.selectedAccount, extensionFromMimeType);
                        }
                        bufferedInputStream = new BufferedInputStream(errorStream, 16384);
                        try {
                            try {
                                fileOutputStream = new FileOutputStream(this.file, z10);
                                try {
                                    try {
                                        channel = fileOutputStream.getChannel();
                                        try {
                                            bArr = new byte[16384];
                                            j11 = j11;
                                            j12 = j12;
                                            while (true) {
                                                i11 = bufferedInputStream.read(bArr);
                                                j10 = j11;
                                                if (i11 == -1) {
                                                    if (this.progressCallback != null) {
                                                        AndroidUtilities.runOnUIThread(new nh.f0(this, 25));
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
                                                    channel.write(ByteBuffer.wrap(bArr, 0, i11));
                                                    j12 += (long) i11;
                                                    if (isCancelled()) {
                                                        try {
                                                            this.file.delete();
                                                            break;
                                                        } catch (Exception e9) {
                                                            FileLog.e(e9);
                                                        }
                                                    } else {
                                                        if (contentLength > j10) {
                                                            fClamp01 = Utilities.clamp01(j12 / contentLength);
                                                            if (this.progressCallback != null) {
                                                                AndroidUtilities.runOnUIThread(new org.telegram.ui.e0(this, fClamp01, 5));
                                                            }
                                                        }
                                                        j11 = j10;
                                                        j12 = j12;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    Throwable th4 = th;
                                                    if (channel == null) {
                                                        throw th4;
                                                    }
                                                    try {
                                                        channel.close();
                                                        throw th4;
                                                    } catch (Throwable th5) {
                                                        th4.addSuppressed(th5);
                                                        throw th4;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            j10 = j11;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        th2 = th;
                                        try {
                                            fileOutputStream.close();
                                            throw th2;
                                        } catch (Throwable th8) {
                                            th2.addSuppressed(th8);
                                            throw th2;
                                        }
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    j10 = j11;
                                    th2 = th;
                                    fileOutputStream.close();
                                    throw th2;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                th = th;
                                try {
                                    try {
                                        bufferedInputStream.close();
                                        throw th;
                                    } catch (Throwable th11) {
                                        th.addSuppressed(th11);
                                        throw th;
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                }
                            }
                        } catch (Throwable th12) {
                            th = th12;
                            j10 = j11;
                            th = th;
                            bufferedInputStream.close();
                            throw th;
                        }
                    } else {
                        errorStream.close();
                        if (this.file != null) {
                            j10 = i12;
                            this.file = null;
                        } else {
                            j10 = i12;
                        }
                    }
                    return null;
                }
                j12 = j12;
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
                    j12 = j11;
                    z10 = false;
                    j12 = j12;
                    if (Build.VERSION.SDK_INT >= 24) {
                        contentLength = httpURLConnection.getContentLengthLong();
                    } else {
                        contentLength = httpURLConnection.getContentLength();
                    }
                    long j14 = this.max_size;
                    i10 = (j14 > j11 ? 1 : (j14 == j11 ? 0 : -1));
                    j10 = i10;
                    if (i10 > 0) {
                        j10 = i12;
                        if (this.file == null) {
                            extensionFromMimeType = this.overrideExt;
                            if (extensionFromMimeType == null) {
                                extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(httpURLConnection.getContentType());
                            }
                            this.file = z7.w(UserConfig.selectedAccount, extensionFromMimeType);
                        }
                        bufferedInputStream = new BufferedInputStream(errorStream, 16384);
                        fileOutputStream = new FileOutputStream(this.file, z10);
                        channel = fileOutputStream.getChannel();
                        bArr = new byte[16384];
                        j11 = j11;
                        j12 = j12;
                        while (true) {
                            i11 = bufferedInputStream.read(bArr);
                            j10 = j11;
                            if (i11 == -1) {
                                if (this.progressCallback != null) {
                                    AndroidUtilities.runOnUIThread(new nh.f0(this, 25));
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
                            channel.write(ByteBuffer.wrap(bArr, 0, i11));
                            j12 += (long) i11;
                            if (isCancelled()) {
                                this.file.delete();
                                break;
                                break;
                            }
                            if (contentLength > j10) {
                                fClamp01 = Utilities.clamp01(j12 / contentLength);
                                if (this.progressCallback != null) {
                                    AndroidUtilities.runOnUIThread(new org.telegram.ui.e0(this, fClamp01, 5));
                                }
                            }
                            j11 = j10;
                            j12 = j12;
                        }
                    } else {
                        j10 = i12;
                        if (this.file == null) {
                            extensionFromMimeType = this.overrideExt;
                            if (extensionFromMimeType == null) {
                                extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(httpURLConnection.getContentType());
                            }
                            this.file = z7.w(UserConfig.selectedAccount, extensionFromMimeType);
                        }
                        bufferedInputStream = new BufferedInputStream(errorStream, 16384);
                        fileOutputStream = new FileOutputStream(this.file, z10);
                        channel = fileOutputStream.getChannel();
                        bArr = new byte[16384];
                        j11 = j11;
                        j12 = j12;
                        while (true) {
                            i11 = bufferedInputStream.read(bArr);
                            j10 = j11;
                            if (i11 == -1) {
                                if (this.progressCallback != null) {
                                    AndroidUtilities.runOnUIThread(new nh.f0(this, 25));
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
                            channel.write(ByteBuffer.wrap(bArr, 0, i11));
                            j12 += (long) i11;
                            if (isCancelled()) {
                                this.file.delete();
                                break;
                                break;
                            }
                            if (contentLength > j10) {
                                fClamp01 = Utilities.clamp01(j12 / contentLength);
                                if (this.progressCallback != null) {
                                    AndroidUtilities.runOnUIThread(new org.telegram.ui.e0(this, fClamp01, 5));
                                }
                            }
                            j11 = j10;
                            j12 = j12;
                        }
                    }
                    return null;
                } catch (Exception e11) {
                    e = e11;
                    j12 = j11;
                    j10 = j12;
                }
            } catch (Exception e12) {
                e = e12;
                j10 = j11;
            }
            if (!(e instanceof ProtocolException)) {
                this.exception = e;
                FileLog.e(e);
                return null;
            }
            FileLog.d("got unexpected end of stream, lets try to resume");
            i13++;
            j11 = j10;
            j12 = j12;
        }
        channel.close();
        fileOutputStream.close();
        bufferedInputStream.close();
        return null;
    }

    @Override
    public void onPostExecute(File file) {
        Utilities.Callback<File> callback = this.doneCallback;
        if (callback != null) {
            if (this.exception == null) {
                callback.run(file);
            } else {
                callback.run(null);
            }
        }
    }
}
