package vh;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.d20;
import org.telegram.messenger.ff;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r81;
import org.telegram.ui.Components.s81;
public final class f7 implements CameraView.CameraViewDelegate, r0.m, org.telegram.ui.ActionBar.u1, r81, j61, e6, l5 {
    public final int f51165a;
    public final o8 f51166b;

    public f7(o8 o8Var, int i10) {
        this.f51165a = i10;
        this.f51166b = o8Var;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        int i10 = I0.f7765a;
        o8 o8Var = this.f51166b;
        o8Var.Y = i10;
        o8Var.Z = I0.f7766b;
        o8Var.f51605a0 = I0.f7767c;
        o8Var.f51608b0 = I0.d;
        o8Var.f51644n.requestLayout();
        return r0.j1.f46131b;
    }

    @Override
    public void a(final u6 u6Var, final boolean z10, final boolean z11, boolean z12, final boolean z13, final TLRPC.InputPeer inputPeer, final int i10, d1 d1Var, final d0 d0Var) {
        switch (this.f51165a) {
            case 9:
                ArrayList arrayList = u6Var.f52018b;
                o8 o8Var = this.f51166b;
                if (o8Var.K1 != null) {
                    o8Var.X0.x(5, true);
                    o8Var.K1.E0 = u6Var;
                    int i11 = o8Var.f51611c;
                    int i12 = x6.f52173a;
                    SerializedData serializedData = new SerializedData(true);
                    x6.c(serializedData, u6Var);
                    SerializedData serializedData2 = new SerializedData(serializedData.length());
                    serializedData.cleanup();
                    x6.c(serializedData2, u6Var);
                    vp.r1(i11).f7.edit().putString("story_privacy2", Utilities.f(serializedData2.toByteArray())).apply();
                    serializedData2.cleanup();
                    n5 n5Var = o8Var.K1;
                    n5Var.G0 = z12;
                    n5Var.H0 = z11;
                    n5Var.F0.clear();
                    o8Var.K1.F0.addAll(arrayList);
                    n5 n5Var2 = o8Var.K1;
                    n5Var2.f51538l = true;
                    n5Var2.f51557v0 = inputPeer;
                    ArrayList arrayList2 = o8Var.H1;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            n5 n5Var3 = (n5) obj;
                            n5Var3.E0 = u6Var;
                            ArrayList arrayList3 = n5Var3.F0;
                            n5Var3.G0 = z12;
                            n5Var3.H0 = z11;
                            arrayList3.clear();
                            arrayList3.addAll(arrayList);
                            n5Var3.f51538l = true;
                            n5Var3.f51557v0 = inputPeer;
                        }
                    }
                    o8Var.h(new c7(o8Var, d1Var, 0));
                    return;
                }
                return;
            default:
                String[] strArr = z13 ? new String[0] : new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
                final o8 o8Var2 = this.f51166b;
                w7.c6.b(strArr, new q20() {
                    @Override
                    public final void a(Object obj2) {
                        boolean z14;
                        final boolean z15;
                        TLRPC.InputPeer inputPeer2;
                        long e;
                        final o8 o8Var3 = o8.this;
                        int i14 = o8Var3.f51611c;
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final d0 d0Var2 = d0Var;
                        if (!booleanValue) {
                            d0Var2.run();
                            return;
                        }
                        t7 t7Var = o8Var3.B0;
                        if (t7Var != null && !t7Var.isFrontface()) {
                            z15 = false;
                            z14 = true;
                        } else {
                            z14 = true;
                            z15 = true;
                        }
                        final TL_stories.TL_startLive tL_startLive = new TL_stories.TL_startLive();
                        tL_startLive.noforwards = z14 ^ z11;
                        TLRPC.InputPeer inputPeer3 = inputPeer;
                        if (inputPeer3 == null) {
                            inputPeer2 = new TLRPC.TL_inputPeerSelf();
                        } else {
                            inputPeer2 = inputPeer3;
                        }
                        tL_startLive.peer = inputPeer2;
                        if (inputPeer3 != null && !(inputPeer3 instanceof TLRPC.TL_inputPeerSelf)) {
                            e = org.telegram.messenger.o5.n(inputPeer3);
                        } else {
                            e = d20.i(i14).e();
                        }
                        final long j10 = e;
                        tL_startLive.privacy_rules.addAll(u6Var.f52018b);
                        tL_startLive.random_id = Utilities.f14519b.nextLong();
                        final boolean z16 = z13;
                        tL_startLive.rtmp_stream = z16;
                        tL_startLive.messages_enabled = Boolean.valueOf(z10);
                        tL_startLive.send_paid_messages_stars = Long.valueOf(i10);
                        ConnectionsManager.getInstance(i14).sendRequest(tL_startLive, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                org.telegram.messenger.i0.g3(new rh.f5(o8.this, tLObject, tL_startLive, z16, j10, z15, tL_error, d0Var2));
                            }
                        });
                    }
                });
                return;
        }
    }

    @Override
    public void b(gz gzVar) {
        ff ffVar;
        o8 o8Var = this.f51166b;
        if (gzVar != null) {
            n5 n5Var = o8Var.K1;
            if (n5Var != null && (ffVar = n5Var.f51516a1) != null) {
                gzVar.d(new n2.u(ffVar, 10));
                return;
            }
            return;
        }
        o8Var.getClass();
    }

    @Override
    public void c(float f7) {
        o8 o8Var = this.f51166b;
        t7 t7Var = o8Var.B0;
        if (t7Var != null) {
            o8Var.T1 = f7;
            t7Var.setZoom(f7);
        }
        o8Var.i0(true);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f51165a) {
            case 2:
                o8 o8Var = this.f51166b;
                o8Var.getClass();
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + org.telegram.messenger.w0.f19025b.getPackageName()));
                    o8Var.f51607b.startActivity(intent);
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 3:
                o8 o8Var2 = this.f51166b;
                o8Var2.getClass();
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.parse("package:" + org.telegram.messenger.w0.f19025b.getPackageName()));
                    o8Var2.f51607b.startActivity(intent2);
                    return;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                    return;
                }
            case 4:
            case 6:
            default:
                o8 o8Var3 = this.f51166b;
                try {
                    Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent3.setData(Uri.parse("package:" + org.telegram.messenger.w0.f19025b.getPackageName()));
                    o8Var3.f51607b.startActivity(intent3);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.f8.g(e10, true);
                    return;
                }
            case 5:
                o8 o8Var4 = this.f51166b;
                o8Var4.getClass();
                try {
                    Intent intent4 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent4.setData(Uri.parse("package:" + org.telegram.messenger.w0.f19025b.getPackageName()));
                    o8Var4.f51607b.startActivity(intent4);
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.f8.g(e11, true);
                    return;
                }
            case 7:
                o8 o8Var5 = this.f51166b;
                int i11 = o8Var5.f51611c;
                n5 n5Var = o8Var5.K1;
                if (n5Var != null) {
                    n5Var.D0 = vp.r1(i11).U4();
                    o8Var5.V1 = !o8Var5.K1.f51520c;
                    o8Var5.h(null);
                    o8Var5.k();
                    o8Var5.l();
                    o8Var5.x();
                    n5 n5Var2 = o8Var5.K1;
                    n5Var2.i(true);
                    n5Var2.C0 = o8Var5.f51613c1.getText();
                    o8Var5.K1 = null;
                    o8Var5.V(n5Var2, true);
                    s0 s0Var = vp.r1(i11).O1().f48922w;
                    if (n5Var2.f51520c) {
                        s0Var.d(n5Var2);
                    } else {
                        ArrayList arrayList = s0Var.f51902b;
                        if (!n5Var2.f51555u) {
                            s0Var.e(n5Var2);
                            n5Var2.f51517b = Utilities.f14519b.nextLong();
                            r0 r0Var = new r0(n5Var2);
                            arrayList.remove(n5Var2);
                            arrayList.add(0, n5Var2);
                            s0Var.a(r0Var);
                        }
                    }
                    o8Var5.J(0, true);
                    return;
                }
                return;
            case 8:
                o8 o8Var6 = this.f51166b;
                n5 n5Var3 = o8Var6.K1;
                if (n5Var3 != null && !n5Var3.f51529g && ((!n5Var3.f51541n || n5Var3.f51555u) && n5Var3.f51520c)) {
                    vp.r1(o8Var6.f51611c).O1().f48922w.c(o8Var6.K1);
                    o8Var6.K1 = null;
                }
                n5 n5Var4 = o8Var6.K1;
                if (n5Var4 != null && (n5Var4.f51543o || n5Var4.f51529g || (n5Var4.f51541n && !n5Var4.f51555u))) {
                    o8Var6.p(true);
                    return;
                } else {
                    o8Var6.J(0, true);
                    return;
                }
        }
    }

    @Override
    public Bitmap i(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(this.f51166b.K1.L.getAbsolutePath(), options);
    }

    @Override
    public void onCameraInit() {
        o8 o8Var = this.f51166b;
        String B = o8Var.B();
        String str = null;
        if (TextUtils.equals(B, o8Var.E())) {
            B = null;
        }
        if (o8Var.f51622f0 == 0) {
            str = B;
        }
        o8Var.d0(str);
        s81 s81Var = o8Var.V0;
        if (s81Var != null) {
            o8Var.T1 = 0.0f;
            s81Var.b(false, 0.0f);
        }
        o8Var.l0(true);
    }
}
