package th;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.WindowManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.messenger.b8;
import org.telegram.messenger.f8;
import org.telegram.messenger.x8;
import org.telegram.tgnet.TLRPC;
public final class f7 implements v2 {
    public final x4 f48977a;
    public final ArrayList f48978b;
    public final Context f48979c;
    public final o7 d;

    public f7(o7 o7Var, x4 x4Var, ArrayList arrayList, Context context) {
        this.d = o7Var;
        this.f48977a = x4Var;
        this.f48978b = arrayList;
        this.f48979c = context;
    }

    public final void a(int i10, long j10) {
        o7 o7Var = this.d;
        if (o7Var.J == i10 && o7Var.I == j10) {
            return;
        }
        o7Var.I = j10;
        o7Var.J = i10;
    }

    public final void b(boolean z10) {
        int i10;
        o7 o7Var = this.d;
        org.telegram.ui.ActionBar.k2 k2Var = o7Var.f49303f;
        if (o7Var.f49293b) {
            if (!o7Var.f49296c) {
                if (z10) {
                    org.telegram.messenger.i0.Y2(k2Var.getParentActivity(), k2Var.getClassGuid());
                    return;
                } else {
                    org.telegram.messenger.i0.Z2(k2Var.getParentActivity(), k2Var.getClassGuid());
                    return;
                }
            }
            return;
        }
        WindowManager.LayoutParams layoutParams = o7Var.f49327r;
        if (z10) {
            i10 = 48;
        } else {
            i10 = 16;
        }
        layoutParams.softInputMode = i10;
        try {
            o7Var.f49318n.updateViewLayout(o7Var.f49330s, layoutParams);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j10, k2.t0 t0Var) {
        String uri2;
        String uri3;
        long j11;
        n7 n7Var;
        o7 o7Var = this.d;
        ArrayList arrayList = o7Var.M0;
        if (!o7Var.H0 && o7Var.U >= 0.9f) {
            Uri uri4 = o7Var.F0;
            if (uri4 == null) {
                uri2 = null;
            } else {
                uri2 = uri4.toString();
            }
            if (uri == null) {
                uri3 = null;
            } else {
                uri3 = uri.toString();
            }
            boolean equals = TextUtils.equals(uri2, uri3);
            boolean z10 = true;
            if (equals && (n7Var = o7Var.f49346z0) != null) {
                if (equals) {
                    o7Var.G0 = t0Var;
                    t0Var.f10768c = n7Var;
                    t0Var.f10766a = null;
                    n7Var.setSpeed(o7.B1);
                    k2.t0 t0Var2 = o7Var.G0;
                    t0Var2.f10767b = o7Var.f49346z0.firstFrameRendered;
                    t0Var2.e = o7Var.f49345y0;
                    t0Var2.f10769f = o7Var.B0;
                    t0Var2.d = o7Var.C0;
                    f8.b("StoryViewer requestPlayer: same url");
                }
            } else {
                o7Var.F0 = uri;
                vh.s2 s2Var = o7Var.D0;
                if (s2Var != null) {
                    s2Var.d(0L, null);
                }
                s0 s0Var = o7Var.A0;
                if (s0Var != null) {
                    if (s0Var.f49423n) {
                        s0Var.s(null);
                    } else {
                        s0Var.e();
                    }
                    o7Var.A0 = null;
                }
                n7 n7Var2 = o7Var.f49346z0;
                if (n7Var2 != null) {
                    n7Var2.release(null);
                    o7Var.f49346z0 = null;
                }
                k2.t0 t0Var3 = o7Var.G0;
                if (t0Var3 != null) {
                    t0Var3.f10768c = null;
                    t0Var3.f10766a = null;
                    t0Var3.f10767b = false;
                    t0Var3.e = null;
                    t0Var3.f10769f = null;
                    t0Var3.d = null;
                    t0Var3.b();
                    o7Var.G0 = null;
                }
                if (uri != null) {
                    o7Var.G0 = t0Var;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList.size()) {
                            break;
                        } else if (((n7) arrayList.get(i10)).uri.equals(uri)) {
                            o7Var.f49346z0 = (n7) arrayList.remove(i10);
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (o7Var.f49346z0 == null) {
                        n7 n7Var3 = new n7(o7Var, o7Var.C0, o7Var.B0);
                        o7Var.f49346z0 = n7Var3;
                        n7Var3.document = document;
                    }
                    n7 n7Var4 = o7Var.f49346z0;
                    n7Var4.uri = uri;
                    n7Var4.setSpeed(o7.B1);
                    k2.t0 t0Var4 = o7Var.G0;
                    n7 n7Var5 = o7Var.f49346z0;
                    t0Var4.f10768c = n7Var5;
                    t0Var4.f10767b = false;
                    t0Var4.e = o7Var.f49345y0;
                    t0Var4.f10769f = o7Var.B0;
                    t0Var4.d = o7Var.C0;
                    t0Var4.f10766a = null;
                    TLRPC.Document document2 = n7Var5.document;
                    if (document2 != null) {
                        x8.I.put(Long.valueOf(document2.f19799id), 3);
                    } else {
                        ConcurrentHashMap concurrentHashMap = x8.H;
                    }
                    b8.G(o7Var.h).h(3, o7Var.f49346z0.document, null, null, null, null);
                    if (j10 == 0) {
                        long j12 = o7Var.f49334t1;
                        if (j12 != 0) {
                            o7Var.G0.f10767b = true;
                            j11 = j12;
                            f8.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                            ((n7) o7Var.G0.f10768c).start(false, o7Var.K(), uri, j11, o7.D1, o7.B1);
                            o7Var.G0.b();
                        }
                    }
                    j11 = j10;
                    f8.b("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                    ((n7) o7Var.G0.f10768c).start(false, o7Var.K(), uri, j11, o7.D1, o7.B1);
                    o7Var.G0.b();
                } else {
                    f8.b("StoryViewer requestPlayer: url is null (1)");
                }
            }
            if (uri == null) {
                z10 = false;
            }
            i(false, z10);
            o7Var.f49334t1 = 0L;
            o7Var.d0();
            return;
        }
        vh.s2 s2Var2 = o7Var.D0;
        if (s2Var2 != null) {
            s2Var2.d(0L, null);
        }
        s0 s0Var2 = o7Var.A0;
        if (s0Var2 != null) {
            if (s0Var2.f49423n) {
                s0Var2.s(null);
            } else {
                s0Var2.e();
            }
            o7Var.A0 = null;
        }
        f8.b("StoryViewer requestPlayer ignored, because closed: " + o7Var.H0 + ", " + o7Var.U);
        t0Var.f10767b = false;
        t0Var.f10768c = null;
        t0Var.f10766a = null;
    }

    public final void d(float f7) {
        o7 o7Var = this.d;
        if (o7Var.f49328r0 != f7) {
            o7Var.f49328r0 = f7;
            o7Var.f49339w.invalidate();
        }
    }

    public final void e() {
        this.d.f49317m1 = false;
    }

    public final void f(boolean z10) {
        n7 n7Var;
        o7 o7Var = this.d;
        if (!o7Var.f49305f1 && z10 && o7Var.f49314k0) {
            o7Var.f49314k0 = false;
            k2.t0 t0Var = o7Var.G0;
            if (t0Var != null && (n7Var = (n7) t0Var.f10768c) != null) {
                n7Var.setSeeking(false);
            }
            z2 H = o7Var.H();
            if (H != null) {
                H.invalidate();
            }
        }
        o7Var.f49305f1 = z10;
        o7Var.d0();
    }

    public final void g(boolean z10) {
        o7 o7Var = this.d;
        o7Var.X0 = z10;
        o7Var.d0();
    }

    public final void h(Dialog dialog) {
        this.d.t(dialog);
    }

    public final void i(boolean z10, boolean z11) {
        int i10;
        int i11;
        o7 o7Var = this.d;
        vh.s2 s2Var = o7Var.D0;
        int i12 = 8;
        if (s2Var != null) {
            if (z10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            s2Var.setVisibility(i11);
        }
        SurfaceView surfaceView = o7Var.C0;
        if (surfaceView != null) {
            if (z10) {
                i10 = 8;
            } else if (z11) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            surfaceView.setVisibility(i10);
        }
        g7 g7Var = o7Var.B0;
        if (g7Var != null) {
            if (!z10) {
                i12 = 0;
            }
            g7Var.setVisibility(i12);
        }
    }

    public final void j() {
        int indexOf;
        o7 o7Var = this.d;
        x4 x4Var = this.f48977a;
        if (x4Var != null) {
            if (o7Var.f49319n0.f48785x0 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(o7Var.f49319n0.f48785x0);
            if (o7Var.f49319n0.getCurrentPeerView() == null) {
                indexOf = -1;
            } else {
                indexOf = arrayList.indexOf(o7Var.f49319n0.getCurrentPeerView().getCurrentDay());
            }
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
                if (!o7Var.f49319n0.E(true)) {
                    o7Var.D(false);
                    return;
                }
                o7Var.f49319n0.G0 = new rh.l5(this, x4Var, arrayList, 9);
                return;
            }
            o7Var.D(false);
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f48978b);
        int indexOf2 = arrayList2.indexOf(Long.valueOf(o7Var.f49319n0.getCurrentPeerView().getCurrentPeer()));
        if (indexOf2 >= 0) {
            arrayList2.remove(indexOf2);
            if (!o7Var.f49319n0.E(true)) {
                o7Var.D(false);
                return;
            }
            o7Var.f49319n0.G0 = new org.telegram.ui.Wallet.x0(this, arrayList2, indexOf2, 18);
            return;
        }
        o7Var.D(false);
    }
}
