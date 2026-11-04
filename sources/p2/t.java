package p2;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.os.Build;
import b8.zb;
import cg.n0;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.Components.i9;
public final class t implements q {
    public static final org.telegram.utils.twidget.a d = new Object();
    public final UUID f53129a;
    public final MediaDrm f53130b;
    public int f53131c;

    public t(UUID uuid) {
        UUID uuid2;
        uuid.getClass();
        zb.e("Use C.CLEARKEY_UUID instead", !d2.m.f8184c.equals(uuid));
        this.f53129a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(d2.m.d)) ? uuid : uuid2);
        this.f53130b = mediaDrm;
        this.f53131c = 1;
        if (d2.m.f8185e.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override
    public final byte[] C0() {
        return this.f53130b.openSession();
    }

    @Override
    public final void F1(byte[] bArr) {
        this.f53130b.provideProvisionResponse(bArr);
    }

    @Override
    public final p2.o J1(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) {
        throw new UnsupportedOperationException("Method not decompiled: p2.t.J1(byte[], java.util.List, int, java.util.HashMap):p2.o");
    }

    @Override
    public final int L1() {
        return 2;
    }

    @Override
    public final void U0(byte[] bArr, byte[] bArr2) {
        this.f53130b.restoreKeys(bArr, bArr2);
    }

    @Override
    public final p W() {
        MediaDrm.ProvisionRequest provisionRequest = this.f53130b.getProvisionRequest();
        return new p(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override
    public final void W0(byte[] bArr) {
        this.f53130b.closeSession(bArr);
    }

    @Override
    public final boolean l2(String str, byte[] bArr) {
        MediaCrypto mediaCrypto;
        UUID uuid;
        boolean equals;
        int i3 = Build.VERSION.SDK_INT;
        UUID uuid2 = this.f53129a;
        if (i3 >= 31) {
            boolean equals2 = uuid2.equals(d2.m.f8185e);
            MediaDrm mediaDrm = this.f53130b;
            if (equals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                if (!propertyString.startsWith("v5.") && !propertyString.startsWith("14.") && !propertyString.startsWith("15.") && !propertyString.startsWith("16.0")) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else {
                equals = uuid2.equals(d2.m.d);
            }
            if (equals) {
                return n0.f(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                if (i3 < 27 && Objects.equals(uuid2, d2.m.d)) {
                    uuid = d2.m.f8184c;
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
            boolean z10 = !uuid2.equals(d2.m.d);
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
    public final void m(final i9 i9Var) {
        this.f53130b.setOnEventListener(new MediaDrm.OnEventListener() {
            @Override
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i3, int i10, byte[] bArr2) {
                t tVar = t.this;
                i9 i9Var2 = i9Var;
                tVar.getClass();
                android.support.v4.media.session.q qVar = ((e) i9Var2.f34636b).N;
                qVar.getClass();
                qVar.obtainMessage(i3, bArr).sendToTarget();
            }
        });
    }

    @Override
    public final byte[] o1(byte[] bArr, byte[] bArr2) {
        if (d2.m.d.equals(this.f53129a) && Build.VERSION.SDK_INT < 27) {
            try {
                JSONObject jSONObject = new JSONObject(g2.n0.r(bArr2));
                StringBuilder sb2 = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    if (i3 != 0) {
                        sb2.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
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
                g2.a.d("ClearKeyUtil", "Failed to adjust response data: ".concat(g2.n0.r(bArr2)), e10);
            }
        }
        return this.f53130b.provideKeyResponse(bArr, bArr2);
    }

    @Override
    public final Map r(byte[] bArr) {
        return this.f53130b.queryKeyStatus(bArr);
    }

    @Override
    public final j2.b r0(byte[] bArr) {
        int i3 = Build.VERSION.SDK_INT;
        UUID uuid = this.f53129a;
        if (i3 < 27 && Objects.equals(uuid, d2.m.d)) {
            uuid = d2.m.f8184c;
        }
        return new r(uuid, bArr);
    }

    @Override
    public final synchronized void release() {
        int i3 = this.f53131c - 1;
        this.f53131c = i3;
        if (i3 == 0) {
            this.f53130b.release();
        }
    }

    @Override
    public final void v0(byte[] bArr, l2.k kVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                n0.h(this.f53130b, bArr, kVar);
            } catch (UnsupportedOperationException unused) {
                g2.a.l("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }
}
