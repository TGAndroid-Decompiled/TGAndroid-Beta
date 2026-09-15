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
public final class wv implements org.telegram.ui.Components.lq0, org.telegram.ui.Components.al0, org.telegram.ui.Components.bl0, o10, org.telegram.ui.ActionBar.a2, r0.n, org.telegram.ui.Components.nk0 {
    public final int f39394a;
    public final uy f39395b;

    public wv(uy uyVar, int i10) {
        this.f39394a = i10;
        this.f39395b = uyVar;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        UndoView[] undoViewArr;
        uy uyVar = this.f39395b;
        uyVar.v.i(l1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        uyVar.f38217f4 = defaultWindowInsets.f10589b;
        uyVar.f38222g4 = defaultWindowInsets.d;
        int i10 = l1Var.f41855a.f(8).d;
        if (uyVar.f38227h4 != i10) {
            uyVar.f38227h4 = i10;
            uyVar.fragmentView.requestLayout();
        }
        uyVar.F0.setPadding(0, uyVar.f38217f4, 0, 0);
        uyVar.X4();
        for (UndoView undoView : uyVar.f38309y0) {
            if (undoView != null) {
                int i11 = uyVar.f38222g4 + uyVar.f38232i4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        ox oxVar = uyVar.F3;
        if (oxVar != null) {
            r0.i0.b(oxVar, l1Var);
        }
        return r0.l1.f41854b;
    }

    @Override
    public void a() {
        uy uyVar = this.f39395b;
        uyVar.Q = true;
        uyVar.fragmentView.invalidate();
    }

    @Override
    public void c(float r7, float r8, int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wv.c(float, float, int, android.view.View):void");
    }

    @Override
    public boolean d(int i10, View view) {
        uy.o0(this.f39395b, i10);
        return false;
    }

    @Override
    public boolean d1(View view) {
        switch (this.f39394a) {
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
        switch (this.f39394a) {
            case 6:
                uy.g0(this.f39395b);
                return;
            case 7:
            default:
                uy uyVar = this.f39395b;
                uyVar.getMessagesController().hidePromoDialog();
                uyVar.b4(false);
                return;
            case 8:
                uy uyVar2 = this.f39395b;
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
                uy uyVar3 = this.f39395b;
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
        ex exVar = this.f39395b.B1;
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
        this.f39395b.W4(z10, arrayList, arrayList2, z11, true);
    }

    @Override
    public void r0(View view, float f7, float f10) {
        int i10 = this.f39394a;
    }

    private final void b(View view, float f7, float f10) {
    }

    private final void e(View view, float f7, float f10) {
    }

    private final void g(View view, float f7, float f10) {
    }
}
