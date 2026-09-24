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
public final class sv implements org.telegram.ui.Components.yq0, org.telegram.ui.Components.ll0, org.telegram.ui.Components.ml0, k10, org.telegram.ui.ActionBar.z1, r0.n, org.telegram.ui.Components.yk0 {
    public final int f37855a;
    public final qy f37856b;

    public sv(qy qyVar, int i10) {
        this.f37855a = i10;
        this.f37856b = qyVar;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        UndoView[] undoViewArr;
        qy qyVar = this.f37856b;
        qyVar.v.i(l1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        qyVar.f37025e4 = defaultWindowInsets.f10577b;
        qyVar.f37031f4 = defaultWindowInsets.d;
        int i10 = l1Var.f42126a.f(8).d;
        if (qyVar.f37036g4 != i10) {
            qyVar.f37036g4 = i10;
            qyVar.fragmentView.requestLayout();
        }
        qyVar.F0.setPadding(0, qyVar.f37025e4, 0, 0);
        qyVar.X4();
        for (UndoView undoView : qyVar.f37122y0) {
            if (undoView != null) {
                int i11 = qyVar.f37031f4 + qyVar.f37041h4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        kx kxVar = qyVar.F3;
        if (kxVar != null) {
            r0.i0.b(kxVar, l1Var);
        }
        return r0.l1.f42125b;
    }

    @Override
    public void a() {
        qy qyVar = this.f37856b;
        qyVar.Q = true;
        qyVar.fragmentView.invalidate();
    }

    @Override
    public void c(float r7, float r8, int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sv.c(float, float, int, android.view.View):void");
    }

    @Override
    public boolean d(int i10, View view) {
        qy.o0(this.f37856b, i10);
        return false;
    }

    @Override
    public boolean d1(View view) {
        switch (this.f37855a) {
            case 1:
                return false;
            case 2:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f37855a) {
            case 6:
                qy.f0(this.f37856b);
                return;
            case 7:
            default:
                qy qyVar = this.f37856b;
                qyVar.getMessagesController().hidePromoDialog();
                qyVar.b4(false);
                return;
            case 8:
                qy qyVar2 = this.f37856b;
                qyVar2.getClass();
                Intent permissionManagerIntent = XiaomiUtilities.getPermissionManagerIntent();
                if (permissionManagerIntent != null) {
                    try {
                        try {
                            qyVar2.getParentActivity().startActivity(permissionManagerIntent);
                            return;
                        } catch (Exception unused) {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                            qyVar2.getParentActivity().startActivity(intent);
                            return;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 9:
                qy qyVar3 = this.f37856b;
                qyVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    qyVar3.getParentActivity().startActivity(intent2);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }

    public void h(int i10) {
        ax axVar = this.f37856b.B1;
        if (axVar == null) {
            return;
        }
        if (i10 == 0) {
            axVar.q0(true);
        } else {
            axVar.x1(true, false);
        }
    }

    public void i(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.f37856b.W4(z10, arrayList, arrayList2, z11, true);
    }

    @Override
    public void r0(View view, float f7, float f10) {
        int i10 = this.f37855a;
    }

    private final void b(View view, float f7, float f10) {
    }

    private final void e(View view, float f7, float f10) {
    }

    private final void g(View view, float f7, float f10) {
    }
}
