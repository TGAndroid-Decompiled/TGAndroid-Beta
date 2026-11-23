package q2;

import a8.ma;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.os.Build;
import bg.o0;
import h2.l0;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.ActionBar.i5;
import p4.r0;
public final class t implements q {
    public static final r0 d = new r0(23);
    public final UUID f55896a;
    public final MediaDrm f55897b;
    public int f55898c;

    public t(UUID uuid) {
        UUID uuid2;
        uuid.getClass();
        ma.e("Use C.CLEARKEY_UUID instead", !e2.l.f10484c.equals(uuid));
        this.f55896a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(e2.l.d)) ? uuid : uuid2);
        this.f55897b = mediaDrm;
        this.f55898c = 1;
        if (e2.l.f10485e.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override
    public final void B(byte[] bArr, m2.i iVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                o0.h(this.f55897b, bArr, iVar);
            } catch (UnsupportedOperationException unused) {
                h2.a.l("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override
    public final q2.o E(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) {
        throw new UnsupportedOperationException("Method not decompiled: q2.t.E(byte[], java.util.List, int, java.util.HashMap):q2.o");
    }

    @Override
    public final int G() {
        return 2;
    }

    @Override
    public final boolean N(String str, byte[] bArr) {
        MediaCrypto mediaCrypto;
        UUID uuid;
        boolean equals;
        int i7 = Build.VERSION.SDK_INT;
        UUID uuid2 = this.f55896a;
        if (i7 >= 31) {
            boolean equals2 = uuid2.equals(e2.l.f10485e);
            MediaDrm mediaDrm = this.f55897b;
            if (equals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                if (!propertyString.startsWith("v5.") && !propertyString.startsWith("14.") && !propertyString.startsWith("15.") && !propertyString.startsWith("16.0")) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else {
                equals = uuid2.equals(e2.l.d);
            }
            if (equals) {
                return o0.f(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                if (i7 < 27 && Objects.equals(uuid2, e2.l.d)) {
                    uuid = e2.l.f10484c;
                } else {
                    uuid = uuid2;
                }
                mediaCrypto = new MediaCrypto(uuid, bArr);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (MediaCryptoException unused) {
        }
        try {
            boolean requiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
            mediaCrypto.release();
            return requiresSecureDecoderComponent;
        } catch (MediaCryptoException unused2) {
            mediaCrypto2 = mediaCrypto;
            boolean z10 = !uuid2.equals(e2.l.d);
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            return z10;
        } catch (Throwable th3) {
            th = th3;
            mediaCrypto2 = mediaCrypto;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        }
    }

    @Override
    public final Map a(byte[] bArr) {
        return this.f55897b.queryKeyStatus(bArr);
    }

    @Override
    public final p g() {
        MediaDrm.ProvisionRequest provisionRequest = this.f55897b.getProvisionRequest();
        return new p(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override
    public final k2.b j(byte[] bArr) {
        int i7 = Build.VERSION.SDK_INT;
        UUID uuid = this.f55896a;
        if (i7 < 27 && Objects.equals(uuid, e2.l.d)) {
            uuid = e2.l.f10484c;
        }
        return new r(uuid, bArr);
    }

    @Override
    public final byte[] l() {
        return this.f55897b.openSession();
    }

    @Override
    public final void n(byte[] bArr, byte[] bArr2) {
        this.f55897b.restoreKeys(bArr, bArr2);
    }

    @Override
    public final void r(byte[] bArr) {
        this.f55897b.closeSession(bArr);
    }

    @Override
    public final synchronized void release() {
        int i7 = this.f55898c - 1;
        this.f55898c = i7;
        if (i7 == 0) {
            this.f55897b.release();
        }
    }

    @Override
    public final byte[] u(byte[] bArr, byte[] bArr2) {
        if (e2.l.d.equals(this.f55896a) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(l0.r(bArr2));
                StringBuilder sb2 = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    if (i7 != 0) {
                        sb2.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i7);
                    sb2.append("{\"k\":\"");
                    sb2.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kid\":\"");
                    sb2.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kty\":\"");
                    sb2.append(jSONObject2.getString("kty"));
                    sb2.append("\"}");
                }
                sb2.append("]}");
                bArr2 = sb2.toString().getBytes(StandardCharsets.UTF_8);
            } catch (JSONException e10) {
                h2.a.d("ClearKeyUtil", "Failed to adjust response data: ".concat(l0.r(bArr2)), e10);
            }
        }
        return this.f55897b.provideKeyResponse(bArr, bArr2);
    }

    @Override
    public final void v(final i5 i5Var) {
        this.f55897b.setOnEventListener(new MediaDrm.OnEventListener() {
            @Override
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i7, int i10, byte[] bArr2) {
                t tVar = t.this;
                i5 i5Var2 = i5Var;
                tVar.getClass();
                android.support.v4.media.session.q qVar = ((e) i5Var2.f29095a).N;
                qVar.getClass();
                qVar.obtainMessage(i7, bArr).sendToTarget();
            }
        });
    }

    @Override
    public final void w(byte[] bArr) {
        this.f55897b.provideProvisionResponse(bArr);
    }
}
