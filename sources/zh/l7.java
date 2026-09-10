package zh;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FileStreamLoadOperation;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.uu0;
public final class l7 implements w2 {
    public final a5 f48650a;
    public final ArrayList f48651b;
    public final Context f48652c;
    public final u7 d;

    public l7(u7 u7Var, a5 a5Var, ArrayList arrayList, Context context) {
        this.d = u7Var;
        this.f48650a = a5Var;
        this.f48651b = arrayList;
        this.f48652c = context;
    }

    public final void a(int i10, long j3) {
        u7 u7Var = this.d;
        if (u7Var.J == i10 && u7Var.I == j3) {
            return;
        }
        u7Var.I = j3;
        u7Var.J = i10;
    }

    public final void b(boolean z10) {
        int i10;
        u7 u7Var = this.d;
        org.telegram.ui.ActionBar.p2 p2Var = u7Var.f48931f;
        if (u7Var.f48921b) {
            if (!u7Var.f48924c) {
                if (z10) {
                    AndroidUtilities.requestAdjustNothing(p2Var.getParentActivity(), p2Var.getClassGuid());
                    return;
                } else {
                    AndroidUtilities.requestAdjustResize(p2Var.getParentActivity(), p2Var.getClassGuid());
                    return;
                }
            }
            return;
        }
        WindowManager.LayoutParams layoutParams = u7Var.f48955r;
        if (z10) {
            i10 = 48;
        } else {
            i10 = 16;
        }
        layoutParams.softInputMode = i10;
        try {
            u7Var.f48946n.updateViewLayout(u7Var.f48958s, layoutParams);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void c(TLRPC.Document document, Uri uri, long j3, k2.v vVar) {
        String uri2;
        String uri3;
        long j10;
        t7 t7Var;
        u7 u7Var = this.d;
        ArrayList arrayList = u7Var.M0;
        if (!u7Var.H0 && u7Var.U >= 0.9f) {
            Uri uri4 = u7Var.F0;
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
            if (equals && (t7Var = u7Var.f48974z0) != null) {
                if (equals) {
                    u7Var.G0 = vVar;
                    vVar.f12226c = t7Var;
                    vVar.f12225b = null;
                    t7Var.setSpeed(u7.B1);
                    k2.v vVar2 = u7Var.G0;
                    vVar2.f12224a = u7Var.f48974z0.firstFrameRendered;
                    vVar2.e = u7Var.f48973y0;
                    vVar2.f12227f = u7Var.B0;
                    vVar2.d = u7Var.C0;
                    FileLog.d("StoryViewer requestPlayer: same url");
                }
            } else {
                u7Var.F0 = uri;
                bi.f5 f5Var = u7Var.D0;
                if (f5Var != null) {
                    f5Var.d(0L, null);
                }
                t0 t0Var = u7Var.A0;
                if (t0Var != null) {
                    if (t0Var.f48882n) {
                        t0Var.s(null);
                    } else {
                        t0Var.e();
                    }
                    u7Var.A0 = null;
                }
                t7 t7Var2 = u7Var.f48974z0;
                if (t7Var2 != null) {
                    t7Var2.release(null);
                    u7Var.f48974z0 = null;
                }
                k2.v vVar3 = u7Var.G0;
                if (vVar3 != null) {
                    vVar3.f12226c = null;
                    vVar3.f12225b = null;
                    vVar3.f12224a = false;
                    vVar3.e = null;
                    vVar3.f12227f = null;
                    vVar3.d = null;
                    vVar3.b();
                    u7Var.G0 = null;
                }
                if (uri != null) {
                    u7Var.G0 = vVar;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= arrayList.size()) {
                            break;
                        } else if (((t7) arrayList.get(i10)).uri.equals(uri)) {
                            u7Var.f48974z0 = (t7) arrayList.remove(i10);
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (u7Var.f48974z0 == null) {
                        t7 t7Var3 = new t7(u7Var, u7Var.C0, u7Var.B0);
                        u7Var.f48974z0 = t7Var3;
                        t7Var3.document = document;
                    }
                    t7 t7Var4 = u7Var.f48974z0;
                    t7Var4.uri = uri;
                    t7Var4.setSpeed(u7.B1);
                    k2.v vVar4 = u7Var.G0;
                    t7 t7Var5 = u7Var.f48974z0;
                    vVar4.f12226c = t7Var5;
                    vVar4.f12224a = false;
                    vVar4.e = u7Var.f48973y0;
                    vVar4.f12227f = u7Var.B0;
                    vVar4.d = u7Var.C0;
                    vVar4.f12225b = null;
                    FileStreamLoadOperation.setPriorityForDocument(t7Var5.document, 3);
                    FileLoader.getInstance(u7Var.h).changePriority(3, u7Var.f48974z0.document, null, null, null, null, null);
                    if (j3 == 0) {
                        long j11 = u7Var.f48962t1;
                        if (j11 != 0) {
                            u7Var.G0.f12224a = true;
                            j10 = j11;
                            FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                            ((t7) u7Var.G0.f12226c).start(false, u7Var.w(), uri, j10, u7.D1, u7.B1);
                            u7Var.G0.b();
                        }
                    }
                    j10 = j3;
                    FileLog.d("StoryViewer requestPlayer: currentPlayerScope.player start " + uri);
                    ((t7) u7Var.G0.f12226c).start(false, u7Var.w(), uri, j10, u7.D1, u7.B1);
                    u7Var.G0.b();
                } else {
                    FileLog.d("StoryViewer requestPlayer: url is null (1)");
                }
            }
            if (uri == null) {
                z10 = false;
            }
            i(false, z10);
            u7Var.f48962t1 = 0L;
            u7Var.P();
            return;
        }
        bi.f5 f5Var2 = u7Var.D0;
        if (f5Var2 != null) {
            f5Var2.d(0L, null);
        }
        t0 t0Var2 = u7Var.A0;
        if (t0Var2 != null) {
            if (t0Var2.f48882n) {
                t0Var2.s(null);
            } else {
                t0Var2.e();
            }
            u7Var.A0 = null;
        }
        FileLog.d("StoryViewer requestPlayer ignored, because closed: " + u7Var.H0 + ", " + u7Var.U);
        vVar.f12224a = false;
        vVar.f12226c = null;
        vVar.f12225b = null;
    }

    public final void d(float f7) {
        u7 u7Var = this.d;
        if (u7Var.f48956r0 != f7) {
            u7Var.f48956r0 = f7;
            u7Var.v.invalidate();
        }
    }

    public final void e() {
        this.d.f48945m1 = false;
    }

    public final void f(boolean z10) {
        t7 t7Var;
        u7 u7Var = this.d;
        if (!u7Var.f48933f1 && z10 && u7Var.f48942k0) {
            u7Var.f48942k0 = false;
            k2.v vVar = u7Var.G0;
            if (vVar != null && (t7Var = (t7) vVar.f12226c) != null) {
                t7Var.setSeeking(false);
            }
            a3 t10 = u7Var.t();
            if (t10 != null) {
                t10.invalidate();
            }
        }
        u7Var.f48933f1 = z10;
        u7Var.P();
    }

    public final void g(boolean z10) {
        u7 u7Var = this.d;
        u7Var.X0 = z10;
        u7Var.P();
    }

    public final void h(Dialog dialog) {
        this.d.showDialog(dialog);
    }

    public final void i(boolean z10, boolean z11) {
        int i10;
        int i11;
        u7 u7Var = this.d;
        bi.f5 f5Var = u7Var.D0;
        int i12 = 8;
        if (f5Var != null) {
            if (z10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            f5Var.setVisibility(i11);
        }
        SurfaceView surfaceView = u7Var.C0;
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
        m7 m7Var = u7Var.B0;
        if (m7Var != null) {
            if (!z10) {
                i12 = 0;
            }
            m7Var.setVisibility(i12);
        }
    }

    public final void j() {
        int indexOf;
        u7 u7Var = this.d;
        a5 a5Var = this.f48650a;
        if (a5Var != null) {
            if (u7Var.f48947n0.f48418x0 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(u7Var.f48947n0.f48418x0);
            if (u7Var.f48947n0.getCurrentPeerView() == null) {
                indexOf = -1;
            } else {
                indexOf = arrayList.indexOf(u7Var.f48947n0.getCurrentPeerView().getCurrentDay());
            }
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
                if (!u7Var.f48947n0.E(true)) {
                    u7Var.q(false);
                    return;
                }
                u7Var.f48947n0.G0 = new xh.n1(this, a5Var, arrayList, 16);
                return;
            }
            u7Var.q(false);
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f48651b);
        int indexOf2 = arrayList2.indexOf(Long.valueOf(u7Var.f48947n0.getCurrentPeerView().getCurrentPeer()));
        if (indexOf2 >= 0) {
            arrayList2.remove(indexOf2);
            if (!u7Var.f48947n0.E(true)) {
                u7Var.q(false);
                return;
            }
            u7Var.f48947n0.G0 = new uu0(this, arrayList2, indexOf2, 19);
            return;
        }
        u7Var.q(false);
    }
}
