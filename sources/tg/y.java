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
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.ui;
public final class y implements si, com.google.android.gms.common.api.internal.q {
    public final int f58223a;
    public Object f58224b;
    public Object f58225c;

    public y(int i7, Object obj, Object obj2) {
        this.f58223a = i7;
        this.f58224b = obj;
        this.f58225c = obj2;
    }

    public static tg.y a(android.content.Context r5) {
        throw new UnsupportedOperationException("Method not decompiled: tg.y.a(android.content.Context):tg.y");
    }

    @Override
    public boolean V1() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public void accept(java.lang.Object r51, java.lang.Object r52) {
        throw new UnsupportedOperationException("Method not decompiled: tg.y.accept(java.lang.Object, java.lang.Object):void");
    }

    public void b(v4.f1 f1Var, e2.r0 r0Var) {
        a0.f fVar = (a0.f) this.f58224b;
        v4.l1 l1Var = (v4.l1) fVar.get(f1Var);
        if (l1Var == null) {
            l1Var = v4.l1.a();
            fVar.put(f1Var, l1Var);
        }
        l1Var.f59228c = r0Var;
        l1Var.f59226a |= 8;
    }

    public File c() {
        if (((File) this.f58224b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f58224b) == null) {
                        String str = "PersistedInstallation." + ((o9.g) this.f58225c).d() + ".json";
                        o9.g gVar = (o9.g) this.f58225c;
                        gVar.a();
                        File file = new File(gVar.f21788a.getNoBackupFilesDir(), str);
                        this.f58224b = file;
                        if (file.exists()) {
                            return (File) this.f58224b;
                        }
                        o9.g gVar2 = (o9.g) this.f58225c;
                        gVar2.a();
                        File file2 = new File(gVar2.f21788a.getFilesDir(), str);
                        if (file2.exists() && !file2.renameTo((File) this.f58224b)) {
                            Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                            return file2;
                        }
                    }
                } finally {
                }
            }
        }
        return (File) this.f58224b;
    }

    public void d(wa.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f59688a);
            jSONObject.put("Status", p1.g.c(bVar.f59689b));
            jSONObject.put("AuthToken", bVar.f59690c);
            jSONObject.put("RefreshToken", bVar.d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f59692f);
            jSONObject.put("ExpiresInSecs", bVar.f59691e);
            jSONObject.put("FisError", bVar.f59693g);
            o9.g gVar = (o9.g) this.f58225c;
            gVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f21788a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(c())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public e2.r0 e(v4.f1 f1Var, int i7) {
        v4.l1 l1Var;
        e2.r0 r0Var;
        a0.f fVar = (a0.f) this.f58224b;
        int d = fVar.d(f1Var);
        if (d >= 0 && (l1Var = (v4.l1) fVar.i(d)) != null) {
            int i10 = l1Var.f59226a;
            if ((i10 & i7) != 0) {
                int i11 = i10 & (~i7);
                l1Var.f59226a = i11;
                if (i7 == 4) {
                    r0Var = l1Var.f59227b;
                } else if (i7 == 8) {
                    r0Var = l1Var.f59228c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i11 & 12) == 0) {
                    fVar.g(d);
                    l1Var.f59226a = 0;
                    l1Var.f59227b = null;
                    l1Var.f59228c = null;
                    v4.l1.d.t(l1Var);
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

    @Override
    public void f0(gh ghVar) {
        ghVar.run();
    }

    public void g() {
        try {
            ((FileLock) this.f58225c).release();
            ((FileChannel) this.f58224b).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    @Override
    public boolean g0() {
        return false;
    }

    public void h(v4.f1 f1Var) {
        v4.l1 l1Var = (v4.l1) ((a0.f) this.f58224b).get(f1Var);
        if (l1Var == null) {
            return;
        }
        l1Var.f59226a &= -2;
    }

    public void i(v4.f1 f1Var) {
        a0.f fVar = (a0.f) this.f58224b;
        a0.h hVar = (a0.h) this.f58225c;
        int m10 = hVar.m() - 1;
        while (true) {
            if (m10 < 0) {
                break;
            } else if (f1Var == hVar.n(m10)) {
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
        v4.l1 l1Var = (v4.l1) fVar.get(f1Var);
        if (l1Var != null) {
            fVar.remove(f1Var);
            l1Var.f59226a = 0;
            l1Var.f59227b = null;
            l1Var.f59228c = null;
            v4.l1.d.t(l1Var);
        }
    }

    @Override
    public void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        ui uiVar = (ui) this.f58224b;
        try {
            HashMap<Object, Object> selectedPhotos = uiVar.f40379e2.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                ff ffVar = (ff) selectedPhotos.values().iterator().next();
                String str = ffVar.h;
                if (str == null) {
                    str = ffVar.I;
                }
                h0 h0Var = (h0) this.f58225c;
                h0Var.d0(h0Var.f0(str, true));
                uiVar.dismiss();
            }
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    public y(Context context) {
        this.f58223a = 8;
        this.f58225c = new AtomicLong(-1L);
        this.f58224b = new com.google.android.gms.common.api.j(context, s6.d.f57119m, new q6.q("mlkit:natural_language"), com.google.android.gms.common.api.i.f6239c);
    }

    public y(int i7, byte b10) {
        this.f58223a = i7;
        switch (i7) {
            case 9:
                return;
            default:
                this.f58224b = new a0.l(0);
                this.f58225c = new a0.h();
                return;
        }
    }

    public y(o9.g gVar) {
        this.f58223a = 6;
        this.f58225c = gVar;
    }

    public y(String str, String str2) {
        this.f58223a = 2;
        this.f58224b = str;
        this.f58225c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    public y(int i7) {
        this.f58223a = 7;
        Bitmap createBitmap = Bitmap.createBitmap(i7, i7, Bitmap.Config.ALPHA_8);
        this.f58224b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.f58225c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    public y(h0 h0Var, ui uiVar) {
        this.f58223a = 0;
        this.f58225c = h0Var;
        this.f58224b = uiVar;
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
