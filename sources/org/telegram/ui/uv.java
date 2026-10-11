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
public final class uv implements org.telegram.ui.Components.rr0, org.telegram.ui.Components.gm0, org.telegram.ui.Components.hm0, m10, org.telegram.ui.ActionBar.z1, r0.n, org.telegram.ui.Components.tl0 {
    public final int f42809a;
    public final sy f42810b;

    public uv(sy syVar, int i10) {
        this.f42809a = i10;
        this.f42810b = syVar;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        UndoView[] undoViewArr;
        sy syVar = this.f42810b;
        syVar.v.k(k1Var);
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        syVar.f41945e4 = defaultWindowInsets.f11576b;
        syVar.f41951f4 = defaultWindowInsets.d;
        int i10 = k1Var.f46901a.f(8).d;
        if (syVar.f41956g4 != i10) {
            syVar.f41956g4 = i10;
            syVar.fragmentView.requestLayout();
        }
        syVar.F0.setPadding(0, syVar.f41945e4, 0, 0);
        syVar.U4();
        for (UndoView undoView : syVar.f42042y0) {
            if (undoView != null) {
                int i11 = syVar.f41951f4 + syVar.f41961h4;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i11) {
                    marginLayoutParams.bottomMargin = i11;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        mx mxVar = syVar.F3;
        if (mxVar != null) {
            r0.i0.b(mxVar, k1Var);
        }
        return r0.k1.f46900b;
    }

    @Override
    public boolean Y0(View view) {
        switch (this.f42809a) {
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
        sy syVar = this.f42810b;
        syVar.Q = true;
        syVar.fragmentView.invalidate();
    }

    @Override
    public void c(float r7, float r8, int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.uv.c(float, float, int, android.view.View):void");
    }

    @Override
    public boolean d(int i10, View view) {
        sy.m0(this.f42810b, i10);
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f42809a) {
            case 6:
                sy.d0(this.f42810b);
                return;
            case 7:
            default:
                sy syVar = this.f42810b;
                syVar.getMessagesController().hidePromoDialog();
                syVar.Y3(false);
                return;
            case 8:
                sy syVar2 = this.f42810b;
                syVar2.getClass();
                Intent permissionManagerIntent = XiaomiUtilities.getPermissionManagerIntent();
                if (permissionManagerIntent != null) {
                    try {
                        try {
                            syVar2.getParentActivity().startActivity(permissionManagerIntent);
                            return;
                        } catch (Exception unused) {
                            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                            syVar2.getParentActivity().startActivity(intent);
                            return;
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                return;
            case 9:
                sy syVar3 = this.f42810b;
                syVar3.getClass();
                Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent2.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                try {
                    syVar3.getParentActivity().startActivity(intent2);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }

    public void h(int i10) {
        cx cxVar = this.f42810b.B1;
        if (cxVar == null) {
            return;
        }
        if (i10 == 0) {
            cxVar.o0(true);
        } else {
            cxVar.v1(true, false);
        }
    }

    public void i(boolean z10, ArrayList arrayList, ArrayList arrayList2, boolean z11) {
        this.f42810b.T4(z10, arrayList, arrayList2, z11, true);
    }

    @Override
    public void n0(View view, float f7, float f10) {
        int i10 = this.f42809a;
    }

    private final void b(View view, float f7, float f10) {
    }

    private final void e(View view, float f7, float f10) {
    }

    private final void g(View view, float f7, float f10) {
    }
}
