package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.XiaomiUtilities;
import org.telegram.ui.Components.UndoView;
public final class uv implements org.telegram.ui.Components.pq0, org.telegram.ui.Components.il0, org.telegram.ui.Components.jl0, l10, org.telegram.ui.ActionBar.c2, r0.o, org.telegram.ui.Components.xk0 {
    public final int f38919a;
    public final qy f38920b;

    public uv(qy qyVar, int i10) {
        this.f38919a = i10;
        this.f38920b = qyVar;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        UndoView[] undoViewArr;
        qy qyVar = this.f38920b;
        qyVar.v.i(m1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        qyVar.f37536c4 = defaultWindowInsets.f7197b;
        qyVar.f37541d4 = defaultWindowInsets.d;
        int i10 = m1Var.f43154a.f(8).d;
        if (qyVar.f37546e4 != i10) {
            qyVar.f37546e4 = i10;
            qyVar.fragmentView.requestLayout();
        }
        qyVar.C0.setPadding(0, qyVar.f37536c4, 0, 0);
        qyVar.X4();
        for (UndoView undoView : qyVar.f37628v0) {
            if (undoView != null) {
                int i11 = qyVar.f37541d4 + qyVar.f37552f4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        lx lxVar = qyVar.C3;
        if (lxVar != null) {
            r0.j0.b(lxVar, m1Var);
        }
        return r0.m1.f43153b;
    }

    @Override
    public boolean Z0(View view) {
        switch (this.f38919a) {
            case 1:
                return false;
            case 2:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c(float r7, float r8, int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uv.c(float, float, int, android.view.View):void");
    }

    @Override
    public boolean d(int i10, View view) {
        qy.n0(this.f38920b, i10);
        return false;
    }

    @Override
    public void e() {
        qy qyVar = this.f38920b;
        qyVar.N = true;
        qyVar.fragmentView.invalidate();
    }

    public void g(int i10) {
        bx bxVar = this.f38920b.f37644y1;
        if (bxVar == null) {
            return;
        }
        if (i10 == 0) {
            bxVar.q0(true);
        } else {
            bxVar.x1(true, false);
        }
    }

    public void h(boolean z4, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        this.f38920b.W4(z4, arrayList, arrayList2, z10, true);
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f38919a) {
            case 6:
                qy.f0(this.f38920b);
                return;
            case 7:
            default:
                qy qyVar = this.f38920b;
                qyVar.getMessagesController().hidePromoDialog();
                qyVar.b4(false);
                return;
            case 8:
                qy qyVar2 = this.f38920b;
                qyVar2.getClass();
                Intent permissionManagerIntent = XiaomiUtilities.getPermissionManagerIntent();
                if (permissionManagerIntent != null) {
                    try {
                        try {
                            qyVar2.getParentActivity().startActivity(permissionManagerIntent);
                            return;
                        } catch (Exception unused) {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                            qyVar2.getParentActivity().startActivity(intent);
                            return;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 9:
                qy qyVar3 = this.f38920b;
                qyVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    qyVar3.getParentActivity().startActivity(intent2);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
        }
    }

    @Override
    public void n0(View view, float f10, float f11) {
        int i10 = this.f38919a;
    }

    private final void a(View view, float f10, float f11) {
    }

    private final void b(View view, float f10, float f11) {
    }

    private final void f(View view, float f10, float f11) {
    }
}
