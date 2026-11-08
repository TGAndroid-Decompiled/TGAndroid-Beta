package v6;

import a8.p0;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import org.json.JSONException;
import org.json.JSONObject;
public final class e implements p {
    public Object f57243a;
    public Object f57244b;

    public e(Object obj, Object obj2) {
        this.f57243a = obj;
        this.f57244b = obj2;
    }

    public static v6.e a(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: v6.e.a(android.content.Context):v6.e");
    }

    @Override
    public void accept(Object obj, Object obj2) {
        d dVar = new d((f) this.f57243a, (TaskCompletionSource) obj2, 1);
        c cVar = (c) ((g) obj).n();
        Parcel j12 = cVar.j1();
        n7.a.c(j12, dVar);
        n7.a.b(j12, (a) this.f57244b);
        j12.writeStrongBinder(null);
        cVar.k1(j12, 2);
    }

    public File b() {
        if (((File) this.f57243a) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f57243a) == null) {
                        String str = "PersistedInstallation." + ((o9.g) this.f57244b).d() + ".json";
                        o9.g gVar = (o9.g) this.f57244b;
                        gVar.a();
                        File file = new File(gVar.f20875a.getNoBackupFilesDir(), str);
                        this.f57243a = file;
                        if (file.exists()) {
                            return (File) this.f57243a;
                        }
                        o9.g gVar2 = (o9.g) this.f57244b;
                        gVar2.a();
                        File file2 = new File(gVar2.f20875a.getFilesDir(), str);
                        if (file2.exists() && !file2.renameTo((File) this.f57243a)) {
                            Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                            return file2;
                        }
                    }
                } finally {
                }
            }
        }
        return (File) this.f57243a;
    }

    public void c(wa.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f57627a);
            jSONObject.put("Status", p1.g.c(bVar.f57628b));
            jSONObject.put("AuthToken", bVar.f57629c);
            jSONObject.put("RefreshToken", bVar.d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f57631f);
            jSONObject.put("ExpiresInSecs", bVar.f57630e);
            jSONObject.put("FisError", bVar.f57632g);
            o9.g gVar = (o9.g) this.f57244b;
            gVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f20875a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(b())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public wa.b d() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(b());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i7 = wa.b.h;
        byte b10 = (byte) (((byte) (0 | 2)) | 1);
        int i10 = p1.g.d(5)[optInt];
        if (i10 != 0) {
            byte b11 = (byte) (((byte) (b10 | 2)) | 1);
            if (b11 == 3 && i10 != 0) {
                return new wa.b(optString, i10, optString2, optString3, optLong2, optLong, optString4);
            }
            StringBuilder sb2 = new StringBuilder();
            if (i10 == 0) {
                sb2.append(" registrationStatus");
            }
            if ((b11 & 1) == 0) {
                sb2.append(" expiresInSecs");
            }
            if ((b11 & 2) == 0) {
                sb2.append(" tokenCreationEpochInSecs");
            }
            throw new IllegalStateException(p0.q("Missing required properties:", sb2));
        }
        throw new NullPointerException("Null registrationStatus");
    }

    public void e() {
        try {
            ((FileLock) this.f57244b).release();
            ((FileChannel) this.f57243a).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    public e(int i7) {
        Bitmap createBitmap = Bitmap.createBitmap(i7, i7, Bitmap.Config.ALPHA_8);
        this.f57243a = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.f57244b = new BitmapShader(createBitmap, tileMode, tileMode);
    }
}
