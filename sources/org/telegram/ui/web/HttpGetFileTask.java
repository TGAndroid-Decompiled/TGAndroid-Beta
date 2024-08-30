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

public class HttpGetFileTask extends AsyncTask {
    private Utilities.Callback callback;
    private Exception exception;

    public HttpGetFileTask(Utilities.Callback callback) {
        this.callback = callback;
    }

    @Override
    public File doInBackground(String... strArr) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strArr[0]).openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setDoInput(true);
            int responseCode = httpURLConnection.getResponseCode();
            InputStream errorStream = (responseCode < 200 || responseCode >= 300) ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
            File makeCacheFile = StoryEntry.makeCacheFile(UserConfig.selectedAccount, MimeTypeMap.getSingleton().getExtensionFromMimeType(httpURLConnection.getContentType()));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(makeCacheFile));
            byte[] bArr = new byte[1024];
            while (true) {
                int read = errorStream.read(bArr);
                if (read == -1) {
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                    errorStream.close();
                    return makeCacheFile;
                }
                bufferedOutputStream.write(bArr, 0, read);
            }
        } catch (Exception e) {
            this.exception = e;
            return null;
        }
    }

    @Override
    public void onPostExecute(File file) {
        Utilities.Callback callback = this.callback;
        if (callback != null) {
            if (this.exception != null) {
                file = null;
            }
            callback.run(file);
        }
    }
}
