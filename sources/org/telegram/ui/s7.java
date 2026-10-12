package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
public final class s7 extends k7 {
    public org.telegram.ui.Cells.s7 f39978n;
    public final ArrayList f39979r;
    public org.telegram.ui.Components.cr f39980s;
    public final w7 v;

    public s7(w7 w7Var) {
        super(w7Var, 1);
        this.v = w7Var;
        this.f39979r = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f39979r;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 < arrayList2.size()) {
                String path = ((q7) arrayList2.get(i10)).d.f915a.getPath();
                if (((q7) arrayList2.get(i10)).d.d == 1) {
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
        if (this.f39980s == null) {
            org.telegram.ui.Components.cr crVar = new org.telegram.ui.Components.cr(new ColorDrawable(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.X9, false)), org.telegram.ui.ActionBar.g6.R4);
            this.f39980s = crVar;
            crVar.f24198w = true;
        }
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) b1Var.f44838a;
        ai.b bVar = ((q7) this.e.get(i10)).d;
        Object tag = t7Var.getTag();
        ImageReceiver imageReceiver = t7Var.f22101c;
        if (bVar == tag) {
            z10 = true;
        } else {
            z10 = false;
        }
        t7Var.setTag(bVar);
        int max = (int) Math.max(100.0f, AndroidUtilities.getRealScreenSize().x / AndroidUtilities.density);
        int i11 = bVar.d;
        File file = bVar.f915a;
        if (i11 == 1) {
            imageReceiver.setImage(ImageLocation.getForPath("vthumb://0:" + file.getAbsolutePath()), a1.g.k(max, max, "_"), this.f39980s, null, null, 0);
            t7Var.m(AndroidUtilities.formatFileSize(bVar.f917c), true);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath("thumb://0:" + file.getAbsolutePath()), a1.g.k(max, max, "_"), this.f39980s, null, null, 0);
            t7Var.m(AndroidUtilities.formatFileSize(bVar.f917c), false);
        }
        t7Var.i(this.v.f41173f.f926j.contains(bVar), z10);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        if (this.f39978n == null) {
            this.f39978n = new org.telegram.ui.Cells.s7(viewGroup.getContext(), null);
        }
        r7 r7Var = new r7(this, viewGroup.getContext(), this.f39978n, this.v.d.getCurrentAccount());
        r7Var.setStyle(1);
        return new s4.b1(r7Var);
    }
}
