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
    public final int f40074a;
    public final org.telegram.ui.ActionBar.e6 f40075b;
    public final ArrayList f40076c;
    public final dc1 d;
    public final org.telegram.ui.Components.t00 e;
    public boolean f40077f;
    public final xc h;
    public boolean f40078n;
    public Utilities.Callback f40079r;
    public String f40080s;
    public TLRPC.WallPaper v;
    public final HashMap f40081w;
    public final HashMap f40082x;

    public zc(int i10, Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.f40076c = new ArrayList();
        this.f40081w = new HashMap();
        this.f40082x = new HashMap();
        this.f40074a = i10;
        this.f40075b = e6Var;
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(getContext(), e6Var);
        this.e = t00Var;
        t00Var.setViewType(14);
        t00Var.setVisibility(0);
        addView(t00Var, w7.y5.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        dc1 dc1Var = new dc1(activity, 4, e6Var);
        this.d = dc1Var;
        dc1Var.setClipToPadding(false);
        dc1Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        getContext();
        s4.c0 c0Var = new s4.c0();
        c0Var.j1(0);
        dc1Var.setLayoutManager(c0Var);
        dc1Var.setAlpha(0.0f);
        xc xcVar = new xc(this, i10, e6Var);
        this.h = xcVar;
        dc1Var.setAdapter(xcVar);
        addView(dc1Var, w7.y5.c(130.0f, -1));
        dc1Var.setOnItemClickListener(new i(this, 2));
        ChatThemeController chatThemeController = ChatThemeController.getInstance(i10);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        chatThemeController.requestAllChatThemes(new yc(this, i10), true);
        if (!this.f40078n) {
            AndroidUtilities.updateViewVisibilityAnimated(t00Var, true, 1.0f, true, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(t00Var, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z10) {
        ArrayList arrayList;
        int S;
        this.f40080s = str;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            arrayList = this.f40076c;
            boolean z11 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.lp lpVar = (org.telegram.ui.Components.lp) arrayList.get(i11);
            if (!TextUtils.equals(this.f40080s, lpVar.a()) && (!TextUtils.isEmpty(str) || !lpVar.f26230a.f18774a)) {
                z11 = false;
            }
            lpVar.d = z11;
            if (z11) {
                i10 = i11;
            }
            i11++;
        }
        dc1 dc1Var = this.d;
        if (i10 >= 0 && !z10 && (dc1Var.getLayoutManager() instanceof s4.c0)) {
            ((s4.c0) dc1Var.getLayoutManager()).h1(i10, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
        }
        for (int i12 = 0; i12 < dc1Var.getChildCount(); i12++) {
            View childAt = dc1Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Components.j21) && (S = RecyclerView.S(childAt)) >= 0 && S < arrayList.size()) {
                ((org.telegram.ui.Components.j21) childAt).g(((org.telegram.ui.Components.lp) arrayList.get(S)).d, true);
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
            ArrayList arrayList = this.f40076c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.lp) arrayList.get(0)).f26230a.f18774a) && this.f40077f) {
                arrayList.add(0, new org.telegram.ui.Components.lp(org.telegram.ui.ActionBar.d4.a(this.f40074a)));
                this.h.l();
            }
        }
    }

    public void setOnEmoticonSelected(Utilities.Callback<String> callback) {
        this.f40079r = callback;
    }

    public void setWithRemovedStub(boolean z10) {
        this.f40077f = z10;
    }
}
