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
public final class tv implements org.telegram.ui.Components.lq0, org.telegram.ui.Components.bl0, org.telegram.ui.Components.cl0, l10, org.telegram.ui.ActionBar.a2, r0.n, org.telegram.ui.Components.ok0 {
    public final int f37765a;
    public final ry f37766b;

    public tv(ry ryVar, int i10) {
        this.f37765a = i10;
        this.f37766b = ryVar;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        UndoView[] undoViewArr;
        ry ryVar = this.f37766b;
        ryVar.v.i(l1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        ryVar.f36982e4 = defaultWindowInsets.f10577b;
        ryVar.f36988f4 = defaultWindowInsets.d;
        int i10 = l1Var.f41807a.f(8).d;
        if (ryVar.f36993g4 != i10) {
            ryVar.f36993g4 = i10;
            ryVar.fragmentView.requestLayout();
        }
        ryVar.F0.setPadding(0, ryVar.f36982e4, 0, 0);
        ryVar.X4();
        for (UndoView undoView : ryVar.f37079y0) {
            if (undoView != null) {
                int i11 = ryVar.f36988f4 + ryVar.f36998h4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        lx lxVar = ryVar.F3;
        if (lxVar != null) {
            r0.i0.b(lxVar, l1Var);
        }
        return r0.l1.f41806b;
    }

    @Override
    public void a() {
        ry ryVar = this.f37766b;
        ryVar.Q = true;
        ryVar.fragmentView.invalidate();
    }

    @Override
    public void c(float r7, float r8, int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tv.c(float, float, int, android.view.View):void");
    }

    @Override
    public boolean d(int i10, View view) {
        ry.o0(this.f37766b, i10);
        return false;
    }

    @Override
    public boolean d1(View view) {
        switch (this.f37765a) {
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
        switch (this.f37765a) {
            case 6:
                ry.f0(this.f37766b);
                return;
            case 7:
            default:
                ry ryVar = this.f37766b;
                ryVar.getMessagesController().hidePromoDialog();
                ryVar.b4(false);
                return;
            case 8:
                ry ryVar2 = this.f37766b;
                ryVar2.getClass();
                Intent permissionManagerIntent = XiaomiUtilities.getPermissionManagerIntent();
                if (permissionManagerIntent != null) {
                    try {
                        try {
                            ryVar2.getParentActivity().startActivity(permissionManagerIntent);
                            return;
                        } catch (Exception unused) {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                            ryVar2.getParentActivity().startActivity(intent);
                            return;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 9:
                ry ryVar3 = this.f37766b;
                ryVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    ryVar3.getParentActivity().startActivity(intent2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }

    public void h(int i10) {
        bx bxVar = this.f37766b.B1;
        if (bxVar == null) {
            return;
        }
        if (i10 == 0) {
            bxVar.r0(true);
        } else {
            bxVar.y1(true, false);
        }
    }

    public void i(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.f37766b.W4(z10, arrayList, arrayList2, z11, true);
    }

    @Override
    public void r0(View view, float f7, float f10) {
        int i10 = this.f37765a;
    }

    private final void b(View view, float f7, float f10) {
    }

    private final void e(View view, float f7, float f10) {
    }

    private final void g(View view, float f7, float f10) {
    }
}
