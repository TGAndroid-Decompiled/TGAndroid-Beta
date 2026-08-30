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
    public final int f40755a;
    public final org.telegram.ui.ActionBar.f6 f40756b;
    public final ArrayList f40757c;
    public final jb1 d;
    public final org.telegram.ui.Components.t00 e;
    public boolean f40758f;
    public final xc h;
    public boolean f40759n;
    public Utilities.Callback f40760r;
    public String f40761s;
    public TLRPC.WallPaper v;
    public final HashMap f40762w;
    public final HashMap f40763x;

    public zc(int i10, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.f40757c = new ArrayList();
        this.f40762w = new HashMap();
        this.f40763x = new HashMap();
        this.f40755a = i10;
        this.f40756b = f6Var;
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(getContext(), f6Var);
        this.e = t00Var;
        t00Var.setViewType(14);
        t00Var.setVisibility(0);
        addView(t00Var, k7.b6.d(-1, 104.0f, 8388611, 16.0f, 13.0f, 16.0f, 6.0f));
        jb1 jb1Var = new jb1(activity, 3, f6Var);
        this.d = jb1Var;
        jb1Var.setClipToPadding(false);
        jb1Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        getContext();
        f2.i0 i0Var = new f2.i0();
        i0Var.j1(0);
        jb1Var.setLayoutManager(i0Var);
        jb1Var.setAlpha(0.0f);
        xc xcVar = new xc(this, i10, f6Var);
        this.h = xcVar;
        jb1Var.setAdapter(xcVar);
        addView(jb1Var, k7.b6.c(130.0f, -1));
        jb1Var.setOnItemClickListener(new j(this, 2));
        ChatThemeController chatThemeController = ChatThemeController.getInstance(i10);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        chatThemeController.requestAllChatThemes(new yc(this, i10), true);
        if (!this.f40759n) {
            AndroidUtilities.updateViewVisibilityAnimated(t00Var, true, 1.0f, true, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(t00Var, false, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z4) {
        ArrayList arrayList;
        int R;
        this.f40761s = str;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            arrayList = this.f40757c;
            boolean z10 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.jp jpVar = (org.telegram.ui.Components.jp) arrayList.get(i11);
            if (!TextUtils.equals(this.f40761s, jpVar.a()) && (!TextUtils.isEmpty(str) || !jpVar.f26015a.f19663a)) {
                z10 = false;
            }
            jpVar.d = z10;
            if (z10) {
                i10 = i11;
            }
            i11++;
        }
        jb1 jb1Var = this.d;
        if (i10 >= 0 && !z4 && (jb1Var.getLayoutManager() instanceof f2.i0)) {
            ((f2.i0) jb1Var.getLayoutManager()).h1(i10, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
        }
        for (int i12 = 0; i12 < jb1Var.getChildCount(); i12++) {
            View childAt = jb1Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Components.w11) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.w11) childAt).g(((org.telegram.ui.Components.jp) arrayList.get(R)).d, true);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.v = wallPaper;
        AndroidUtilities.forEachViews((RecyclerView) this.d, (h5.d) new vc(this, 1));
        if (this.v != null) {
            ArrayList arrayList = this.f40757c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.jp) arrayList.get(0)).f26015a.f19663a) && this.f40758f) {
                arrayList.add(0, new org.telegram.ui.Components.jp(org.telegram.ui.ActionBar.e4.a(this.f40755a)));
                this.h.l();
            }
        }
    }

    public void setOnEmoticonSelected(Utilities.Callback<String> callback) {
        this.f40760r = callback;
    }

    public void setWithRemovedStub(boolean z4) {
        this.f40758f = z4;
    }
}
