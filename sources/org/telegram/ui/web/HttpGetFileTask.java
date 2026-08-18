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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Stories.recorder.StoryEntry;

public class HttpGetFileTask extends AsyncTask {
    private Utilities.Callback doneCallback;
    private Exception exception;
    private File file;
    private long max_size = -1;
    private String overrideExt;
    private Utilities.Callback progressCallback;

    public HttpGetFileTask(Utilities.Callback callback, Utilities.Callback callback2) {
        this.doneCallback = callback;
        this.progressCallback = callback2;
    }

    public HttpGetFileTask setOverrideExtension(String str) {
        this.overrideExt = str;
        return this;
    }

    public HttpGetFileTask setDestFile(File file) {
        this.file = file;
        return this;
    }

    public HttpGetFileTask setMaxSize(long j) {
        this.max_size = j;
        return this;
    }

    @Override
    public File doInBackground(String... strArr) throws Throwable {
        InputStream errorStream;
        long contentLength;
        long j;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        FileChannel channel;
        Throwable th3;
        byte[] bArr;
        int i;
        final float fClamp01;
        String extensionFromMimeType;
        int i2 = 0;
        String str = strArr[0];
        long j2 = 0;
        long j3 = 0;
        int i3 = 0;
        while (true) {
            if (i3 < 5) {
                boolean z = i3 > 0;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                    httpURLConnection.setRequestMethod("GET");
                    if (z) {
                        httpURLConnection.setRequestProperty("Range", "bytes=" + j3 + "-");
                    }
                    httpURLConnection.setDoInput(true);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode >= 200 && responseCode < 300) {
                        errorStream = httpURLConnection.getInputStream();
                    } else {
                        errorStream = httpURLConnection.getErrorStream();
                    }
                    int responseCode2 = httpURLConnection.getResponseCode();
                    if (z && responseCode2 != 206) {
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
                            j3 = j2;
                            z = false;
                            if (Build.VERSION.SDK_INT >= 24) {
                                contentLength = httpURLConnection.getContentLengthLong();
                            } else {
                                contentLength = httpURLConnection.getContentLength();
                            }
                            j = this.max_size;
                            if (j <= j2) {
                            }
                            if (this.file == null) {
                                extensionFromMimeType = this.overrideExt;
                                if (extensionFromMimeType != null) {
                                    extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(httpURLConnection.getContentType());
                                }
                                this.file = StoryEntry.makeCacheFile(UserConfig.selectedAccount, extensionFromMimeType);
                            }
                            bufferedInputStream = new BufferedInputStream(errorStream, 16384);
                            fileOutputStream = new FileOutputStream(this.file, z);
                            channel = fileOutputStream.getChannel();
                            bArr = new byte[16384];
                            while (true) {
                                i = bufferedInputStream.read(bArr);
                                if (i != -1) {
                                    channel.write(ByteBuffer.wrap(bArr, i2, i));
                                    j3 += (long) i;
                                    if (isCancelled()) {
                                        this.file.delete();
                                        channel.close();
                                        fileOutputStream.close();
                                        bufferedInputStream.close();
                                        return null;
                                    }
                                    if (contentLength > 0) {
                                        fClamp01 = Utilities.clamp01(j3 / contentLength);
                                        if (this.progressCallback != null) {
                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                @Override
                                                public final void run() {
                                                    this.f$0.lambda$doInBackground$0(fClamp01);
                                                }
                                            });
                                        }
                                    }
                                    i2 = 0;
                                    fileOutputStream.close();
                                    throw th2;
                                }
                                j2 = 0;
                                if (this.progressCallback != null) {
                                    break;
                                    break;
                                }
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        this.f$0.lambda$doInBackground$1();
                                    }
                                });
                                break;
                                break;
                                th3 = th;
                                if (channel == null) {
                                    throw th3;
                                }
                                channel.close();
                                throw th3;
                            }
                        } catch (Exception e) {
                            e = e;
                            j3 = j2;
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 24) {
                            contentLength = httpURLConnection.getContentLengthLong();
                        } else {
                            contentLength = httpURLConnection.getContentLength();
                        }
                        j = this.max_size;
                        if (j <= j2 && contentLength > j) {
                            errorStream.close();
                            if (this.file != null) {
                                this.file = null;
                            }
                            return null;
                        }
                        if (this.file == null) {
                            extensionFromMimeType = this.overrideExt;
                            if (extensionFromMimeType != null) {
                                extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(httpURLConnection.getContentType());
                            }
                            this.file = StoryEntry.makeCacheFile(UserConfig.selectedAccount, extensionFromMimeType);
                        }
                        bufferedInputStream = new BufferedInputStream(errorStream, 16384);
                        try {
                            fileOutputStream = new FileOutputStream(this.file, z);
                            try {
                                channel = fileOutputStream.getChannel();
                                try {
                                    bArr = new byte[16384];
                                    while (true) {
                                        i = bufferedInputStream.read(bArr);
                                        if (i != -1) {
                                            try {
                                                channel.write(ByteBuffer.wrap(bArr, i2, i));
                                                j3 += (long) i;
                                                try {
                                                    if (isCancelled()) {
                                                        try {
                                                            this.file.delete();
                                                        } catch (Exception e2) {
                                                            FileLog.e(e2);
                                                        }
                                                        try {
                                                            channel.close();
                                                            try {
                                                                fileOutputStream.close();
                                                                try {
                                                                    bufferedInputStream.close();
                                                                    return null;
                                                                } catch (Exception e3) {
                                                                    e = e3;
                                                                    j2 = 0;
                                                                }
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                j2 = 0;
                                                                try {
                                                                    bufferedInputStream.close();
                                                                    throw th;
                                                                } catch (Throwable th5) {
                                                                    th.addSuppressed(th5);
                                                                    throw th;
                                                                }
                                                            }
                                                        } catch (Throwable th6) {
                                                            th2 = th6;
                                                            j2 = 0;
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        }
                                                    } else {
                                                        if (contentLength > 0) {
                                                            fClamp01 = Utilities.clamp01(j3 / contentLength);
                                                            if (this.progressCallback != null) {
                                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                                    @Override
                                                                    public final void run() {
                                                                        this.f$0.lambda$doInBackground$0(fClamp01);
                                                                    }
                                                                });
                                                            }
                                                        }
                                                        i2 = 0;
                                                    }
                                                } catch (Throwable th7) {
                                                    th3 = th7;
                                                    j2 = 0;
                                                    if (channel == null) {
                                                        throw th3;
                                                    }
                                                    try {
                                                        channel.close();
                                                        throw th3;
                                                    } catch (Throwable th8) {
                                                        th3.addSuppressed(th8);
                                                        throw th3;
                                                    }
                                                }
                                            } catch (Throwable th9) {
                                                th = th9;
                                                j2 = 0;
                                                th3 = th;
                                            }
                                            try {
                                                fileOutputStream.close();
                                                throw th2;
                                            } catch (Throwable th10) {
                                                th2.addSuppressed(th10);
                                                throw th2;
                                            }
                                        }
                                        j2 = 0;
                                        if (this.progressCallback != null) {
                                            break;
                                        }
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                this.f$0.lambda$doInBackground$1();
                                            }
                                        });
                                        break;
                                        th3 = th;
                                        if (channel == null) {
                                            throw th3;
                                        }
                                        channel.close();
                                        throw th3;
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                }
                            } catch (Throwable th12) {
                                th2 = th12;
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            bufferedInputStream.close();
                            throw th;
                        }
                    }
                } catch (Exception e4) {
                    e = e4;
                }
                if (e instanceof ProtocolException) {
                    FileLog.d("got unexpected end of stream, lets try to resume");
                    i3++;
                    i2 = 0;
                } else {
                    this.exception = e;
                    FileLog.e(e);
                    return null;
                }
            } else {
                this.exception = new RuntimeException("too many retries");
                return null;
            }
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

    public void lambda$doInBackground$0(float f) {
        this.progressCallback.run(Float.valueOf(f));
    }

    public void lambda$doInBackground$1() {
        this.progressCallback.run(Float.valueOf(1.0f));
    }

    @Override
    public void onPostExecute(File file) {
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
