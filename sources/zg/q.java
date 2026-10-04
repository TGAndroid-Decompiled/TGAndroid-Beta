package zg;

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
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Cells.z7;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.z5;
import org.telegram.ui.b61;
import org.telegram.ui.n21;
import org.telegram.ui.zd;
import rg.j1;
import yh.r5;
public final class q extends n2 implements NotificationCenter.NotificationCenterDelegate {
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
    public final h U;
    public boolean f53510a;
    public p f53511b;
    public j1 f53512c;
    public f d;
    public w8 f53513e;
    public LinearLayout f53514f;
    public zd h;
    public o f53515n;
    public z7 f53516r;
    public w8 f53517s;
    public r0 v;
    public FrameLayout f53518w;
    public ImageView f53519x;
    public ro0 f53520y;

    public q(long j3, TLRPC.ChatFull chatFull) {
        super(null);
        this.E = new LinkedHashMap();
        this.F = new ArrayList();
        this.G = new LinkedHashMap();
        this.H = new ArrayList();
        this.J = getMessagesController().boostsChannelLevelMax;
        this.K = false;
        this.S = -1;
        this.U = new h(this, 5);
        this.M = j3;
        this.L = chatFull;
    }

    public static boolean S(q qVar) {
        return qVar.inPreviewMode;
    }

    public static boolean T(q qVar) {
        return qVar.inBubbleMode;
    }

    public final void U(z5 z5Var) {
        Editable text = this.f53515n.getText();
        Layout layout = this.f53515n.getLayout();
        int lineForOffset = layout.getLineForOffset(text.getSpanStart(z5Var)) + 1;
        if (lineForOffset < layout.getLineCount()) {
            z5[] z5VarArr = (z5[]) text.getSpans(layout.getLineStart(lineForOffset), text.length(), z5.class);
            for (z5 z5Var2 : z5VarArr) {
                z5Var2.setAnimateChanges();
            }
        }
    }

    public final boolean W(boolean z10) {
        boolean z11 = true;
        boolean z12 = !this.E.keySet().equals(this.G.keySet());
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.Q;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < this.R) {
            z12 = false;
        }
        if (this.I == this.f53510a) {
            z11 = z12;
        }
        if (z10 && z11) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
            alertDialog$Builder.f20368a.R = LocaleController.getString("UnsavedChanges", R.string.UnsavedChanges);
            alertDialog$Builder.f20368a.T = LocaleController.getString("ReactionApplyChangesDialog", R.string.ReactionApplyChangesDialog);
            alertDialog$Builder.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new a2(this) {
                public final q f53386b;

                {
                    this.f53386b = this;
                }

                @Override
                public final void g(b2 b2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f53386b.v.performClick();
                            return;
                        default:
                            this.f53386b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new a2(this) {
                public final q f53386b;

                {
                    this.f53386b = this;
                }

                @Override
                public final void g(b2 b2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f53386b.v.performClick();
                            return;
                        default:
                            this.f53386b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.o();
        }
        return z11;
    }

    public final void X(boolean z10) {
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
                yc.a0(this).Q(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ReactionReachLvlForReactionShort", size, Integer.valueOf(size)))).j();
            }
            this.v.setLvlRequiredState(this.R);
            return;
        }
        this.v.f(null, true);
    }

    public final void Y() {
        if (this.K) {
            this.K = false;
            if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                this.f53514f.setFocusableInTouchMode(true);
                this.f53514f.requestFocus();
            } else {
                this.f53515n.clearFocus();
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f53520y.getLayoutParams();
            marginLayoutParams.bottomMargin = 0;
            this.f53520y.setLayoutParams(marginLayoutParams);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.f53512c.animate().setListener(null).cancel();
            this.f53512c.animate().translationY(this.f53512c.getMeasuredHeight()).setDuration(350L).withLayer().setInterpolator(tr.f31141f).setUpdateListener(new j(this, 1)).setListener(new l(this, 0)).start();
        }
    }

    public final boolean Z() {
        int editTextSelectionEnd = this.f53515n.getEditTextSelectionEnd();
        int editTextSelectionStart = this.f53515n.getEditTextSelectionStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f53515n.getText());
        if (!this.f53515n.hasSelection()) {
            return false;
        }
        z5[] z5VarArr = (z5[]) spannableStringBuilder.getSpans(editTextSelectionStart, editTextSelectionEnd, z5.class);
        for (z5 z5Var : z5VarArr) {
            this.E.remove(Long.valueOf(z5Var.documentId));
            this.F.remove(Long.valueOf(z5Var.documentId));
            this.f53511b.A(Long.valueOf(z5Var.documentId));
        }
        this.f53515n.dispatchKeyEvent(new KeyEvent(0, 67));
        X(false);
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
                        if (l4.longValue() == tL_availableReaction.activate_animation.f20044id) {
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
        if (this.S != i10 || this.f53510a != z10) {
            this.f53510a = z10;
            if (i10 != 1 && i10 != 0 && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.f53513e.setChecked(z12);
            if (z12) {
                i11 = i6.f20855f6;
            } else {
                i11 = i6.f20838e6;
            }
            int w02 = i6.w0(null, i11, false);
            if (z11) {
                if (z12) {
                    this.f53513e.b(w02, true);
                } else {
                    this.f53513e.setBackgroundColorAnimatedReverse(w02);
                }
            } else {
                this.f53513e.setBackgroundColor(w02);
            }
            this.S = i10;
            if (i10 != 1 && i10 != 0 && !z10) {
                if (z11) {
                    Y();
                    this.f53518w.animate().setListener(null).cancel();
                    this.f53514f.animate().setListener(null).cancel();
                    ViewPropertyAnimator duration = this.f53518w.animate().alpha(0.0f).setDuration(350L);
                    tr trVar = tr.f31141f;
                    duration.setInterpolator(trVar).setListener(new l(this, 2)).start();
                    this.f53514f.animate().alpha(0.0f).setDuration(350L).setInterpolator(trVar).setListener(new l(this, 3)).start();
                    return;
                }
                this.f53514f.setVisibility(4);
                this.f53518w.setVisibility(4);
                return;
            }
            this.f53514f.setVisibility(0);
            this.f53518w.setVisibility(0);
            if (z11) {
                this.f53518w.animate().setListener(null).cancel();
                this.f53514f.animate().setListener(null).cancel();
                ViewPropertyAnimator duration2 = this.f53514f.animate().alpha(1.0f).setDuration(350L);
                tr trVar2 = tr.f31141f;
                duration2.setInterpolator(trVar2).setListener(new l(this, 1)).start();
                this.f53518w.animate().alpha(1.0f).setDuration(350L).setInterpolator(trVar2).start();
                LinkedHashMap linkedHashMap = this.E;
                if (linkedHashMap.isEmpty()) {
                    this.f53511b.K.clear();
                    this.f53515n.setText("");
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    ArrayList arrayList = this.H;
                    int size = arrayList.size();
                    int i12 = 0;
                    int i13 = 0;
                    while (i13 < size) {
                        int i14 = i13 + 1;
                        q0.a((TLRPC.TL_availableReaction) arrayList.get(i13), linkedHashMap, this.F, spannableStringBuilder, this.f53511b, this.f53515n.getFontMetricsInt());
                        i12++;
                        if (i12 >= this.J) {
                            break;
                        }
                        i13 = i14;
                    }
                    this.f53515n.append(spannableStringBuilder);
                    this.f53515n.m();
                    b61 b61Var = this.f53511b.f35330p0;
                    if (b61Var != null) {
                        b61Var.l();
                    }
                    X(false);
                }
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        if (W(true)) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final android.view.View createView(android.content.Context r26) {
        throw new UnsupportedOperationException("Method not decompiled: zg.q.createView(android.content.Context):android.view.View");
    }

    public final void d0() {
        w8 w8Var = this.f53517s;
        boolean z10 = w8Var.f23692e.h;
        int i10 = this.J;
        LinkedHashMap linkedHashMap = this.E;
        ArrayList arrayList = this.F;
        if (z10) {
            w8Var.setChecked(false);
            arrayList.remove((Object) (-1L));
            z5 z5Var = (z5) linkedHashMap.remove(-1L);
            if (z5Var != null) {
                z5Var.setRemoved(new r5(3, this, z5Var));
            }
            U(z5Var);
            this.f53511b.x(-1L, true);
            X(false);
            this.f53515n.setMaxLength(i10);
            c0(this.S, this.f53510a, true);
        } else {
            w8Var.setChecked(true);
            try {
                this.f53515n.setMaxLength(i10 + 1);
                SpannableString spannableString = new SpannableString("b");
                m mVar = new m(this);
                mVar.cacheType = q5.g();
                mVar.setAdded();
                arrayList.add(0, -1L);
                linkedHashMap.put(-1L, mVar);
                spannableString.setSpan(mVar, 0, spannableString.length(), 33);
                this.f53515n.getText().insert(0, spannableString);
                this.f53511b.x(-1L, true);
                X(true);
                U(mVar);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            c0(this.S, true, true);
        }
        this.f53515n.updateAnimatedEmoji(true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.M)) {
            c5 c5Var = this.parentLayout;
            if (c5Var != null && c5Var.getLastFragment() == this) {
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
                Y();
                return false;
            }
        } else if (!W(z10)) {
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
            getMessagesController().getBoostsController().getBoostsStats(-j3, new i(this, 0));
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
        this.f53515n.setFocusable(false);
        super.onPause();
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.T) {
            this.T = false;
            this.f53515n.setFocusable(true);
            this.f53515n.setFocusableInTouchMode(true);
            if (this.K) {
                this.f53515n.n(false);
                AndroidUtilities.runOnUIThread(new h(this, 0), 250L);
            }
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && this.S != 2) {
            this.f53515n.setFocusableInTouchMode(true);
        }
        if (z10 && !z11) {
            if (this.f53511b == null) {
                p pVar = new p(this, this, getParentActivity(), getResourceProvider(), i6.v0(i6.G6, getResourceProvider()));
                this.f53511b = pVar;
                pVar.setAnimationsEnabled(false);
                this.f53511b.setClipChildren(false);
                this.f53511b.setBackgroundColor(i6.w0(null, i6.f20818d6, false));
                this.f53512c.addView(this.f53511b, w7.z5.e(-1, -2, 80));
                f fVar = new f(getParentActivity(), getResourceProvider());
                this.d = fVar;
                fVar.setOnBackspace(new i(this, 1));
                this.f53512c.addView(this.d, w7.z5.d(-1, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
                ArrayList arrayList = this.F;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    this.f53511b.x((Long) obj, false);
                }
            }
            AndroidUtilities.runOnUIThread(new n21(22), 200L);
        }
    }
}
