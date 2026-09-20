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
public final class zc extends FrameLayout {
    public final int f40170a;
    public final org.telegram.ui.ActionBar.f6 f40171b;
    public final ArrayList f40172c;
    public final fc1 d;
    public final org.telegram.ui.Components.t00 e;
    public boolean f40173f;
    public final xc h;
    public boolean f40174n;
    public Utilities.Callback f40175r;
    public String f40176s;
    public TLRPC.WallPaper v;
    public final HashMap f40177w;
    public final HashMap f40178x;

    public zc(int i10, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.f40172c = new ArrayList();
        this.f40177w = new HashMap();
        this.f40178x = new HashMap();
        this.f40170a = i10;
        this.f40171b = f6Var;
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(getContext(), f6Var);
        this.e = t00Var;
        t00Var.setViewType(14);
        t00Var.setVisibility(0);
        addView(t00Var, w7.y5.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        fc1 fc1Var = new fc1(activity, 4, f6Var);
        this.d = fc1Var;
        fc1Var.setClipToPadding(false);
        fc1Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        getContext();
        s4.c0 c0Var = new s4.c0();
        c0Var.j1(0);
        fc1Var.setLayoutManager(c0Var);
        fc1Var.setAlpha(0.0f);
        xc xcVar = new xc(this, i10, f6Var);
        this.h = xcVar;
        fc1Var.setAdapter(xcVar);
        addView(fc1Var, w7.y5.c(130.0f, -1));
        fc1Var.setOnItemClickListener(new i(this, 2));
        ChatThemeController chatThemeController = ChatThemeController.getInstance(i10);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        chatThemeController.requestAllChatThemes(new yc(this, i10), true);
        if (!this.f40174n) {
            AndroidUtilities.updateViewVisibilityAnimated(t00Var, true, 1.0f, true, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(t00Var, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z10) {
        ArrayList arrayList;
        int S;
        this.f40176s = str;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            arrayList = this.f40172c;
            boolean z11 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.lp lpVar = (org.telegram.ui.Components.lp) arrayList.get(i11);
            if (!TextUtils.equals(this.f40176s, lpVar.a()) && (!TextUtils.isEmpty(str) || !lpVar.f26219a.f18807a)) {
                z11 = false;
            }
            lpVar.d = z11;
            if (z11) {
                i10 = i11;
            }
            i11++;
        }
        fc1 fc1Var = this.d;
        if (i10 >= 0 && !z10 && (fc1Var.getLayoutManager() instanceof s4.c0)) {
            ((s4.c0) fc1Var.getLayoutManager()).h1(i10, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
        }
        for (int i12 = 0; i12 < fc1Var.getChildCount(); i12++) {
            View childAt = fc1Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Components.i21) && (S = RecyclerView.S(childAt)) >= 0 && S < arrayList.size()) {
                ((org.telegram.ui.Components.i21) childAt).g(((org.telegram.ui.Components.lp) arrayList.get(S)).d, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.v = wallPaper;
        AndroidUtilities.forEachViews((RecyclerView) this.d, (e2.h) new vc(this, 1));
        if (this.v != null) {
            ArrayList arrayList = this.f40172c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.lp) arrayList.get(0)).f26219a.f18807a) && this.f40173f) {
                arrayList.add(0, new org.telegram.ui.Components.lp(org.telegram.ui.ActionBar.d4.a(this.f40170a)));
                this.h.l();
            }
        }
    }

    public void setOnEmoticonSelected(Utilities.Callback<String> callback) {
        this.f40175r = callback;
    }

    public void setWithRemovedStub(boolean z10) {
        this.f40173f = z10;
    }
}
