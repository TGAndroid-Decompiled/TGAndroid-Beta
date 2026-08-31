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
public final class tv implements org.telegram.ui.Components.qq0, org.telegram.ui.Components.kl0, org.telegram.ui.Components.ll0, k10, org.telegram.ui.ActionBar.c2, r0.o, org.telegram.ui.Components.zk0 {
    public final int f41711a;
    public final py f41712b;

    public tv(py pyVar, int i10) {
        this.f41711a = i10;
        this.f41712b = pyVar;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        UndoView[] undoViewArr;
        py pyVar = this.f41712b;
        pyVar.v.i(m1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        pyVar.f40194c4 = defaultWindowInsets.f7758b;
        pyVar.f40199d4 = defaultWindowInsets.d;
        int i10 = m1Var.f46452a.f(8).d;
        if (pyVar.f40205e4 != i10) {
            pyVar.f40205e4 = i10;
            pyVar.fragmentView.requestLayout();
        }
        pyVar.C0.setPadding(0, pyVar.f40194c4, 0, 0);
        pyVar.X4();
        for (UndoView undoView : pyVar.f40287v0) {
            if (undoView != null) {
                int i11 = pyVar.f40199d4 + pyVar.f40211f4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        kx kxVar = pyVar.C3;
        if (kxVar != null) {
            r0.j0.b(kxVar, m1Var);
        }
        return r0.m1.f46451b;
    }

    @Override
    public boolean Y0(View view) {
        switch (this.f41711a) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tv.c(float, float, int, android.view.View):void");
    }

    @Override
    public void d() {
        py pyVar = this.f41712b;
        pyVar.N = true;
        pyVar.fragmentView.invalidate();
    }

    @Override
    public boolean f(int i10, View view) {
        py.n0(this.f41712b, i10);
        return false;
    }

    public void g(int i10) {
        ax axVar = this.f41712b.f40303y1;
        if (axVar == null) {
            return;
        }
        if (i10 == 0) {
            axVar.q0(true);
        } else {
            axVar.x1(true, false);
        }
    }

    public void h(boolean z4, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        this.f41712b.W4(z4, arrayList, arrayList2, z10, true);
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f41711a) {
            case 6:
                py.f0(this.f41712b);
                return;
            case 7:
            default:
                py pyVar = this.f41712b;
                pyVar.getMessagesController().hidePromoDialog();
                pyVar.b4(false);
                return;
            case 8:
                py pyVar2 = this.f41712b;
                pyVar2.getClass();
                Intent permissionManagerIntent = XiaomiUtilities.getPermissionManagerIntent();
                if (permissionManagerIntent != null) {
                    try {
                        try {
                            pyVar2.getParentActivity().startActivity(permissionManagerIntent);
                            return;
                        } catch (Exception unused) {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                            pyVar2.getParentActivity().startActivity(intent);
                            return;
                        }
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        return;
                    }
                }
                return;
            case 9:
                py pyVar3 = this.f41712b;
                pyVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    pyVar3.getParentActivity().startActivity(intent2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }

    @Override
    public void r0(View view, float f10, float f11) {
        int i10 = this.f41711a;
    }

    private final void a(View view, float f10, float f11) {
    }

    private final void b(View view, float f10, float f11) {
    }

    private final void e(View view, float f10, float f11) {
    }
}
