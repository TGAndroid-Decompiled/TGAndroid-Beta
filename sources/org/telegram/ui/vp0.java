package org.telegram.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.PorterDuff;
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
import java.util.HashSet;
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
public final class vp0 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean E;
    public final sn F;
    public int G;
    public boolean H;
    public org.telegram.ui.ActionBar.m1 I;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout J;
    public org.telegram.ui.ActionBar.e1[] K;
    public FrameLayout L;
    public org.telegram.ui.Components.qu M;
    public l0 N;
    public ImageView O;
    public pp0 P;
    public e50 Q;
    public View R;
    public final TextPaint S;
    public final RectF T;
    public final Paint U;
    public up0 V;
    public CharSequence f42804a;
    public final HashMap f42805b;
    public final ArrayList f42806c;
    public ArrayList d;
    public boolean e;
    public int f42807f;
    public org.telegram.ui.Components.mm0 h;
    public tp0 f42808n;
    public FrameLayout f42809r;
    public TextView f42810s;
    public boolean v;
    public final int f42811w;
    public boolean f42812x;
    public final boolean f42813y;

    public vp0(int i10, boolean z10, boolean z11, sn snVar) {
        super(null);
        this.f42805b = new HashMap();
        this.f42806c = new ArrayList();
        this.d = null;
        this.e = false;
        this.f42807f = 2;
        this.f42812x = true;
        this.H = true;
        this.S = new TextPaint(1);
        this.T = new RectF();
        this.U = new Paint(1);
        this.F = snVar;
        this.f42811w = i10;
        this.f42813y = z10;
        this.E = z11;
    }

    public static void U(vp0 vp0Var, MediaController.AlbumEntry albumEntry) {
        if (albumEntry != null) {
            mq0 mq0Var = new mq0(0, albumEntry, vp0Var.f42805b, vp0Var.f42806c, vp0Var.f42811w, vp0Var.E, vp0Var.F, false);
            Editable text = vp0Var.M.getText();
            vp0Var.f42804a = text;
            mq0Var.d = text;
            org.telegram.ui.Components.qu quVar = mq0Var.f39649d0;
            if (quVar != null) {
                quVar.setText(text);
            }
            mq0Var.f39667s0 = new qp0(vp0Var);
            mq0Var.f0(vp0Var.G, vp0Var.H);
            vp0Var.presentFragment(mq0Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (vp0Var.f42813y) {
            rq0 rq0Var = new rq0(hashMap, arrayList, vp0Var.f42811w, vp0Var.E, vp0Var.F);
            Editable text2 = vp0Var.M.getText();
            vp0Var.f42804a = text2;
            mq0 mq0Var2 = rq0Var.f41223a;
            if (mq0Var2 != null) {
                mq0Var2.d = text2;
                org.telegram.ui.Components.qu quVar2 = mq0Var2.f39649d0;
                if (quVar2 != null) {
                    quVar2.setText(text2);
                }
            }
            rp0 rp0Var = new rp0(vp0Var, hashMap, arrayList);
            mq0 mq0Var3 = rq0Var.f41223a;
            mq0Var3.f39667s0 = rp0Var;
            mq0 mq0Var4 = rq0Var.f41224b;
            mq0Var4.f39667s0 = rp0Var;
            mq0Var3.f39668t0 = new qq0(rq0Var, 0);
            mq0Var4.f39668t0 = new qq0(rq0Var, 1);
            int i10 = vp0Var.G;
            boolean z10 = vp0Var.H;
            mq0Var3.f0(i10, z10);
            rq0Var.f41224b.f0(i10, z10);
            vp0Var.presentFragment(rq0Var);
            return;
        }
        mq0 mq0Var5 = new mq0(0, albumEntry, hashMap, arrayList, vp0Var.f42811w, vp0Var.E, vp0Var.F, false);
        Editable text3 = vp0Var.M.getText();
        vp0Var.f42804a = text3;
        mq0Var5.d = text3;
        org.telegram.ui.Components.qu quVar3 = mq0Var5.f39649d0;
        if (quVar3 != null) {
            quVar3.setText(text3);
        }
        mq0Var5.f39667s0 = new np0(vp0Var, hashMap, arrayList);
        mq0Var5.f0(vp0Var.G, vp0Var.H);
        vp0Var.presentFragment(mq0Var5);
    }

    public final void V(HashMap hashMap, ArrayList arrayList, boolean z10, int i10) {
        if (!hashMap.isEmpty() && this.V != null && !this.v) {
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
            this.V.a(arrayList2);
        }
    }

    public final void W(boolean z10) {
        boolean z11;
        Integer num;
        float f7;
        float f10;
        float f11;
        float f12;
        float dp;
        if (this.L.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11) {
            return;
        }
        FrameLayout frameLayout = this.L;
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        frameLayout.setTag(num);
        if (this.M.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(this.M.getEditText());
        }
        this.M.k(true);
        if (z10) {
            this.L.setVisibility(0);
            this.N.setVisibility(0);
        } else {
            this.L.setVisibility(4);
            this.N.setVisibility(4);
        }
        l0 l0Var = this.N;
        float f13 = 0.2f;
        float f14 = 1.0f;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.2f;
        }
        l0Var.setScaleX(f7);
        l0 l0Var2 = this.N;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.2f;
        }
        l0Var2.setScaleY(f10);
        l0 l0Var3 = this.N;
        float f15 = 0.0f;
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        l0Var3.setAlpha(f11);
        e50 e50Var = this.Q;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.2f;
        }
        e50Var.setScaleX(f12);
        e50 e50Var2 = this.Q;
        if (z10) {
            f13 = 1.0f;
        }
        e50Var2.setScaleY(f13);
        e50 e50Var3 = this.Q;
        if (!z10) {
            f14 = 0.0f;
        }
        e50Var3.setAlpha(f14);
        FrameLayout frameLayout2 = this.L;
        if (z10) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(48.0f);
        }
        frameLayout2.setTranslationY(dp);
        View view = this.R;
        if (!z10) {
            f15 = AndroidUtilities.dp(48.0f);
        }
        view.setTranslationY(f15);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21187da));
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21254h5;
        org.telegram.ui.ActionBar.r6.i(i10, kVar, null);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.k6.f21289j5;
        org.telegram.ui.ActionBar.r6.m(kVar2, 5, i11, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, i11, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.I5, null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new op0(this));
        org.telegram.ui.ActionBar.y m10 = this.actionBar.m();
        if (this.f42812x) {
            m10.a(2, R.drawable.outline_header_search).setContentDescription(LocaleController.getString(R.string.Search));
        }
        org.telegram.ui.ActionBar.u0 a2 = m10.a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        a2.e(1, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        pp0 pp0Var = new pp0(this, context);
        this.P = pp0Var;
        org.telegram.ui.ActionBar.r6.i(i10, pp0Var, null);
        this.fragmentView = this.P;
        this.actionBar.setTitle(LocaleController.getString(R.string.Gallery));
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.h = mm0Var;
        mm0Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new s4.b0(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.P.addView(this.h, w7.z5.e(-1, -1, 51));
        org.telegram.ui.Components.mm0 mm0Var2 = this.h;
        tp0 tp0Var = new tp0(this, context);
        this.f42808n = tp0Var;
        mm0Var2.setAdapter(tp0Var);
        org.telegram.ui.ActionBar.r6.J(this.h, i10, null);
        TextView textView = new TextView(context);
        this.f42810s = textView;
        textView.setTextColor(-8355712);
        this.f42810s.setTextSize(1, 20.0f);
        this.f42810s.setGravity(17);
        this.f42810s.setVisibility(8);
        this.f42810s.setText(LocaleController.getString(R.string.NoPhotos));
        this.P.addView(this.f42810s, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.f42810s.setOnTouchListener(new di.d(2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f42809r = frameLayout;
        frameLayout.setVisibility(8);
        this.P.addView(this.f42809r, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.f42809r.addView(radialProgressView, w7.z5.e(-2, -2, 17));
        View view = new View(context);
        this.R = view;
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.R.setTranslationY(AndroidUtilities.dp(48.0f));
        this.P.addView(this.R, w7.z5.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.L = frameLayout2;
        org.telegram.ui.ActionBar.r6.i(i10, frameLayout2, null);
        this.L.setVisibility(4);
        this.L.setTranslationY(AndroidUtilities.dp(48.0f));
        this.P.addView(this.L, w7.z5.e(-1, 48, 83));
        this.L.setOnTouchListener(new di.d(2));
        org.telegram.ui.Components.qu quVar = this.M;
        if (quVar != null) {
            quVar.o();
        }
        this.M = new org.telegram.ui.Components.qu(context, this.P, null, 1, false, null);
        this.M.setFilters(new InputFilter[]{new InputFilter.LengthFilter(MessagesController.getInstance(UserConfig.selectedAccount).maxCaptionLength)});
        this.M.setHint(LocaleController.getString(R.string.AddCaption));
        org.telegram.ui.Components.iu editText = this.M.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.L.addView(this.M, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
        CharSequence charSequence = this.f42804a;
        if (charSequence != null) {
            this.M.setText(charSequence);
        }
        l0 l0Var = new l0(this, context, 16);
        this.N = l0Var;
        l0Var.setFocusable(true);
        this.N.setFocusableInTouchMode(true);
        this.N.setVisibility(4);
        this.N.setScaleX(0.2f);
        this.N.setScaleY(0.2f);
        this.N.setAlpha(0.0f);
        this.P.addView(this.N, w7.z5.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        this.O = new ImageView(context);
        this.O.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.i0(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.S5, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.T5, false)));
        this.O.setImageResource(R.drawable.attach_send);
        this.O.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.r6.t(this.O, org.telegram.ui.ActionBar.k6.U5, null, PorterDuff.Mode.MULTIPLY);
        this.O.setScaleType(ImageView.ScaleType.CENTER);
        this.O.setOutlineProvider(new ci.n1(19));
        this.N.addView(this.O, w7.z5.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
        this.O.setOnClickListener(new w50(this, 17));
        this.O.setOnLongClickListener(new t(this, 3));
        TextPaint textPaint = this.S;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        e50 e50Var = new e50(this, context, 2);
        this.Q = e50Var;
        e50Var.setAlpha(0.0f);
        this.Q.setScaleX(0.2f);
        this.Q.setScaleY(0.2f);
        this.P.addView(this.Q, w7.z5.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        if (this.f42811w != 0) {
            this.M.setVisibility(8);
        }
        if (this.e && ((arrayList = this.d) == null || arrayList.isEmpty())) {
            this.f42809r.setVisibility(0);
            this.h.setEmptyView(null);
        } else {
            this.f42809r.setVisibility(8);
            this.h.setEmptyView(this.f42810s);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.albumsDidLoad) {
            if (this.classGuid == ((Integer) objArr[0]).intValue()) {
                int i12 = this.f42811w;
                if (i12 != 1 && i12 != 2 && i12 != 10 && this.f42812x) {
                    this.d = (ArrayList) objArr[1];
                } else {
                    this.d = (ArrayList) objArr[2];
                }
                FrameLayout frameLayout = this.f42809r;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                org.telegram.ui.Components.mm0 mm0Var = this.h;
                if (mm0Var != null && mm0Var.getEmptyView() == null) {
                    this.h.setEmptyView(this.f42810s);
                }
                tp0 tp0Var = this.f42808n;
                if (tp0Var != null) {
                    tp0Var.l();
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
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.X9));
        return arrayList;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.qu quVar = this.M;
        if (quVar != null && quVar.e) {
            if (z10) {
                quVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.mm0 mm0Var = this.h;
        if (mm0Var != null) {
            mm0Var.getViewTreeObserver().addOnPreDrawListener(new vh(this, 3));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        int i10 = this.f42811w;
        boolean z10 = true;
        if (i10 != 1 && i10 != 2 && i10 != 10 && this.f42812x) {
            this.d = MediaController.allMediaAlbums;
        } else {
            this.d = MediaController.allPhotoAlbums;
        }
        if (this.d != null) {
            z10 = false;
        }
        this.e = z10;
        MediaController.loadGalleryPhotosAlbums(this.classGuid);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        org.telegram.ui.Components.qu quVar = this.M;
        if (quVar != null) {
            quVar.o();
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        tp0 tp0Var = this.f42808n;
        if (tp0Var != null) {
            tp0Var.l();
        }
        org.telegram.ui.Components.qu quVar = this.M;
        if (quVar != null) {
            quVar.s();
        }
        org.telegram.ui.Components.mm0 mm0Var = this.h;
        if (mm0Var != null) {
            mm0Var.getViewTreeObserver().addOnPreDrawListener(new vh(this, 3));
        }
    }
}
