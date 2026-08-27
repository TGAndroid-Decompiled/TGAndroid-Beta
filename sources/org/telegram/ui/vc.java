package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class vc extends FrameLayout {

    public final int f43415a;

    public final org.telegram.ui.ActionBar.c6 f43416b;

    public final ArrayList f43417c;
    public final ta1 d;

    public final org.telegram.ui.Components.h00 f43418e;

    public boolean f43419f;
    public final tc h;

    public boolean f43420n;

    public Utilities.Callback f43421r;

    public String f43422s;
    public TLRPC.WallPaper v;

    public final HashMap f43423w;

    public final HashMap f43424x;

    public vc(int i10, Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.f43417c = new ArrayList();
        this.f43423w = new HashMap();
        this.f43424x = new HashMap();
        this.f43415a = i10;
        this.f43416b = c6Var;
        org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(getContext(), c6Var);
        this.f43418e = h00Var;
        h00Var.setViewType(14);
        h00Var.setVisibility(0);
        addView(h00Var, h7.z5.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        ta1 ta1Var = new ta1(activity, 3, c6Var);
        this.d = ta1Var;
        ta1Var.setClipToPadding(false);
        ta1Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        getContext();
        f2.k0 k0Var = new f2.k0();
        k0Var.j1(0);
        ta1Var.setLayoutManager(k0Var);
        ta1Var.setAlpha(0.0f);
        tc tcVar = new tc(this, i10, c6Var);
        this.h = tcVar;
        ta1Var.setAdapter(tcVar);
        addView(ta1Var, h7.z5.c(130.0f, -1));
        ta1Var.setOnItemClickListener(new i(this, 2));
        ChatThemeController chatThemeController = ChatThemeController.getInstance(i10);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        chatThemeController.requestAllChatThemes(new uc(this, i10), true);
        if (this.f43420n) {
            AndroidUtilities.updateViewVisibilityAnimated(h00Var, false, 1.0f, true, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(h00Var, true, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z10) {
        ArrayList arrayList;
        int iR;
        this.f43422s = str;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            arrayList = this.f43417c;
            boolean z11 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.zo zoVar = (org.telegram.ui.Components.zo) arrayList.get(i11);
            if (!TextUtils.equals(this.f43422s, zoVar.a()) && (!TextUtils.isEmpty(str) || !zoVar.f35316a.f22780a)) {
                z11 = false;
            }
            zoVar.d = z11;
            if (z11) {
                i10 = i11;
            }
            i11++;
        }
        ta1 ta1Var = this.d;
        if (i10 >= 0 && !z10 && (ta1Var.getLayoutManager() instanceof f2.k0)) {
            ((f2.k0) ta1Var.getLayoutManager()).h1(i10, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
        }
        for (int i12 = 0; i12 < ta1Var.getChildCount(); i12++) {
            View childAt = ta1Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Components.b11) && (iR = RecyclerView.R(childAt)) >= 0 && iR < arrayList.size()) {
                ((org.telegram.ui.Components.b11) childAt).g(((org.telegram.ui.Components.zo) arrayList.get(iR)).d, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.v = wallPaper;
        AndroidUtilities.forEachViews((RecyclerView) this.d, (d5.d) new rc(this, 1));
        if (this.v != null) {
            ArrayList arrayList = this.f43417c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.zo) arrayList.get(0)).f35316a.f22780a) && this.f43419f) {
                arrayList.add(0, new org.telegram.ui.Components.zo(org.telegram.ui.ActionBar.b4.a(this.f43415a)));
                this.h.l();
            }
        }
    }

    public void setOnEmoticonSelected(Utilities.Callback<String> callback) {
        this.f43421r = callback;
    }

    public void setWithRemovedStub(boolean z10) {
        this.f43419f = z10;
    }
}
