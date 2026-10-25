package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class zc extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final int f46249a;
    public final org.telegram.ui.ActionBar.u6 f46250b;
    public final ArrayList f46251c;
    public final za1 d;
    public final org.telegram.ui.Components.c10 e;
    public boolean f46252f;
    public final xc h;
    public boolean f46253n;
    public Utilities.Callback f46254r;
    public String f46255s;
    public TLRPC.WallPaper v;
    public final HashMap f46256w;
    public final HashMap f46257x;

    public zc(int i10, Activity activity, org.telegram.ui.ActionBar.u6 u6Var) {
        super(activity);
        this.f46251c = new ArrayList();
        this.f46256w = new HashMap();
        this.f46257x = new HashMap();
        this.f46249a = i10;
        this.f46250b = u6Var;
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(getContext(), u6Var);
        this.e = c10Var;
        c10Var.setViewType(14);
        c10Var.setVisibility(0);
        addView(c10Var, org.telegram.ui.Components.gb1.h(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        za1 za1Var = new za1(activity, 4, u6Var);
        this.d = za1Var;
        za1Var.setClipToPadding(false);
        za1Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        getContext();
        s4.c0 c0Var = new s4.c0();
        c0Var.k1(0);
        za1Var.setLayoutManager(c0Var);
        za1Var.setAlpha(0.0f);
        xc xcVar = new xc(this, i10, u6Var);
        this.h = xcVar;
        za1Var.setAdapter(xcVar);
        addView(za1Var, org.telegram.ui.Components.gb1.g(130.0f, -1));
        za1Var.setOnItemClickListener(new h(this, 3));
        ChatThemeController chatThemeController = ChatThemeController.getInstance(i10);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        chatThemeController.requestAllChatThemes(new yc(this, i10), true);
        if (!this.f46253n) {
            AndroidUtilities.updateViewVisibilityAnimated(c10Var, true, 1.0f, true, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(c10Var, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z10) {
        ArrayList arrayList;
        int R;
        this.f46255s = str;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            arrayList = this.f46251c;
            boolean z11 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.xp xpVar = (org.telegram.ui.Components.xp) arrayList.get(i11);
            if (!TextUtils.equals(this.f46255s, xpVar.a()) && (!TextUtils.isEmpty(str) || !xpVar.f34790a.f22680a)) {
                z11 = false;
            }
            xpVar.d = z11;
            if (z11) {
                i10 = i11;
            }
            i11++;
        }
        za1 za1Var = this.d;
        if (i10 >= 0 && !z10 && (za1Var.getLayoutManager() instanceof s4.c0)) {
            ((s4.c0) za1Var.getLayoutManager()).h1(i10, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
        }
        for (int i12 = 0; i12 < za1Var.getChildCount(); i12++) {
            View childAt = za1Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Components.d31) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.d31) childAt).g(((org.telegram.ui.Components.xp) arrayList.get(R)).d, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.v = wallPaper;
        AndroidUtilities.forEachViews((RecyclerView) this.d, (Utilities.Callback<View>) new vc(this, 1));
        if (this.v != null) {
            ArrayList arrayList = this.f46251c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.xp) arrayList.get(0)).f34790a.f22680a) && this.f46252f) {
                arrayList.add(0, new org.telegram.ui.Components.xp(org.telegram.ui.ActionBar.h4.a(this.f46249a)));
                this.h.l();
            }
        }
    }

    public void setOnEmoticonSelected(Utilities.Callback<String> callback) {
        this.f46254r = callback;
    }

    public void setWithRemovedStub(boolean z10) {
        this.f46252f = z10;
    }

    @Override
    public final void updateColors() {
        ?? r02;
        xc xcVar;
        org.telegram.ui.ActionBar.u6 u6Var = this.f46250b;
        if (u6Var != null) {
            r02 = u6Var.a();
        } else {
            r02 = org.telegram.ui.ActionBar.y6.I.q();
        }
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f46251c;
            if (i10 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.xp xpVar = (org.telegram.ui.Components.xp) arrayList.get(i10);
            if (xpVar.f34792c != r02) {
                xpVar.f34792c = r02;
                z10 = true;
            }
            i10++;
        }
        za1 za1Var = this.d;
        if (za1Var != null) {
            AndroidUtilities.forEachViews((RecyclerView) za1Var, (Utilities.Callback<View>) new vc(this, 0));
            if (z10 && (xcVar = this.h) != null) {
                xcVar.l();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
