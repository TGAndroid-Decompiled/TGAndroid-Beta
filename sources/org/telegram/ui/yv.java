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
public final class yv implements org.telegram.ui.Components.wq0, org.telegram.ui.Components.kl0, org.telegram.ui.Components.ll0, q10, org.telegram.ui.ActionBar.c2, r0.n, org.telegram.ui.Components.xk0 {
    public final int f39115a;
    public final wy f39116b;

    public yv(wy wyVar, int i10) {
        this.f39115a = i10;
        this.f39116b = wyVar;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        UndoView[] undoViewArr;
        wy wyVar = this.f39116b;
        wyVar.v.i(l1Var);
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        wyVar.f38441f4 = defaultWindowInsets.f10075b;
        wyVar.f38446g4 = defaultWindowInsets.d;
        int i10 = l1Var.f41074a.f(8).d;
        if (wyVar.f38451h4 != i10) {
            wyVar.f38451h4 = i10;
            wyVar.fragmentView.requestLayout();
        }
        wyVar.F0.setPadding(0, wyVar.f38441f4, 0, 0);
        wyVar.X4();
        for (UndoView undoView : wyVar.f38533y0) {
            if (undoView != null) {
                int i11 = wyVar.f38446g4 + wyVar.f38456i4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        qx qxVar = wyVar.F3;
        if (qxVar != null) {
            r0.i0.b(qxVar, l1Var);
        }
        return r0.l1.f41073b;
    }

    @Override
    public void a() {
        wy wyVar = this.f39116b;
        wyVar.Q = true;
        wyVar.fragmentView.invalidate();
    }

    @Override
    public void c(float r7, float r8, int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yv.c(float, float, int, android.view.View):void");
    }

    @Override
    public boolean d(int i10, View view) {
        wy.o0(this.f39116b, i10);
        return false;
    }

    @Override
    public boolean d1(View view) {
        switch (this.f39115a) {
            case 1:
                return false;
            case 2:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f39115a) {
            case 6:
                wy.g0(this.f39116b);
                return;
            case 7:
            default:
                wy wyVar = this.f39116b;
                wyVar.getMessagesController().hidePromoDialog();
                wyVar.b4(false);
                return;
            case 8:
                wy wyVar2 = this.f39116b;
                wyVar2.getClass();
                Intent permissionManagerIntent = XiaomiUtilities.getPermissionManagerIntent();
                if (permissionManagerIntent != null) {
                    try {
                        try {
                            wyVar2.getParentActivity().startActivity(permissionManagerIntent);
                            return;
                        } catch (Exception unused) {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                            wyVar2.getParentActivity().startActivity(intent);
                            return;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 9:
                wy wyVar3 = this.f39116b;
                wyVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    wyVar3.getParentActivity().startActivity(intent2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }

    public void h(int i10) {
        gx gxVar = this.f39116b.B1;
        if (gxVar == null) {
            return;
        }
        if (i10 == 0) {
            gxVar.q0(true);
        } else {
            gxVar.x1(true, false);
        }
    }

    public void i(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.f39116b.W4(z10, arrayList, arrayList2, z11, true);
    }

    @Override
    public void p0(View view, float f7, float f10) {
        int i10 = this.f39115a;
    }

    private final void b(View view, float f7, float f10) {
    }

    private final void e(View view, float f7, float f10) {
    }

    private final void g(View view, float f7, float f10) {
    }
}
