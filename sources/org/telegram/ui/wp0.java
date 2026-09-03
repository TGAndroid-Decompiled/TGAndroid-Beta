package org.telegram.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.RadialProgressView;
public final class wp0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean B;
    public final zn C;
    public int D;
    public boolean E;
    public org.telegram.ui.ActionBar.p1 F;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout G;
    public org.telegram.ui.ActionBar.g1[] H;
    public FrameLayout I;
    public org.telegram.ui.Components.cu J;
    public n0 K;
    public ImageView L;
    public rp0 M;
    public eg.h0 N;
    public View O;
    public final TextPaint P;
    public final RectF Q;
    public final Paint R;
    public vp0 S;
    public CharSequence f39747a;
    public final HashMap f39748b;
    public final ArrayList f39749c;
    public ArrayList d;
    public boolean e;
    public int f39750f;
    public org.telegram.ui.Components.rl0 h;
    public up0 f39751n;
    public FrameLayout f39752r;
    public TextView f39753s;
    public boolean v;
    public final int f39754w;
    public boolean f39755x;
    public final boolean f39756y;

    public wp0(int i10, boolean z4, boolean z10, zn znVar) {
        super(null);
        this.f39748b = new HashMap();
        this.f39749c = new ArrayList();
        this.d = null;
        this.e = false;
        this.f39750f = 2;
        this.f39755x = true;
        this.E = true;
        this.P = new TextPaint(1);
        this.Q = new RectF();
        this.R = new Paint(1);
        this.C = znVar;
        this.f39754w = i10;
        this.f39756y = z4;
        this.B = z10;
    }

    public static void U(wp0 wp0Var, MediaController.AlbumEntry albumEntry) {
        if (albumEntry != null) {
            mq0 mq0Var = new mq0(0, albumEntry, wp0Var.f39748b, wp0Var.f39749c, wp0Var.f39754w, wp0Var.B, wp0Var.C, false);
            Editable text = wp0Var.J.getText();
            wp0Var.f39747a = text;
            mq0Var.d = text;
            org.telegram.ui.Components.cu cuVar = mq0Var.f36162a0;
            if (cuVar != null) {
                cuVar.setText(text);
            }
            mq0Var.f36180p0 = new sp0(wp0Var);
            mq0Var.f0(wp0Var.D, wp0Var.E);
            wp0Var.presentFragment(mq0Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (wp0Var.f39756y) {
            rq0 rq0Var = new rq0(hashMap, arrayList, wp0Var.f39754w, wp0Var.B, wp0Var.C);
            Editable text2 = wp0Var.J.getText();
            wp0Var.f39747a = text2;
            mq0 mq0Var2 = rq0Var.f37946a;
            if (mq0Var2 != null) {
                mq0Var2.d = text2;
                org.telegram.ui.Components.cu cuVar2 = mq0Var2.f36162a0;
                if (cuVar2 != null) {
                    cuVar2.setText(text2);
                }
            }
            tp0 tp0Var = new tp0(wp0Var, hashMap, arrayList);
            mq0 mq0Var3 = rq0Var.f37946a;
            mq0Var3.f36180p0 = tp0Var;
            mq0 mq0Var4 = rq0Var.f37947b;
            mq0Var4.f36180p0 = tp0Var;
            mq0Var3.f36181q0 = new qq0(rq0Var, 0);
            mq0Var4.f36181q0 = new qq0(rq0Var, 1);
            int i10 = wp0Var.D;
            boolean z4 = wp0Var.E;
            mq0Var3.f0(i10, z4);
            rq0Var.f37947b.f0(i10, z4);
            wp0Var.presentFragment(rq0Var);
            return;
        }
        mq0 mq0Var5 = new mq0(0, albumEntry, hashMap, arrayList, wp0Var.f39754w, wp0Var.B, wp0Var.C, false);
        Editable text3 = wp0Var.J.getText();
        wp0Var.f39747a = text3;
        mq0Var5.d = text3;
        org.telegram.ui.Components.cu cuVar3 = mq0Var5.f36162a0;
        if (cuVar3 != null) {
            cuVar3.setText(text3);
        }
        mq0Var5.f36180p0 = new pp0(wp0Var, hashMap, arrayList);
        mq0Var5.f0(wp0Var.D, wp0Var.E);
        wp0Var.presentFragment(mq0Var5);
    }

    public final void V(HashMap hashMap, ArrayList arrayList, boolean z4, int i10) {
        if (!hashMap.isEmpty() && this.S != null && !this.v) {
            this.v = true;
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                Object obj = hashMap.get(arrayList.get(i11));
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                arrayList2.add(sendingMediaInfo);
                String str = null;
                if (obj instanceof MediaController.PhotoEntry) {
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                    String str2 = photoEntry.imagePath;
                    if (str2 != null) {
                        sendingMediaInfo.path = str2;
                    } else {
                        sendingMediaInfo.path = photoEntry.path;
                    }
                    sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                    sendingMediaInfo.coverPath = photoEntry.coverPath;
                    sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                    sendingMediaInfo.isVideo = photoEntry.isVideo;
                    CharSequence charSequence = photoEntry.caption;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    sendingMediaInfo.caption = str;
                    sendingMediaInfo.entities = photoEntry.entities;
                    sendingMediaInfo.masks = photoEntry.stickers;
                    sendingMediaInfo.ttl = photoEntry.ttl;
                } else if (obj instanceof MediaController.SearchImage) {
                    MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                    String str3 = searchImage.imagePath;
                    if (str3 != null) {
                        sendingMediaInfo.path = str3;
                    } else {
                        sendingMediaInfo.searchImage = searchImage;
                    }
                    sendingMediaInfo.thumbPath = searchImage.thumbPath;
                    sendingMediaInfo.coverPath = searchImage.coverPath;
                    sendingMediaInfo.videoEditedInfo = searchImage.editedInfo;
                    CharSequence charSequence2 = searchImage.caption;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    sendingMediaInfo.caption = str;
                    sendingMediaInfo.entities = searchImage.entities;
                    sendingMediaInfo.masks = searchImage.stickers;
                    sendingMediaInfo.ttl = searchImage.ttl;
                    TLRPC.BotInlineResult botInlineResult = searchImage.inlineResult;
                    if (botInlineResult != null && searchImage.type == 1) {
                        sendingMediaInfo.inlineResult = botInlineResult;
                        sendingMediaInfo.params = searchImage.params;
                    }
                    searchImage.date = (int) (System.currentTimeMillis() / 1000);
                }
            }
            this.S.a(arrayList2);
        }
    }

    public final void W(boolean z4) {
        boolean z10;
        Integer num;
        float f10;
        float f11;
        float f12;
        float f13;
        float dp;
        if (this.I.getTag() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z4 == z10) {
            return;
        }
        FrameLayout frameLayout = this.I;
        if (z4) {
            num = 1;
        } else {
            num = null;
        }
        frameLayout.setTag(num);
        if (this.J.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(this.J.getEditText());
        }
        this.J.k(true);
        if (z4) {
            this.I.setVisibility(0);
            this.K.setVisibility(0);
        } else {
            this.I.setVisibility(4);
            this.K.setVisibility(4);
        }
        n0 n0Var = this.K;
        float f14 = 0.2f;
        float f15 = 1.0f;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.2f;
        }
        n0Var.setScaleX(f10);
        n0 n0Var2 = this.K;
        if (z4) {
            f11 = 1.0f;
        } else {
            f11 = 0.2f;
        }
        n0Var2.setScaleY(f11);
        n0 n0Var3 = this.K;
        float f16 = 0.0f;
        if (z4) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        n0Var3.setAlpha(f12);
        eg.h0 h0Var = this.N;
        if (z4) {
            f13 = 1.0f;
        } else {
            f13 = 0.2f;
        }
        h0Var.setScaleX(f13);
        eg.h0 h0Var2 = this.N;
        if (z4) {
            f14 = 1.0f;
        }
        h0Var2.setScaleY(f14);
        eg.h0 h0Var3 = this.N;
        if (!z4) {
            f15 = 0.0f;
        }
        h0Var3.setAlpha(f15);
        FrameLayout frameLayout2 = this.I;
        if (z4) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(48.0f);
        }
        frameLayout2.setTranslationY(dp);
        View view = this.O;
        if (!z4) {
            f16 = AndroidUtilities.dp(48.0f);
        }
        view.setTranslationY(f16);
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f19952h5;
        kVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.f19987j5;
        kVar2.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i11, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I5, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new qp0(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        if (this.f39755x) {
            n10.a(2, R.drawable.outline_header_search).setContentDescription(LocaleController.getString(R.string.Search));
        }
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        a2.e(1, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        rp0 rp0Var = new rp0(this, context);
        this.M = rp0Var;
        rp0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.fragmentView = this.M;
        this.actionBar.setTitle(LocaleController.getString(R.string.Gallery));
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(context, null);
        this.h = rl0Var;
        rl0Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new f2.i0(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.M.addView(this.h, k7.b6.e(-1, -1, 51));
        org.telegram.ui.Components.rl0 rl0Var2 = this.h;
        up0 up0Var = new up0(this, context);
        this.f39751n = up0Var;
        rl0Var2.setAdapter(up0Var);
        this.h.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        TextView textView = new TextView(context);
        this.f39753s = textView;
        textView.setTextColor(-8355712);
        this.f39753s.setTextSize(1, 20.0f);
        this.f39753s.setGravity(17);
        this.f39753s.setVisibility(8);
        this.f39753s.setText(LocaleController.getString(R.string.NoPhotos));
        this.M.addView(this.f39753s, k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f39753s.setOnTouchListener(new oh.d(2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39752r = frameLayout;
        frameLayout.setVisibility(8);
        this.M.addView(this.f39752r, k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.f39752r.addView(radialProgressView, k7.b6.e(-2, -2, 17));
        View view = new View(context);
        this.O = view;
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.O.setTranslationY(AndroidUtilities.dp(48.0f));
        this.M.addView(this.O, k7.b6.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.I = frameLayout2;
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.I.setVisibility(4);
        this.I.setTranslationY(AndroidUtilities.dp(48.0f));
        this.M.addView(this.I, k7.b6.e(-1, 48, 83));
        this.I.setOnTouchListener(new oh.d(2));
        org.telegram.ui.Components.cu cuVar = this.J;
        if (cuVar != null) {
            cuVar.o();
        }
        this.J = new org.telegram.ui.Components.cu(context, this.M, null, 1, false, null);
        this.J.setFilters(new InputFilter[]{new InputFilter.LengthFilter(MessagesController.getInstance(UserConfig.selectedAccount).maxCaptionLength)});
        this.J.setHint(LocaleController.getString(R.string.AddCaption));
        org.telegram.ui.Components.ut editText = this.J.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.I.addView(this.J, k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
        CharSequence charSequence = this.f39747a;
        if (charSequence != null) {
            this.J.setText(charSequence);
        }
        n0 n0Var = new n0(this, context, 16);
        this.K = n0Var;
        n0Var.setFocusable(true);
        this.K.setFocusableInTouchMode(true);
        this.K.setVisibility(4);
        this.K.setScaleX(0.2f);
        this.K.setScaleY(0.2f);
        this.K.setAlpha(0.0f);
        this.M.addView(this.K, k7.b6.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        this.L = new ImageView(context);
        this.L.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.S5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.T5, false)));
        this.L.setImageResource(R.drawable.attach_send);
        this.L.setImportantForAccessibility(2);
        this.L.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.U5, false), PorterDuff.Mode.MULTIPLY));
        this.L.setScaleType(ImageView.ScaleType.CENTER);
        this.L.setOutlineProvider(new gg.j1(15));
        this.K.addView(this.L, k7.b6.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
        this.L.setOnClickListener(new g60(this, 17));
        this.L.setOnLongClickListener(new w(this, 3));
        TextPaint textPaint = this.P;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        eg.h0 h0Var = new eg.h0(this, context, 27);
        this.N = h0Var;
        h0Var.setAlpha(0.0f);
        this.N.setScaleX(0.2f);
        this.N.setScaleY(0.2f);
        this.M.addView(this.N, k7.b6.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        if (this.f39754w != 0) {
            this.J.setVisibility(8);
        }
        if (this.e && ((arrayList = this.d) == null || arrayList.isEmpty())) {
            this.f39752r.setVisibility(0);
            this.h.setEmptyView(null);
        } else {
            this.f39752r.setVisibility(8);
            this.h.setEmptyView(this.f39753s);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.albumsDidLoad) {
            if (this.classGuid == ((Integer) objArr[0]).intValue()) {
                int i12 = this.f39754w;
                if (i12 != 1 && i12 != 2 && i12 != 10 && this.f39755x) {
                    this.d = (ArrayList) objArr[1];
                } else {
                    this.d = (ArrayList) objArr[2];
                }
                FrameLayout frameLayout = this.f39752r;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                org.telegram.ui.Components.rl0 rl0Var = this.h;
                if (rl0Var != null && rl0Var.getEmptyView() == null) {
                    this.h.setEmptyView(this.f39753s);
                }
                up0 up0Var = this.f39751n;
                if (up0Var != null) {
                    up0Var.l();
                }
                this.e = false;
            }
        } else if (i10 == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.f19952h5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.f19987j5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 0, new Class[]{View.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.R4}, null, org.telegram.ui.ActionBar.j6.f19885da));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 0, new Class[]{View.class}, null, null, null, org.telegram.ui.ActionBar.j6.X9));
        return arrayList;
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        org.telegram.ui.Components.cu cuVar = this.J;
        if (cuVar != null && cuVar.e) {
            if (z4) {
                cuVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z4);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.rl0 rl0Var = this.h;
        if (rl0Var != null) {
            rl0Var.getViewTreeObserver().addOnPreDrawListener(new ci(this, 3));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10 = this.f39754w;
        boolean z4 = true;
        if (i10 != 1 && i10 != 2 && i10 != 10 && this.f39755x) {
            this.d = MediaController.allMediaAlbums;
        } else {
            this.d = MediaController.allPhotoAlbums;
        }
        if (this.d != null) {
            z4 = false;
        }
        this.e = z4;
        MediaController.loadGalleryPhotosAlbums(this.classGuid);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        org.telegram.ui.Components.cu cuVar = this.J;
        if (cuVar != null) {
            cuVar.o();
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        up0 up0Var = this.f39751n;
        if (up0Var != null) {
            up0Var.l();
        }
        org.telegram.ui.Components.cu cuVar = this.J;
        if (cuVar != null) {
            cuVar.s();
        }
        org.telegram.ui.Components.rl0 rl0Var = this.h;
        if (rl0Var != null) {
            rl0Var.getViewTreeObserver().addOnPreDrawListener(new ci(this, 3));
        }
    }
}
