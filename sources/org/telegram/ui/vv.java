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
public final class vv implements org.telegram.ui.Components.qr0, org.telegram.ui.Components.fm0, org.telegram.ui.Components.gm0, n10, org.telegram.ui.ActionBar.a2, r0.n, org.telegram.ui.Components.sl0 {
    public final int f42987a;
    public final ty f42988b;

    public vv(ty tyVar, int i10) {
        this.f42987a = i10;
        this.f42988b = tyVar;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        UndoView[] undoViewArr;
        ty tyVar = this.f42988b;
        tyVar.v.k(k1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        tyVar.f42176e4 = defaultWindowInsets.f11577b;
        tyVar.f42182f4 = defaultWindowInsets.d;
        int i10 = k1Var.f46775a.f(8).d;
        if (tyVar.f42187g4 != i10) {
            tyVar.f42187g4 = i10;
            tyVar.fragmentView.requestLayout();
        }
        tyVar.F0.setPadding(0, tyVar.f42176e4, 0, 0);
        tyVar.U4();
        for (UndoView undoView : tyVar.f42273y0) {
            if (undoView != null) {
                int i11 = tyVar.f42182f4 + tyVar.f42192h4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        nx nxVar = tyVar.F3;
        if (nxVar != null) {
            r0.i0.b(nxVar, k1Var);
        }
        return r0.k1.f46774b;
    }

    @Override
    public boolean Y0(View view) {
        switch (this.f42987a) {
            case 1:
                return false;
            case 2:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void a() {
        ty tyVar = this.f42988b;
        tyVar.Q = true;
        tyVar.fragmentView.invalidate();
    }

    @Override
    public void c(float r7, float r8, int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vv.c(float, float, int, android.view.View):void");
    }

    @Override
    public boolean d(int i10, View view) {
        ty.m0(this.f42988b, i10);
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42987a) {
            case 6:
                ty.d0(this.f42988b);
                return;
            case 7:
            default:
                ty tyVar = this.f42988b;
                tyVar.getMessagesController().hidePromoDialog();
                tyVar.Y3(false);
                return;
            case 8:
                ty tyVar2 = this.f42988b;
                tyVar2.getClass();
                Intent permissionManagerIntent = XiaomiUtilities.getPermissionManagerIntent();
                if (permissionManagerIntent != null) {
                    try {
                        try {
                            tyVar2.getParentActivity().startActivity(permissionManagerIntent);
                            return;
                        } catch (Exception unused) {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                            tyVar2.getParentActivity().startActivity(intent);
                            return;
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                return;
            case 9:
                ty tyVar3 = this.f42988b;
                tyVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    tyVar3.getParentActivity().startActivity(intent2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }

    public void h(int i10) {
        dx dxVar = this.f42988b.B1;
        if (dxVar == null) {
            return;
        }
        if (i10 == 0) {
            dxVar.o0(true);
        } else {
            dxVar.v1(true, false);
        }
    }

    public void i(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.f42988b.T4(z10, arrayList, arrayList2, z11, true);
    }

    @Override
    public void n0(View view, float f7, float f10) {
        int i10 = this.f42987a;
    }

    private final void b(View view, float f7, float f10) {
    }

    private final void e(View view, float f7, float f10) {
    }

    private final void g(View view, float f7, float f10) {
    }
}
