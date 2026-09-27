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
public final class wv implements org.telegram.ui.Components.zq0, org.telegram.ui.Components.nl0, org.telegram.ui.Components.ol0, n10, org.telegram.ui.ActionBar.b2, li.h, r0.n, li.i, org.telegram.ui.Components.al0 {
    public final int f39461a;
    public final ty f39462b;

    public wv(ty tyVar, int i10) {
        this.f39461a = i10;
        this.f39462b = tyVar;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        UndoView[] undoViewArr;
        ty tyVar = this.f39462b;
        tyVar.v.i(l1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        tyVar.f37980e4 = defaultWindowInsets.f10580b;
        tyVar.f37986f4 = defaultWindowInsets.d;
        int i10 = l1Var.f42185a.f(8).d;
        if (tyVar.f37991g4 != i10) {
            tyVar.f37991g4 = i10;
            tyVar.fragmentView.requestLayout();
        }
        tyVar.F0.setPadding(0, tyVar.f37980e4, 0, 0);
        tyVar.g5();
        for (UndoView undoView : tyVar.f38076y0) {
            if (undoView != null) {
                int i11 = tyVar.f37986f4 + tyVar.f37996h4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        kx kxVar = tyVar.F3;
        if (kxVar != null) {
            r0.i0.b(kxVar, l1Var);
        }
        return r0.l1.f42184b;
    }

    @Override
    public void c(float r7, float r8, int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wv.c(float, float, int, android.view.View):void");
    }

    @Override
    public boolean d(int i10, View view) {
        ty.o0(this.f39462b, i10);
        return false;
    }

    @Override
    public boolean d1(View view) {
        switch (this.f39461a) {
            case 1:
                return false;
            case 2:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void e() {
        ty tyVar = this.f39462b;
        tyVar.Q = true;
        tyVar.fragmentView.invalidate();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f39461a) {
            case 6:
                ty.f0(this.f39462b);
                return;
            case 7:
            case 8:
            default:
                ty tyVar = this.f39462b;
                tyVar.getMessagesController().hidePromoDialog();
                tyVar.k4(false);
                return;
            case 9:
                ty tyVar2 = this.f39462b;
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
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 10:
                ty tyVar3 = this.f39462b;
                tyVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    tyVar3.getParentActivity().startActivity(intent2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }

    @Override
    public int g() {
        ty tyVar = this.f39462b;
        tyVar.getClass();
        return tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.f19057d6);
    }

    public void i(int i10) {
        ax axVar = this.f39462b.B1;
        if (axVar == null) {
            return;
        }
        if (i10 == 0) {
            axVar.q0(true);
        } else {
            axVar.w1(true, false);
        }
    }

    @Override
    public void j(int i10) {
        ty.C0(this.f39462b, i10);
    }

    public void k(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.f39462b.f5(z10, arrayList, arrayList2, z11, true);
    }

    @Override
    public void r0(View view, float f7, float f10) {
        int i10 = this.f39461a;
    }

    private final void a(View view, float f7, float f10) {
    }

    private final void b(View view, float f7, float f10) {
    }

    private final void h(View view, float f7, float f10) {
    }
}
