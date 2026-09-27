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
    public org.telegram.ui.Cells.s7 f37016n;
    public final ArrayList f37017r;
    public org.telegram.ui.Components.rq f37018s;
    public final v7 v;

    public r7(v7 v7Var) {
        super(v7Var, 1);
        this.v = v7Var;
        this.f37017r = new ArrayList();
    }

    @Override
    public final void F() {
        boolean z10;
        super.F();
        ArrayList arrayList = this.f37017r;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 < arrayList2.size()) {
                String path = ((p7) arrayList2.get(i10)).d.f49510a.getPath();
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
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        if (this.f37018s == null) {
            org.telegram.ui.Components.rq rqVar = new org.telegram.ui.Components.rq(new ColorDrawable(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.X9, false)), org.telegram.ui.ActionBar.i6.R4);
            this.f37018s = rqVar;
            rqVar.f28069w = true;
        }
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) c1Var.f43005a;
        zh.a aVar = ((p7) this.e.get(i10)).d;
        Object tag = t7Var.getTag();
        ImageReceiver imageReceiver = t7Var.f21216c;
        if (aVar == tag) {
            z10 = true;
        } else {
            z10 = false;
        }
        t7Var.setTag(aVar);
        int max = (int) Math.max(100.0f, AndroidUtilities.getRealScreenSize().x / AndroidUtilities.density);
        int i11 = aVar.d;
        File file = aVar.f49510a;
        if (i11 == 1) {
            imageReceiver.setImage(ImageLocation.getForPath("vthumb://0:" + file.getAbsolutePath()), a4.a.k(max, max, "_"), this.f37018s, null, null, 0);
            t7Var.m(AndroidUtilities.formatFileSize(aVar.f49512c), true);
        } else {
            imageReceiver.setImage(ImageLocation.getForPath("thumb://0:" + file.getAbsolutePath()), a4.a.k(max, max, "_"), this.f37018s, null, null, 0);
            t7Var.m(AndroidUtilities.formatFileSize(aVar.f49512c), false);
        }
        t7Var.i(this.v.f38466f.f49521j.contains(aVar), z10);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        if (this.f37016n == null) {
            this.f37016n = new org.telegram.ui.Cells.s7(viewGroup.getContext(), null);
        }
        q7 q7Var = new q7(this, viewGroup.getContext(), this.f37016n, this.v.d.getCurrentAccount());
        q7Var.setStyle(1);
        return new s4.c1(q7Var);
    }
}
