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
public final class xv implements org.telegram.ui.Components.zq0, org.telegram.ui.Components.ll0, org.telegram.ui.Components.ml0, o10, org.telegram.ui.ActionBar.a2, r0.n, org.telegram.ui.Components.yk0 {
    public final int f39631a;
    public final uy f39632b;

    public xv(uy uyVar, int i10) {
        this.f39631a = i10;
        this.f39632b = uyVar;
    }

    @Override
    public r0.m1 Q0(View view, r0.m1 m1Var) {
        UndoView[] undoViewArr;
        uy uyVar = this.f39632b;
        uyVar.v.i(m1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        uyVar.f38153e4 = defaultWindowInsets.f10592b;
        uyVar.f38159f4 = defaultWindowInsets.d;
        int i10 = m1Var.f42109a.f(8).d;
        if (uyVar.f38164g4 != i10) {
            uyVar.f38164g4 = i10;
            uyVar.fragmentView.requestLayout();
        }
        uyVar.F0.setPadding(0, uyVar.f38153e4, 0, 0);
        uyVar.X4();
        for (UndoView undoView : uyVar.f38250y0) {
            if (undoView != null) {
                int i11 = uyVar.f38159f4 + uyVar.f38169h4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        ox oxVar = uyVar.F3;
        if (oxVar != null) {
            r0.i0.b(oxVar, m1Var);
        }
        return r0.m1.f42108b;
    }

    @Override
    public void a() {
        uy uyVar = this.f39632b;
        uyVar.Q = true;
        uyVar.fragmentView.invalidate();
    }

    @Override
    public void c(float r7, float r8, int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xv.c(float, float, int, android.view.View):void");
    }

    @Override
    public boolean d(int i10, View view) {
        uy.o0(this.f39632b, i10);
        return false;
    }

    @Override
    public boolean d1(View view) {
        switch (this.f39631a) {
            case 1:
                return false;
            case 2:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39631a) {
            case 6:
                uy.g0(this.f39632b);
                return;
            case 7:
            default:
                uy uyVar = this.f39632b;
                uyVar.getMessagesController().hidePromoDialog();
                uyVar.b4(false);
                return;
            case 8:
                uy uyVar2 = this.f39632b;
                uyVar2.getClass();
                Intent permissionManagerIntent = XiaomiUtilities.getPermissionManagerIntent();
                if (permissionManagerIntent != null) {
                    try {
                        try {
                            uyVar2.getParentActivity().startActivity(permissionManagerIntent);
                            return;
                        } catch (Exception unused) {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                            uyVar2.getParentActivity().startActivity(intent);
                            return;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 9:
                uy uyVar3 = this.f39632b;
                uyVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    uyVar3.getParentActivity().startActivity(intent2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }

    public void h(int i10) {
        ex exVar = this.f39632b.B1;
        if (exVar == null) {
            return;
        }
        if (i10 == 0) {
            exVar.q0(true);
        } else {
            exVar.w1(true, false);
        }
    }

    public void i(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.f39632b.W4(z10, arrayList, arrayList2, z11, true);
    }

    @Override
    public void r0(View view, float f7, float f10) {
        int i10 = this.f39631a;
    }

    private final void b(View view, float f7, float f10) {
    }

    private final void e(View view, float f7, float f10) {
    }

    private final void g(View view, float f7, float f10) {
    }
}
