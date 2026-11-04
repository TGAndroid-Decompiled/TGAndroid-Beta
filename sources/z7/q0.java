package z7;

import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
public final class q0 {
    public Object f60010a;
    public Object f60011b;
    public Object f60012c;

    public q0(Object obj, Object obj2, Object obj3) {
        this.f60011b = obj3;
        this.f60012c = obj;
        this.f60010a = obj2;
    }

    public static Object a(Task task) {
        try {
            return Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e10) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e10);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e11);
            }
            throw ((IOException) cause);
        }
    }

    public static boolean c() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            if (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: z7.q0.b():boolean");
    }

    public void d(String str, String str2, String str3, String str4) {
        n9.h hVar = (n9.h) this.f60012c;
        if (str2 != null && str3 != null) {
            hVar.a();
            n9.k kVar = hVar.f20298c;
            String str5 = kVar.h;
            hVar.a();
            String str6 = kVar.f20309a;
            if (str5 != null) {
                URL url = new URL(org.telegram.ui.Cells.f1.r(str, ":", str4, com.google.android.recaptcha.internal.a.n("https://fcmregistrations.googleapis.com/v1/projects/", str5, "/registrations/", str3, "/topicSubscriptions/")));
                if (c()) {
                    StringBuilder n4 = com.google.android.recaptcha.internal.a.n("Topic ", str4, " for: ", str, " with url: ");
                    n4.append(url);
                    Log.d("FirebaseMessaging", n4.toString());
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("x-goog-api-key", str6);
                httpURLConnection.setRequestProperty("x-goog-firebase-installations-auth", str2);
                httpURLConnection.setDoOutput(false);
                try {
                    try {
                        int responseCode = httpURLConnection.getResponseCode();
                        String responseMessage = httpURLConnection.getResponseMessage();
                        try {
                            InputStream inputStream = httpURLConnection.getInputStream();
                            if (inputStream != null) {
                                inputStream.close();
                            }
                        } catch (IOException unused) {
                        }
                        try {
                            InputStream errorStream = httpURLConnection.getErrorStream();
                            if (errorStream != null) {
                                errorStream.close();
                            }
                        } catch (IOException unused2) {
                        }
                        httpURLConnection.disconnect();
                        if (responseCode >= 200 && responseCode < 300) {
                            if (c()) {
                                Log.d("FirebaseMessaging", org.telegram.ui.Cells.f1.q("Topic ", str4, " for: ", str, " succeeded."));
                                return;
                            }
                            return;
                        } else if (responseCode != 404 && responseCode != 403) {
                            if (responseCode >= 500) {
                                throw new IOException("INTERNAL_SERVER_ERROR");
                            }
                            throw new IOException("Topic " + str4 + " failed with status: " + responseCode);
                        } else {
                            if (c()) {
                                Log.d("FirebaseMessaging", "Topic " + str4 + " failed: " + responseMessage);
                            }
                            throw new IOException(com.google.android.recaptcha.internal.a.k("Topic ", str4, " failed: ", responseMessage));
                        }
                    } catch (IOException e10) {
                        throw new IOException("SERVICE_NOT_AVAILABLE", e10);
                    }
                } catch (Throwable th2) {
                    try {
                        InputStream inputStream2 = httpURLConnection.getInputStream();
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                    } catch (IOException unused3) {
                    }
                    try {
                        InputStream errorStream2 = httpURLConnection.getErrorStream();
                        if (errorStream2 != null) {
                            errorStream2.close();
                        }
                    } catch (IOException unused4) {
                    }
                    httpURLConnection.disconnect();
                    throw th2;
                }
            }
            throw new IOException("Project ID or API Key is missing");
        }
        throw new IOException("FIS auth token or FIS ID is empty");
    }
}
