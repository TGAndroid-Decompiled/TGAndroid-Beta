package yg;

import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bi.i5;
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
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.a8;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.y5;
import org.telegram.ui.k61;
import org.telegram.ui.web.d1;
import org.telegram.ui.zd;
import w7.a6;
import xh.a7;
public final class s extends p2 implements NotificationCenter.NotificationCenterDelegate {
    public final LinkedHashMap E;
    public final ArrayList F;
    public final LinkedHashMap G;
    public final ArrayList H;
    public boolean I;
    public final int J;
    public boolean K;
    public final TLRPC.ChatFull L;
    public final long M;
    public int N;
    public int O;
    public TLRPC.Chat P;
    public TL_stories.TL_premium_boostsStatus Q;
    public int R;
    public int S;
    public boolean T;
    public final i U;
    public boolean f47133a;
    public r f47134b;
    public a7 f47135c;
    public g d;
    public x8 e;
    public LinearLayout f47136f;
    public zd h;
    public p f47137n;
    public a8 f47138r;
    public x8 f47139s;
    public s0 v;
    public FrameLayout f47140w;
    public ImageView f47141x;
    public io0 f47142y;

    public s(long j3, TLRPC.ChatFull chatFull) {
        super(null);
        this.E = new LinkedHashMap();
        this.F = new ArrayList();
        this.G = new LinkedHashMap();
        this.H = new ArrayList();
        this.J = getMessagesController().boostsChannelLevelMax;
        this.K = false;
        this.S = -1;
        this.U = new i(this, 5);
        this.M = j3;
        this.L = chatFull;
    }

    public static boolean U(s sVar) {
        return sVar.inPreviewMode;
    }

    public static boolean V(s sVar) {
        return sVar.inBubbleMode;
    }

    public final void W(y5 y5Var) {
        Editable text = this.f47137n.getText();
        Layout layout = this.f47137n.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(y5Var)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            y5[] y5VarArr = (y5[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), y5.class);
            for (y5 y5Var2 : y5VarArr) {
                y5Var2.setAnimateChanges();
            }
        }
    }

    public final boolean X(boolean z10) {
        boolean z11 = true;
        boolean z12 = !this.E.keySet().equals(this.G.keySet());
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.Q;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < this.R) {
            z12 = false;
        }
        if (this.I == this.f47133a) {
            z11 = z12;
        }
        if (z10 && z11) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            alertDialog$Builder.f17528a.R = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
            alertDialog$Builder.f17528a.T = LocaleController.getString("ReactionApplyChangesDialog", R.string.ReactionApplyChangesDialog);
            alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new c2(this) {
                public final s f47012b;

                {
                    this.f47012b = this;
                }

                @Override
                public final void f(d2 d2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f47012b.v.performClick();
                            return;
                        default:
                            this.f47012b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new c2(this) {
                public final s f47012b;

                {
                    this.f47012b = this;
                }

                @Override
                public final void f(d2 d2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f47012b.v.performClick();
                            return;
                        default:
                            this.f47012b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.o();
        }
        return z11;
    }

    public final void Y(boolean z10) {
        if (this.Q == null) {
            return;
        }
        if (this.S == 0) {
            this.S = 1;
        }
        int size = b0(true).size();
        this.R = size;
        if (this.Q.level < size) {
            if (z10) {
                wc.a0(this).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ReactionReachLvlForReactionShort", size, Integer.valueOf(size)))).j();
            }
            this.v.setLvlRequiredState(this.R);
            return;
        }
        this.v.f(null, true);
    }

    public final void Z() {
        if (this.K) {
            this.K = false;
            if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                this.f47136f.setFocusableInTouchMode(true);
                this.f47136f.requestFocus();
            } else {
                this.f47137n.clearFocus();
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f47142y.getLayoutParams();
            marginLayoutParams.bottomMargin = 0;
            this.f47142y.setLayoutParams(marginLayoutParams);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.f47135c.animate().setListener(null).cancel();
            this.f47135c.animate().translationY(this.f47135c.getMeasuredHeight()).setDuration(350L).withLayer().setInterpolator(wr.f28819f).setUpdateListener(new j(this, 1)).setListener(new m(this, 0)).start();
        }
    }

    public final boolean a0() {
        int editTextSelectionEnd = this.f47137n.getEditTextSelectionEnd();
        int editTextSelectionStart = this.f47137n.getEditTextSelectionStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f47137n.getText());
        if (!this.f47137n.hasSelection()) {
            return false;
        }
        y5[] y5VarArr = (y5[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, y5.class);
        for (y5 y5Var : y5VarArr) {
            this.E.remove(Long.valueOf(y5Var.documentId));
            this.F.remove(Long.valueOf(y5Var.documentId));
            this.f47134b.A(Long.valueOf(y5Var.documentId));
        }
        this.f47137n.dispatchKeyEvent(new KeyEvent(0, 67));
        Y(false);
        return true;
    }

    public final ArrayList b0(boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.F;
        int size = arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            Long l4 = (Long) obj;
            if (l4.longValue() != -1) {
                ArrayList arrayList4 = this.H;
                int size2 = arrayList4.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size2) {
                        Object obj2 = arrayList4.get(i11);
                        i11++;
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj2;
                        if (l4.longValue() == tL_availableReaction.activate_animation.f17201id) {
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

    public final void c0(int i10, boolean z10, boolean z11) {
        boolean z12;
        int i11;
        if (this.S != i10 || this.f47133a != z10) {
            this.f47133a = z10;
            if (i10 != 1 && i10 != 0 && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.e.setChecked(z12);
            if (z12) {
                i11 = j6.f17964f6;
            } else {
                i11 = j6.f17946e6;
            }
            int w02 = j6.w0(null, i11, false);
            if (z11) {
                if (z12) {
                    this.e.b(w02, true);
                } else {
                    this.e.setBackgroundColorAnimatedReverse(w02);
                }
            } else {
                this.e.setBackgroundColor(w02);
            }
            this.S = i10;
            if (i10 != 1 && i10 != 0 && !z10) {
                if (z11) {
                    Z();
                    this.f47140w.animate().setListener(null).cancel();
                    this.f47136f.animate().setListener(null).cancel();
                    ViewPropertyAnimator duration = this.f47140w.animate().alpha(0.0f).setDuration(350L);
                    wr wrVar = wr.f28819f;
                    duration.setInterpolator(wrVar).setListener(new m(this, 2)).start();
                    this.f47136f.animate().alpha(0.0f).setDuration(350L).setInterpolator(wrVar).setListener(new m(this, 3)).start();
                    return;
                }
                this.f47136f.setVisibility(4);
                this.f47140w.setVisibility(4);
                return;
            }
            this.f47136f.setVisibility(0);
            this.f47140w.setVisibility(0);
            if (z11) {
                this.f47140w.animate().setListener(null).cancel();
                this.f47136f.animate().setListener(null).cancel();
                ViewPropertyAnimator duration2 = this.f47136f.animate().alpha(1.0f).setDuration(350L);
                wr wrVar2 = wr.f28819f;
                duration2.setInterpolator(wrVar2).setListener(new m(this, 1)).start();
                this.f47140w.animate().alpha(1.0f).setDuration(350L).setInterpolator(wrVar2).start();
                LinkedHashMap linkedHashMap = this.E;
                if (linkedHashMap.isEmpty()) {
                    this.f47134b.K.clear();
                    this.f47137n.setText("");
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ArrayList arrayList = this.H;
                    int size = arrayList.size();
                    int i12 = 0;
                    int i13 = 0;
                    while (i13 < size) {
                        int i14 = i13 + 1;
                        r0.a((TLRPC.TL_availableReaction) arrayList.get(i13), linkedHashMap, this.F, spannableStringBuilder, this.f47134b, this.f47137n.getFontMetricsInt());
                        i12++;
                        if (i12 >= this.J) {
                            break;
                        }
                        i13 = i14;
                    }
                    this.f47137n.append(spannableStringBuilder);
                    this.f47137n.m();
                    k61 k61Var = this.f47134b.f34585p0;
                    if (k61Var != null) {
                        k61Var.l();
                    }
                    Y(false);
                }
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        if (X(true)) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final android.view.View createView(android.content.Context r26) {
        throw new UnsupportedOperationException("Method not decompiled: yg.s.createView(android.content.Context):android.view.View");
    }

    public final void d0() {
        x8 x8Var = this.f47139s;
        boolean z10 = x8Var.e.h;
        int i10 = this.J;
        LinkedHashMap linkedHashMap = this.E;
        ArrayList arrayList = this.F;
        if (z10) {
            x8Var.setChecked(false);
            arrayList.remove((Object) (-1L));
            y5 y5Var = (y5) linkedHashMap.remove(-1L);
            if (y5Var != null) {
                y5Var.setRemoved(new u2.k0(28, this, y5Var));
            }
            W(y5Var);
            this.f47134b.x(-1L, true);
            Y(false);
            this.f47137n.setMaxLength(i10);
            c0(this.S, this.f47133a, true);
        } else {
            x8Var.setChecked(true);
            try {
                this.f47137n.setMaxLength(i10 + 1);
                SpannableString spannableString = new SpannableString("b");
                n nVar = new n(this);
                nVar.cacheType = p5.g();
                nVar.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, nVar);
                spannableString.setSpan(nVar, 0, spannableString.length(), 33);
                this.f47137n.getText().insert(0, spannableString);
                this.f47134b.x(-1L, true);
                Y(true);
                W(nVar);
            } catch (Exception e) {
                FileLog.e(e);
            }
            c0(this.S, true, true);
        }
        this.f47137n.updateAnimatedEmoji(true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.M)) {
            f5 f5Var = this.parentLayout;
            if (f5Var != null && f5Var.getLastFragment() == this) {
                finishFragment();
            } else {
                removeSelfFromStack();
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.K) {
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
        long j3 = this.M;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        this.P = chat;
        if (chat == null) {
            TLRPC.Chat chatSync = MessagesStorage.getInstance(this.currentAccount).getChatSync(j3);
            this.P = chatSync;
            if (chatSync != null) {
                getMessagesController().putChat(this.P, true);
            }
            return false;
        }
        if (this.L != null) {
            getMessagesController().getBoostsController().getBoostsStats(-j3, new i5(this, 6));
            getNotificationCenter().addObserver(this, NotificationCenter.reactionsDidLoad);
            this.H.addAll(getMediaDataController().getEnabledReactionsList());
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
            return super.onFragmentCreate();
        }
        return false;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        AndroidUtilities.cancelRunOnUIThread(this.U);
        if (this.S == 2 && this.O != this.N) {
            getMessagesController().setCustomChatReactions(this.M, this.S, b0(false), this.O, null, null, null);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override
    public final void onPause() {
        this.T = true;
        this.f47137n.setFocusable(false);
        super.onPause();
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.T) {
            this.T = false;
            this.f47137n.setFocusable(true);
            this.f47137n.setFocusableInTouchMode(true);
            if (this.K) {
                this.f47137n.n(false);
                AndroidUtilities.runOnUIThread(new i(this, 0), 250L);
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && this.S != 2) {
            this.f47137n.setFocusableInTouchMode(true);
        }
        if (z10 && !z11) {
            if (this.f47134b == null) {
                r rVar = new r(this, this, getParentActivity(), getResourceProvider(), j6.v0(j6.G6, getResourceProvider()));
                this.f47134b = rVar;
                rVar.setAnimationsEnabled(false);
                this.f47134b.setClipChildren(false);
                this.f47134b.setBackgroundColor(j6.w0(null, j6.f17928d6, false));
                this.f47135c.addView(this.f47134b, a6.e(-1, -2, 80));
                g gVar = new g(getParentActivity(), getResourceProvider());
                this.d = gVar;
                gVar.setOnBackspace(new k(this, 0));
                this.f47135c.addView(this.d, a6.d(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
                ArrayList arrayList = this.F;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    this.f47134b.x((Long) obj, false);
                }
            }
            AndroidUtilities.runOnUIThread(new d1(14), 200L);
        }
    }
}
