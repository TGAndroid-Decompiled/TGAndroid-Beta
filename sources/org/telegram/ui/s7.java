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
    public org.telegram.ui.Cells.v7 f43374n;
    public final ArrayList f43375r;
    public org.telegram.ui.Components.ar f43376s;
    public final x7 v;

    public s7(x7 x7Var) {
        super(x7Var, 1);
        this.v = x7Var;
        this.f43375r = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f43375r;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 < arrayList2.size()) {
                String path = ((q7) arrayList2.get(i10)).d.f6364a.getPath();
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
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        if (this.f43376s == null) {
            org.telegram.ui.Components.ar arVar = new org.telegram.ui.Components.ar(new ColorDrawable(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.X9, false)), org.telegram.ui.ActionBar.y6.R4);
            this.f43376s = arVar;
            arVar.f26599w = true;
        }
        org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) e1Var.f47738a;
        ci.a aVar = ((q7) this.e.get(i10)).d;
        Object tag = w7Var.getTag();
        ImageReceiver imageReceiver = w7Var.f25638c;
        if (aVar == tag) {
            z10 = true;
        } else {
            z10 = false;
        }
        w7Var.setTag(aVar);
        int max = (int) Math.max(100.0f, AndroidUtilities.getRealScreenSize().x / AndroidUtilities.density);
        int i11 = aVar.d;
        File file = aVar.f6364a;
        if (i11 == 1) {
            imageReceiver.setImage(ImageLocation.getForPath("vthumb://0:" + file.getAbsolutePath()), a1.g.k(max, max, "_"), this.f43376s, null, null, 0);
            w7Var.m(AndroidUtilities.formatFileSize(aVar.f6366c), true);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath("thumb://0:" + file.getAbsolutePath()), a1.g.k(max, max, "_"), this.f43376s, null, null, 0);
            w7Var.m(AndroidUtilities.formatFileSize(aVar.f6366c), false);
        }
        w7Var.i(this.v.h.f6375j.contains(aVar), z10);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        if (this.f43374n == null) {
            this.f43374n = new org.telegram.ui.Cells.v7(viewGroup.getContext(), null);
        }
        r7 r7Var = new r7(this, viewGroup.getContext(), this.f43374n, this.v.e.getCurrentAccount());
        r7Var.setStyle(1);
        return new s4.e1(r7Var);
    }
}
