package tg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.ff;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.vg;
public final class x implements ii, com.google.android.gms.common.api.internal.q {
    public final int f57595a;
    public Object f57596b;
    public Object f57597c;

    public x(int i7, Object obj, Object obj2) {
        this.f57595a = i7;
        this.f57596b = obj;
        this.f57597c = obj2;
    }

    public static tg.x a(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: tg.x.a(android.content.Context):tg.x");
    }

    @Override
    public boolean V1() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public void accept(java.lang.Object r51, java.lang.Object r52) {
        throw new UnsupportedOperationException("Method not decompiled: tg.x.accept(java.lang.Object, java.lang.Object):void");
    }

    public void b(v4.e1 e1Var, e2.r0 r0Var) {
        a0.f fVar = (a0.f) this.f57596b;
        v4.k1 k1Var = (v4.k1) fVar.get(e1Var);
        if (k1Var == null) {
            k1Var = v4.k1.a();
            fVar.put(e1Var, k1Var);
        }
        k1Var.f58599c = r0Var;
        k1Var.f58597a |= 8;
    }

    public File c() {
        if (((File) this.f57596b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f57596b) == null) {
                        String str = "PersistedInstallation." + ((o9.g) this.f57597c).d() + ".json";
                        o9.g gVar = (o9.g) this.f57597c;
                        gVar.a();
                        File file = new File(gVar.f21397a.getNoBackupFilesDir(), str);
                        this.f57596b = file;
                        if (file.exists()) {
                            return (File) this.f57596b;
                        }
                        o9.g gVar2 = (o9.g) this.f57597c;
                        gVar2.a();
                        File file2 = new File(gVar2.f21397a.getFilesDir(), str);
                        if (file2.exists() && !file2.renameTo((File) this.f57596b)) {
                            Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                            return file2;
                        }
                    }
                } finally {
                }
            }
        }
        return (File) this.f57596b;
    }

    public void d(wa.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f59080a);
            jSONObject.put("Status", p1.g.c(bVar.f59081b));
            jSONObject.put("AuthToken", bVar.f59082c);
            jSONObject.put("RefreshToken", bVar.d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f59084f);
            jSONObject.put("ExpiresInSecs", bVar.f59083e);
            jSONObject.put("FisError", bVar.f59085g);
            o9.g gVar = (o9.g) this.f57597c;
            gVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f21397a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(c())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    @Override
    public void d0(vg vgVar) {
        vgVar.run();
    }

    public e2.r0 e(v4.e1 e1Var, int i7) {
        v4.k1 k1Var;
        e2.r0 r0Var;
        a0.f fVar = (a0.f) this.f57596b;
        int d = fVar.d(e1Var);
        if (d >= 0 && (k1Var = (v4.k1) fVar.i(d)) != null) {
            int i10 = k1Var.f58597a;
            if ((i10 & i7) != 0) {
                int i11 = i10 & (~i7);
                k1Var.f58597a = i11;
                if (i7 == 4) {
                    r0Var = k1Var.f58598b;
                } else if (i7 == 8) {
                    r0Var = k1Var.f58599c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i11 & 12) == 0) {
                    fVar.g(d);
                    k1Var.f58597a = 0;
                    k1Var.f58598b = null;
                    k1Var.f58599c = null;
                    v4.k1.d.u(k1Var);
                }
                return r0Var;
            }
        }
        return null;
    }

    public wa.b f() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(c());
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
            throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
        }
        throw new NullPointerException("Null registrationStatus");
    }

    public void g() {
        try {
            ((FileLock) this.f57597c).release();
            ((FileChannel) this.f57596b).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    @Override
    public boolean g0() {
        return false;
    }

    public void h(v4.e1 e1Var) {
        v4.k1 k1Var = (v4.k1) ((a0.f) this.f57596b).get(e1Var);
        if (k1Var == null) {
            return;
        }
        k1Var.f58597a &= -2;
    }

    public void i(v4.e1 e1Var) {
        a0.f fVar = (a0.f) this.f57596b;
        a0.h hVar = (a0.h) this.f57597c;
        int m10 = hVar.m() - 1;
        while (true) {
            if (m10 < 0) {
                break;
            } else if (e1Var == hVar.n(m10)) {
                Object[] objArr = hVar.f19c;
                Object obj = objArr[m10];
                Object obj2 = a0.i.f20a;
                if (obj != obj2) {
                    objArr[m10] = obj2;
                    hVar.f17a = true;
                }
            } else {
                m10--;
            }
        }
        v4.k1 k1Var = (v4.k1) fVar.get(e1Var);
        if (k1Var != null) {
            fVar.remove(e1Var);
            k1Var.f58597a = 0;
            k1Var.f58598b = null;
            k1Var.f58599c = null;
            v4.k1.d.u(k1Var);
        }
    }

    @Override
    public void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        ki kiVar = (ki) this.f57596b;
        try {
            HashMap<Object, Object> selectedPhotos = kiVar.f36447e2.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                ff ffVar = (ff) selectedPhotos.values().iterator().next();
                String str = ffVar.h;
                if (str == null) {
                    str = ffVar.I;
                }
                g0 g0Var = (g0) this.f57597c;
                g0Var.d0(g0Var.f0(str, true));
                kiVar.dismiss();
            }
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    public x(Context context) {
        this.f57595a = 8;
        this.f57597c = new AtomicLong(-1L);
        this.f57596b = new com.google.android.gms.common.api.j(context, s6.d.f56500m, new q6.q("mlkit:natural_language"), com.google.android.gms.common.api.i.f5924c);
    }

    public x(int i7, byte b10) {
        this.f57595a = i7;
        switch (i7) {
            case 9:
                return;
            default:
                this.f57596b = new a0.l(0);
                this.f57597c = new a0.h();
                return;
        }
    }

    public x(o9.g gVar) {
        this.f57595a = 6;
        this.f57597c = gVar;
    }

    public x(String str, String str2) {
        this.f57595a = 2;
        this.f57596b = str;
        this.f57597c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    public x(int i7) {
        this.f57595a = 7;
        Bitmap createBitmap = Bitmap.createBitmap(i7, i7, Bitmap.Config.ALPHA_8);
        this.f57596b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.f57597c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    public x(g0 g0Var, ki kiVar) {
        this.f57595a = 0;
        this.f57597c = g0Var;
        this.f57596b = kiVar;
    }

    @Override
    public void R0(Object obj) {
    }

    @Override
    public void h1(TLRPC.User user) {
    }

    @Override
    public void K0() {
    }

    @Override
    public void v0() {
    }

    @Override
    public void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
