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
public final class xv implements org.telegram.ui.Components.lq0, org.telegram.ui.Components.al0, org.telegram.ui.Components.bl0, o10, org.telegram.ui.ActionBar.a2, r0.n, org.telegram.ui.Components.nk0 {
    public final int f42903a;
    public final uy f42904b;

    public xv(uy uyVar, int i10) {
        this.f42903a = i10;
        this.f42904b = uyVar;
    }

    @Override
    public r0.l1 T0(View view, r0.l1 l1Var) {
        UndoView[] undoViewArr;
        uy uyVar = this.f42904b;
        uyVar.v.i(l1Var);
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        uyVar.f41269f4 = defaultWindowInsets.f11426b;
        uyVar.f41274g4 = defaultWindowInsets.d;
        int i10 = l1Var.f44711a.f(8).d;
        if (uyVar.f41279h4 != i10) {
            uyVar.f41279h4 = i10;
            uyVar.fragmentView.requestLayout();
        }
        uyVar.F0.setPadding(0, uyVar.f41269f4, 0, 0);
        uyVar.X4();
        for (UndoView undoView : uyVar.f41361y0) {
            if (undoView != null) {
                int i11 = uyVar.f41274g4 + uyVar.f41284i4;
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
        return r0.l1.f44710b;
    }

    @Override
    public boolean a(int i10, View view) {
        uy.o0(this.f42904b, i10);
        return false;
    }

    @Override
    public void b() {
        uy uyVar = this.f42904b;
        uyVar.Q = true;
        uyVar.fragmentView.invalidate();
    }

    @Override
    public void d(float r7, float r8, int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xv.d(float, float, int, android.view.View):void");
    }

    @Override
    public boolean d1(View view) {
        switch (this.f42903a) {
            case 1:
                return false;
            case 2:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42903a) {
            case 6:
                uy.g0(this.f42904b);
                return;
            case 7:
            default:
                uy uyVar = this.f42904b;
                uyVar.getMessagesController().hidePromoDialog();
                uyVar.b4(false);
                return;
            case 8:
                uy uyVar2 = this.f42904b;
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
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                return;
            case 9:
                uy uyVar3 = this.f42904b;
                uyVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    uyVar3.getParentActivity().startActivity(intent2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }

    public void h(int i10) {
        ex exVar = this.f42904b.B1;
        if (exVar == null) {
            return;
        }
        if (i10 == 0) {
            exVar.q0(true);
        } else {
            exVar.x1(true, false);
        }
    }

    public void i(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.f42904b.W4(z10, arrayList, arrayList2, z11, true);
    }

    @Override
    public void q0(View view, float f7, float f10) {
        int i10 = this.f42903a;
    }

    private final void c(View view, float f7, float f10) {
    }

    private final void e(View view, float f7, float f10) {
    }

    private final void f(View view, float f7, float f10) {
    }
}
