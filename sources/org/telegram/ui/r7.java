package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
public final class r7 extends j7 {
    public org.telegram.ui.Cells.r7 f40589n;
    public final ArrayList f40590r;
    public org.telegram.ui.Components.zq f40591s;
    public final v7 v;

    public r7(v7 v7Var) {
        super(v7Var, 1);
        this.v = v7Var;
        this.f40590r = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f40590r;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 < arrayList2.size()) {
                String path = ((p7) arrayList2.get(i10)).d.f4427a.getPath();
                if (((p7) arrayList2.get(i10)).d.d == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, path, 0, z10, 0, 0, 0L));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        if (this.f40591s == null) {
            org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(new ColorDrawable(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.X9, false)), org.telegram.ui.ActionBar.h6.R4);
            this.f40591s = zqVar;
            zqVar.f32999w = true;
        }
        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) b1Var.f45938a;
        bi.b bVar = ((p7) this.e.get(i10)).d;
        Object tag = s7Var.getTag();
        ImageReceiver imageReceiver = s7Var.f23026c;
        if (bVar == tag) {
            z10 = true;
        } else {
            z10 = false;
        }
        s7Var.setTag(bVar);
        int max = (int) Math.max(100.0f, AndroidUtilities.getRealScreenSize().x / AndroidUtilities.density);
        int i11 = bVar.d;
        File file = bVar.f4427a;
        if (i11 == 1) {
            imageReceiver.setImage(ImageLocation.getForPath("vthumb://0:" + file.getAbsolutePath()), a1.g.k(max, max, "_"), this.f40591s, null, null, 0);
            s7Var.m(AndroidUtilities.formatFileSize(bVar.f4429c), true);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath("thumb://0:" + file.getAbsolutePath()), a1.g.k(max, max, "_"), this.f40591s, null, null, 0);
            s7Var.m(AndroidUtilities.formatFileSize(bVar.f4429c), false);
        }
        s7Var.i(this.v.f42143f.f4438j.contains(bVar), z10);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        if (this.f40589n == null) {
            this.f40589n = new org.telegram.ui.Cells.r7(viewGroup.getContext(), null);
        }
        q7 q7Var = new q7(this, viewGroup.getContext(), this.f40589n, this.v.d.getCurrentAccount());
        q7Var.setStyle(1);
        return new s4.b1(q7Var);
    }
}
