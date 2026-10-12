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
public final class xv implements org.telegram.ui.Components.wr0, org.telegram.ui.Components.lm0, org.telegram.ui.Components.mm0, p10, org.telegram.ui.ActionBar.z1, r0.n, org.telegram.ui.Components.yl0 {
    public final int f44180a;
    public final vy f44181b;

    public xv(vy vyVar, int i10) {
        this.f44180a = i10;
        this.f44181b = vyVar;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        UndoView[] undoViewArr;
        vy vyVar = this.f44181b;
        vyVar.v.k(k1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        vyVar.f42907e4 = defaultWindowInsets.f11575b;
        vyVar.f42913f4 = defaultWindowInsets.d;
        int i10 = k1Var.f46992a.f(8).d;
        if (vyVar.f42918g4 != i10) {
            vyVar.f42918g4 = i10;
            vyVar.fragmentView.requestLayout();
        }
        vyVar.F0.setPadding(0, vyVar.f42907e4, 0, 0);
        vyVar.U4();
        for (UndoView undoView : vyVar.f43004y0) {
            if (undoView != null) {
                int i11 = vyVar.f42913f4 + vyVar.f42923h4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        px pxVar = vyVar.F3;
        if (pxVar != null) {
            r0.i0.b(pxVar, k1Var);
        }
        return r0.k1.f46991b;
    }

    @Override
    public boolean Y0(View view) {
        switch (this.f44180a) {
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
        vy vyVar = this.f44181b;
        vyVar.Q = true;
        vyVar.fragmentView.invalidate();
    }

    @Override
    public void c(float r7, float r8, int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xv.c(float, float, int, android.view.View):void");
    }

    @Override
    public boolean d(int i10, View view) {
        vy.m0(this.f44181b, i10);
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f44180a) {
            case 6:
                vy.d0(this.f44181b);
                return;
            case 7:
            default:
                vy vyVar = this.f44181b;
                vyVar.getMessagesController().hidePromoDialog();
                vyVar.Y3(false);
                return;
            case 8:
                vy vyVar2 = this.f44181b;
                vyVar2.getClass();
                Intent permissionManagerIntent = XiaomiUtilities.getPermissionManagerIntent();
                if (permissionManagerIntent != null) {
                    try {
                        try {
                            vyVar2.getParentActivity().startActivity(permissionManagerIntent);
                            return;
                        } catch (Exception unused) {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                            vyVar2.getParentActivity().startActivity(intent);
                            return;
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                return;
            case 9:
                vy vyVar3 = this.f44181b;
                vyVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    vyVar3.getParentActivity().startActivity(intent2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }

    public void h(int i10) {
        fx fxVar = this.f44181b.B1;
        if (fxVar == null) {
            return;
        }
        if (i10 == 0) {
            fxVar.r0(true);
        } else {
            fxVar.z1(true, false);
        }
    }

    public void i(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.f44181b.T4(z10, arrayList, arrayList2, z11, true);
    }

    @Override
    public void n0(View view, float f7, float f10) {
        int i10 = this.f44180a;
    }

    private final void b(View view, float f7, float f10) {
    }

    private final void e(View view, float f7, float f10) {
    }

    private final void g(View view, float f7, float f10) {
    }
}
