package zg;

import android.graphics.Paint;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.z5;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.n21;
import org.telegram.ui.z51;
import rg.j1;
import yh.s5;
public final class o extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public e71 E;
    public final ArrayList F;
    public final ArrayList G;
    public final LinkedHashMap H;
    public final ArrayList I;
    public final LinkedHashMap J;
    public final ArrayList K;
    public boolean L;
    public final int M;
    public boolean N;
    public boolean O;
    public le.b P;
    public final TLRPC.ChatFull Q;
    public final long R;
    public int S;
    public int T;
    public TLRPC.Chat U;
    public TL_stories.TL_premium_boostsStatus V;
    public int W;
    public int X;
    public boolean Y;
    public final h Z;
    public boolean f53500a;
    public m f53501b;
    public j1 f53502c;
    public f d;
    public w8 f53503e;
    public e9 f53504f;
    public l h;
    public z7 f53505n;
    public w8 f53506r;
    public p0 f53507s;
    public FrameLayout v;
    public ImageView f53508w;
    public int f53509x;
    public final Paint f53510y;

    public o(long j3, TLRPC.ChatFull chatFull) {
        super(null);
        this.f53510y = new Paint();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new LinkedHashMap();
        this.I = new ArrayList();
        this.J = new LinkedHashMap();
        this.K = new ArrayList();
        this.M = getMessagesController().boostsChannelLevelMax;
        this.N = false;
        this.X = -1;
        this.Z = new h(this, 6);
        this.R = j3;
        this.Q = chatFull;
    }

    public static boolean S(o oVar) {
        return oVar.inPreviewMode;
    }

    public static boolean T(o oVar) {
        return oVar.inBubbleMode;
    }

    public final void U(View view, boolean z10) {
        this.F.add(view);
        this.G.add(Boolean.valueOf(z10));
    }

    public final void W(z5 z5Var) {
        Editable text = this.h.getText();
        Layout layout = this.h.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(z5Var)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            z5[] z5VarArr = (z5[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), z5.class);
            for (z5 z5Var2 : z5VarArr) {
                z5Var2.setAnimateChanges();
            }
        }
    }

    public final boolean X(boolean z10) {
        boolean z11 = true;
        boolean z12 = !this.H.keySet().equals(this.J.keySet());
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.V;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < this.W) {
            z12 = false;
        }
        if (this.L == this.f53500a) {
            z11 = z12;
        }
        if (z10 && z11) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            alertDialog$Builder.f20377a.R = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
            alertDialog$Builder.f20377a.T = LocaleController.getString("ReactionApplyChangesDialog", R.string.ReactionApplyChangesDialog);
            alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new a2(this) {
                public final o f53392b;

                {
                    this.f53392b = this;
                }

                @Override
                public final void g(b2 b2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f53392b.f53507s.performClick();
                            return;
                        default:
                            this.f53392b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new a2(this) {
                public final o f53392b;

                {
                    this.f53392b = this;
                }

                @Override
                public final void g(b2 b2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f53392b.f53507s.performClick();
                            return;
                        default:
                            this.f53392b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.o();
        }
        return z11;
    }

    public final void Y(boolean z10) {
        if (this.V == null) {
            return;
        }
        if (this.X == 0) {
            this.X = 1;
        }
        int size = c0(true).size();
        this.W = size;
        if (this.V.level < size) {
            if (z10) {
                yc.a0(this).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ReactionReachLvlForReactionShort", size, Integer.valueOf(size)))).j();
            }
            this.f53507s.setLvlRequiredState(this.W);
            return;
        }
        this.f53507s.f(null, true);
    }

    public final void Z() {
        if (this.N) {
            this.N = false;
            if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                this.E.setFocusableInTouchMode(true);
                this.E.requestFocus();
            } else {
                this.h.clearFocus();
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.f53502c.setLayerType(2, null);
            this.P.a(false, true);
        }
    }

    public final boolean b0() {
        int editTextSelectionEnd = this.h.getEditTextSelectionEnd();
        int editTextSelectionStart = this.h.getEditTextSelectionStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.h.getText());
        if (!this.h.hasSelection()) {
            return false;
        }
        z5[] z5VarArr = (z5[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, z5.class);
        for (z5 z5Var : z5VarArr) {
            this.H.remove(Long.valueOf(z5Var.documentId));
            this.I.remove(Long.valueOf(z5Var.documentId));
            this.f53501b.A(Long.valueOf(z5Var.documentId));
        }
        this.h.dispatchKeyEvent(new KeyEvent(0, 67));
        Y(false);
        return true;
    }

    public final ArrayList c0(boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.I;
        int size = arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            Long l4 = (Long) obj;
            if (l4.longValue() != -1) {
                ArrayList arrayList4 = this.K;
                int size2 = arrayList4.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size2) {
                        Object obj2 = arrayList4.get(i11);
                        i11++;
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj2;
                        if (l4.longValue() == tL_availableReaction.activate_animation.f20053id) {
                            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                            tL_reactionEmoji.emoticon = tL_availableReaction.reaction;
                            arrayList.add(tL_reactionEmoji);
                            break;
                        }
                    } else {
                        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                        tL_reactionCustomEmoji.document_id = l4.longValue();
                        arrayList.add(tL_reactionCustomEmoji);
                        arrayList2.add(tL_reactionCustomEmoji);
                        break;
                    }
                }
            }
        }
        if (z10) {
            return arrayList2;
        }
        return arrayList;
    }

    @Override
    public final boolean canBeginSlide() {
        if (X(true)) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final android.view.View createView(android.content.Context r20) {
        throw new UnsupportedOperationException("Method not decompiled: zg.o.createView(android.content.Context):android.view.View");
    }

    public final void d0(int i10, boolean z10, boolean z11) {
        boolean z12;
        int i11;
        if (this.X != i10 || this.f53500a != z10) {
            this.f53500a = z10;
            if (i10 != 1 && i10 != 0 && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.f53503e.setChecked(z12);
            if (z12) {
                i11 = i6.f20864f6;
            } else {
                i11 = i6.f20847e6;
            }
            int w02 = i6.w0(null, i11, false);
            if (z11) {
                if (z12) {
                    this.f53503e.b(w02, true);
                } else {
                    this.f53503e.setBackgroundColorAnimatedReverse(w02);
                }
            } else {
                this.f53503e.setBackgroundColor(w02);
            }
            this.X = i10;
            if (i10 != 1 && i10 != 0 && !z10) {
                if (z11) {
                    Z();
                    this.v.animate().setListener(null).cancel();
                    this.v.animate().alpha(0.0f).setDuration(350L).setInterpolator(tr.f31215f).setListener(new pg.d0(this, 13)).start();
                    this.h.setFocusableInTouchMode(false);
                    this.E.f26034f3.N(true);
                    return;
                }
                this.v.setVisibility(4);
                this.h.setFocusableInTouchMode(false);
                this.E.f26034f3.N(false);
                return;
            }
            this.v.setVisibility(0);
            this.E.f26034f3.N(z11);
            if (z11) {
                this.v.animate().setListener(null).cancel();
                this.v.animate().alpha(1.0f).setDuration(350L).setInterpolator(tr.f31215f).start();
                this.E.post(new h(this, 1));
                LinkedHashMap linkedHashMap = this.H;
                if (linkedHashMap.isEmpty()) {
                    this.f53501b.K.clear();
                    this.h.setText("");
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ArrayList arrayList = this.K;
                    int size = arrayList.size();
                    int i12 = 0;
                    int i13 = 0;
                    while (i13 < size) {
                        int i14 = i13 + 1;
                        o0.a((TLRPC.TL_availableReaction) arrayList.get(i13), linkedHashMap, this.I, spannableStringBuilder, this.f53501b, this.h.getFontMetricsInt());
                        i12++;
                        if (i12 >= this.M) {
                            break;
                        }
                        i13 = i14;
                    }
                    this.h.append(spannableStringBuilder);
                    this.h.m();
                    z51 z51Var = this.f53501b.f34754p0;
                    if (z51Var != null) {
                        z51Var.l();
                    }
                    Y(false);
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.R)) {
            c5 c5Var = this.parentLayout;
            if (c5Var != null && c5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    public final void e0(float f7) {
        float a2 = w7.q.a(f7, 0.0f, 1.0f);
        j1 j1Var = this.f53502c;
        if (j1Var != null && this.v != null) {
            j1Var.setTranslationY((1.0f - a2) * j1Var.getMeasuredHeight());
            this.v.setTranslationY((-a2) * this.f53502c.getMeasuredHeight());
        }
        g0();
        i0();
    }

    public final void f0() {
        w8 w8Var = this.f53506r;
        boolean z10 = w8Var.f23699e.h;
        int i10 = this.M;
        LinkedHashMap linkedHashMap = this.H;
        ArrayList arrayList = this.I;
        if (z10) {
            w8Var.setChecked(false);
            arrayList.remove((Object) (-1L));
            z5 z5Var = (z5) linkedHashMap.remove(-1L);
            if (z5Var != null) {
                z5Var.setRemoved(new s5(3, this, z5Var));
            }
            W(z5Var);
            this.f53501b.x(-1L, true);
            Y(false);
            this.h.setMaxLength(i10);
            d0(this.X, this.f53500a, true);
        } else {
            w8Var.setChecked(true);
            try {
                this.h.setMaxLength(i10 + 1);
                SpannableString spannableString = new SpannableString("b");
                n nVar = new n(this);
                nVar.cacheType = q5.g();
                nVar.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, nVar);
                spannableString.setSpan(nVar, 0, spannableString.length(), 33);
                this.h.getText().insert(0, spannableString);
                this.f53501b.x(-1L, true);
                Y(true);
                W(nVar);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            d0(this.X, true, true);
        }
        this.h.updateAnimatedEmoji(true);
    }

    public final void g0() {
        float f7;
        if (this.v != null && this.f53507s != null) {
            le.b bVar = this.P;
            if (bVar != null) {
                f7 = bVar.f15436e;
            } else {
                f7 = 0.0f;
            }
            int round = Math.round((1.0f - f7) * this.f53509x);
            ViewGroup.LayoutParams layoutParams = this.v.getLayoutParams();
            layoutParams.height = AndroidUtilities.dp(74.0f) + round;
            this.v.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f53507s.getLayoutParams();
            layoutParams2.bottomMargin = AndroidUtilities.dp(13.0f) + round;
            this.f53507s.setLayoutParams(layoutParams2);
        }
    }

    @Override
    public final zl0 getListViewForSimpleGlass() {
        return this.E;
    }

    public final void h0() {
        if (this.f53502c != null) {
            this.f53510y.setColor(i6.v0(i6.f20827d6, this.resourceProvider));
            this.f53502c.setPadding(0, 0, 0, this.f53509x);
            this.f53502c.invalidate();
        }
    }

    public final void i0() {
        float f7;
        if (this.E == null) {
            return;
        }
        le.b bVar = this.P;
        if (bVar != null) {
            f7 = bVar.f15436e;
        } else {
            f7 = 0.0f;
        }
        int lerp = AndroidUtilities.lerp(AndroidUtilities.dp(72.0f), AndroidUtilities.dp(12.0f) + Math.max(0, this.f53502c.getMeasuredHeight() - this.mSystemInsets.d), f7);
        e71 e71Var = this.E;
        i0.b bVar2 = this.mSystemInsets;
        li.a.c(e71Var, bVar2.f11527b, bVar2.d, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), lerp);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.N) {
            if (z10) {
                Z();
                return false;
            }
        } else if (!X(z10)) {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        MessagesController messagesController = getMessagesController();
        long j3 = this.R;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        this.U = chat;
        if (chat == null) {
            TLRPC.Chat chatSync = MessagesStorage.getInstance(this.currentAccount).getChatSync(j3);
            this.U = chatSync;
            if (chatSync != null) {
                getMessagesController().putChat(this.U, true);
            }
            return false;
        }
        if (this.Q != null) {
            getMessagesController().getBoostsController().getBoostsStats(-j3, new i(this, 0));
            getNotificationCenter().addObserver(this, NotificationCenter.reactionsDidLoad);
            this.K.addAll(getMediaDataController().getEnabledReactionsList());
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
            return super.onFragmentCreate();
        }
        return false;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        AndroidUtilities.cancelRunOnUIThread(this.Z);
        if (this.X == 2 && this.T != this.S) {
            getMessagesController().setCustomChatReactions(this.R, this.X, c0(false), this.T, null, null, null);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f53509x = i13;
        g0();
        h0();
        i0();
    }

    @Override
    public final void onPause() {
        this.Y = true;
        this.h.setFocusable(false);
        super.onPause();
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.Y) {
            this.Y = false;
            this.h.setFocusable(true);
            this.h.setFocusableInTouchMode(true);
            if (this.N) {
                this.h.n(false);
                AndroidUtilities.runOnUIThread(new h(this, 0), 250L);
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && this.X != 2) {
            this.fragmentView.setFocusableInTouchMode(true);
            this.fragmentView.requestFocus();
            this.h.setFocusableInTouchMode(true);
        }
        if (z10) {
            this.O = true;
        }
        if (z10 && !z11) {
            if (this.f53501b == null) {
                m mVar = new m(this, this, getParentActivity(), getResourceProvider(), i6.v0(i6.G6, getResourceProvider()));
                this.f53501b = mVar;
                mVar.setAnimationsEnabled(false);
                this.f53501b.setClipChildren(false);
                this.f53501b.setBackgroundColor(i6.w0(null, i6.f20827d6, false));
                this.f53502c.addView(this.f53501b, w7.z5.e(-1, -2, 80));
                f fVar = new f(getParentActivity(), getResourceProvider());
                this.d = fVar;
                fVar.setOnBackspace(new i(this, 1));
                this.f53502c.addView(this.d, w7.z5.d(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
                ArrayList arrayList = this.I;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    this.f53501b.x((Long) obj, false);
                }
            }
            AndroidUtilities.runOnUIThread(new n21(22), 200L);
        }
    }
}
