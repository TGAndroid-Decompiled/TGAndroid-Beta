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
public final class xv implements org.telegram.ui.Components.er0, org.telegram.ui.Components.nl0, org.telegram.ui.Components.ol0, o10, org.telegram.ui.ActionBar.a2, li.l, r0.n, li.m, org.telegram.ui.Components.al0 {
    public final int f43021a;
    public final uy f43022b;

    public xv(uy uyVar, int i10) {
        this.f43021a = i10;
        this.f43022b = uyVar;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        UndoView[] undoViewArr;
        uy uyVar = this.f43022b;
        uyVar.v.i(l1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        uyVar.f41439e4 = defaultWindowInsets.f11527b;
        uyVar.f41445f4 = defaultWindowInsets.d;
        int i10 = l1Var.f45624a.f(8).d;
        if (uyVar.f41450g4 != i10) {
            uyVar.f41450g4 = i10;
            uyVar.fragmentView.requestLayout();
        }
        uyVar.F0.setPadding(0, uyVar.f41439e4, 0, 0);
        uyVar.g5();
        for (UndoView undoView : uyVar.f41535y0) {
            if (undoView != null) {
                int i11 = uyVar.f41445f4 + uyVar.f41455h4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        mx mxVar = uyVar.F3;
        if (mxVar != null) {
            r0.i0.b(mxVar, l1Var);
        }
        return r0.l1.f45623b;
    }

    @Override
    public void c(float r7, float r8, int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xv.c(float, float, int, android.view.View):void");
    }

    @Override
    public boolean d(int i10, View view) {
        uy.o0(this.f43022b, i10);
        return false;
    }

    @Override
    public void e() {
        uy uyVar = this.f43022b;
        uyVar.Q = true;
        uyVar.fragmentView.invalidate();
    }

    @Override
    public int f() {
        uy uyVar = this.f43022b;
        uyVar.getClass();
        return uyVar.getThemedColor(org.telegram.ui.ActionBar.i6.f20827d6);
    }

    @Override
    public boolean f1(View view) {
        switch (this.f43021a) {
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
        switch (this.f43021a) {
            case 6:
                uy.f0(this.f43022b);
                return;
            case 7:
            case 8:
            default:
                uy uyVar = this.f43022b;
                uyVar.getMessagesController().hidePromoDialog();
                uyVar.k4(false);
                return;
            case 9:
                uy uyVar2 = this.f43022b;
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
            case 10:
                uy uyVar3 = this.f43022b;
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

    public void i(int i10) {
        cx cxVar = this.f43022b.B1;
        if (cxVar == null) {
            return;
        }
        if (i10 == 0) {
            cxVar.q0(true);
        } else {
            cxVar.w1(true, false);
        }
    }

    public void j(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.f43022b.f5(z10, arrayList, arrayList2, z11, true);
    }

    @Override
    public void k(int i10) {
        uy.C0(this.f43022b, i10);
    }

    @Override
    public void s0(View view, float f7, float f10) {
        int i10 = this.f43021a;
    }

    private final void a(View view, float f7, float f10) {
    }

    private final void b(View view, float f7, float f10) {
    }

    private final void h(View view, float f7, float f10) {
    }
}
