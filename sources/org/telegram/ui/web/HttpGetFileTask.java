package org.telegram.ui.web;

import android.os.AsyncTask;
import android.webkit.MimeTypeMap;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Stories.recorder.StoryEntry;
public class HttpGetFileTask extends AsyncTask<String, Void, File> {
    private Utilities.Callback<File> callback;
    private Exception exception;

    public HttpGetFileTask(Utilities.Callback<File> callback) {
        this.callback = callback;
    }

    @Override
    public File doInBackground(String... strArr) {
        InputStream errorStream;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strArr[0]).openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setDoInput(true);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode >= 200 && responseCode < 300) {
                errorStream = httpURLConnection.getInputStream();
            } else {
                errorStream = httpURLConnection.getErrorStream();
            }
            File makeCacheFile = StoryEntry.makeCacheFile(UserConfig.selectedAccount, MimeTypeMap.getSingleton().getExtensionFromMimeType(httpURLConnection.getContentType()));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(makeCacheFile));
            byte[] bArr = new byte[1024];
            while (true) {
                int read = errorStream.read(bArr);
                if (read != -1) {
                    bufferedOutputStream.write(bArr, 0, read);
                } else {
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                    errorStream.close();
                    return makeCacheFile;
                }
            }
        } catch (Exception e) {
            this.exception = e;
            return null;
        }
    }

    @Override
    public void onPostExecute(File file) {
        Utilities.Callback<File> callback = this.callback;
        if (callback != null) {
            if (this.exception == null) {
                callback.run(file);
            } else {
                callback.run(null);
            }
        }
    }
}
