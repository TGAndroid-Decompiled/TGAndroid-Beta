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
    public org.telegram.ui.Cells.p7 f38112n;
    public final ArrayList f38113r;
    public org.telegram.ui.Components.mq f38114s;
    public final w7 v;

    public s7(w7 w7Var) {
        super(w7Var, 1);
        this.v = w7Var;
        this.f38113r = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z4;
        super.F();
        ArrayList arrayList = this.f38113r;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 < arrayList2.size()) {
                String path = ((q7) arrayList2.get(i10)).d.f14157a.getPath();
                if (((q7) arrayList2.get(i10)).d.d == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                arrayList.add(new MediaController.PhotoEntry(0, 0, 0L, path, 0, z4, 0, 0, 0L));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        if (this.f38114s == null) {
            org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.X9, false)), org.telegram.ui.ActionBar.j6.R4);
            this.f38114s = mqVar;
            mqVar.f27116w = true;
        }
        org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) l1Var.f5774a;
        mh.a aVar = ((q7) this.e.get(i10)).d;
        Object tag = q7Var.getTag();
        ImageReceiver imageReceiver = q7Var.f21702c;
        if (aVar == tag) {
            z4 = true;
        } else {
            z4 = false;
        }
        q7Var.setTag(aVar);
        int max = (int) Math.max(100.0f, AndroidUtilities.getRealScreenSize().x / AndroidUtilities.density);
        int i11 = aVar.d;
        File file = aVar.f14157a;
        if (i11 == 1) {
            imageReceiver.setImage(ImageLocation.getForPath("vthumb://0:" + file.getAbsolutePath()), e2.c.h(max, "_", max), this.f38114s, null, null, 0);
            q7Var.m(AndroidUtilities.formatFileSize(aVar.f14159c), true);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath("thumb://0:" + file.getAbsolutePath()), e2.c.h(max, "_", max), this.f38114s, null, null, 0);
            q7Var.m(AndroidUtilities.formatFileSize(aVar.f14159c), false);
        }
        q7Var.i(this.v.f39283f.f14168j.contains(aVar), z4);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        if (this.f38112n == null) {
            this.f38112n = new org.telegram.ui.Cells.p7(viewGroup.getContext(), null);
        }
        r7 r7Var = new r7(this, viewGroup.getContext(), this.f38112n, this.v.d.getCurrentAccount());
        r7Var.setStyle(1);
        return new f2.l1(r7Var);
    }
}
