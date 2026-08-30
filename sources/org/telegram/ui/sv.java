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
public final class sv implements org.telegram.ui.Components.pq0, org.telegram.ui.Components.jl0, org.telegram.ui.Components.kl0, k10, org.telegram.ui.ActionBar.c2, r0.o, org.telegram.ui.Components.yk0 {
    public final int f38443a;
    public final oy f38444b;

    public sv(oy oyVar, int i10) {
        this.f38443a = i10;
        this.f38444b = oyVar;
    }

    @Override
    public r0.m1 N0(View view, r0.m1 m1Var) {
        UndoView[] undoViewArr;
        oy oyVar = this.f38444b;
        oyVar.v.i(m1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        oyVar.f37018c4 = defaultWindowInsets.f7214b;
        oyVar.f37023d4 = defaultWindowInsets.d;
        int i10 = m1Var.f43130a.f(8).d;
        if (oyVar.f37028e4 != i10) {
            oyVar.f37028e4 = i10;
            oyVar.fragmentView.requestLayout();
        }
        oyVar.C0.setPadding(0, oyVar.f37018c4, 0, 0);
        oyVar.X4();
        for (UndoView undoView : oyVar.f37110v0) {
            if (undoView != null) {
                int i11 = oyVar.f37023d4 + oyVar.f37034f4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        jx jxVar = oyVar.C3;
        if (jxVar != null) {
            r0.j0.b(jxVar, m1Var);
        }
        return r0.m1.f43129b;
    }

    @Override
    public void c(float r7, float r8, int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sv.c(float, float, int, android.view.View):void");
    }

    @Override
    public void d() {
        oy oyVar = this.f38444b;
        oyVar.N = true;
        oyVar.fragmentView.invalidate();
    }

    @Override
    public boolean e1(View view) {
        switch (this.f38443a) {
            case 1:
                return false;
            case 2:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean f(int i10, View view) {
        oy.n0(this.f38444b, i10);
        return false;
    }

    public void g(int i10) {
        zw zwVar = this.f38444b.f37126y1;
        if (zwVar == null) {
            return;
        }
        if (i10 == 0) {
            zwVar.q0(true);
        } else {
            zwVar.x1(true, false);
        }
    }

    public void h(boolean z4, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        this.f38444b.W4(z4, arrayList, arrayList2, z10, true);
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f38443a) {
            case 6:
                oy.f0(this.f38444b);
                return;
            case 7:
            default:
                oy oyVar = this.f38444b;
                oyVar.getMessagesController().hidePromoDialog();
                oyVar.b4(false);
                return;
            case 8:
                oy oyVar2 = this.f38444b;
                oyVar2.getClass();
                Intent permissionManagerIntent = XiaomiUtilities.getPermissionManagerIntent();
                if (permissionManagerIntent != null) {
                    try {
                        try {
                            oyVar2.getParentActivity().startActivity(permissionManagerIntent);
                            return;
                        } catch (Exception unused) {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                            oyVar2.getParentActivity().startActivity(intent);
                            return;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            case 9:
                oy oyVar3 = this.f38444b;
                oyVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    oyVar3.getParentActivity().startActivity(intent2);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
        }
    }

    @Override
    public void o0(View view, float f10, float f11) {
        int i10 = this.f38443a;
    }

    private final void a(View view, float f10, float f11) {
    }

    private final void b(View view, float f10, float f11) {
    }

    private final void e(View view, float f10, float f11) {
    }
}
