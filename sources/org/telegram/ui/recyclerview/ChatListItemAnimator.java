package org.telegram.ui.recyclerview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.google.mlkit.common.sdkinternal.zzb;
import fi.iki.elonen.NanoHTTPD;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BotHelpCell;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.UserInfoCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.ChatGreetingsView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ThanosEffect;
import org.telegram.ui.Components.voip.VoIPStatusTextView;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda9;
import org.telegram.ui.Stars.SuperRipple$$ExternalSyntheticLambda7;
import org.telegram.ui.Storage.CacheModel$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.PeerStoriesView$40$$ExternalSyntheticLambda1;
import org.telegram.ui.TextMessageEnterTransition;
import org.telegram.ui.VoiceMessageEnterTransition;
import org.telegram.ui.iv.RichMediaCell$$ExternalSyntheticLambda1;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda6;

public abstract class ChatListItemAnimator extends DefaultItemAnimator {
    public static final long DEFAULT_DURATION = 250;
    public static final Interpolator DEFAULT_INTERPOLATOR = new CubicBezierInterpolator(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    private final ChatActivity activity;
    long alphaEnterDelay;
    private ChatGreetingsView chatGreetingsView;
    private Utilities.Callback0Return<ThanosEffect> getThanosEffectContainer;
    private RecyclerView.ViewHolder greetingsSticker;
    private final RecyclerListView recyclerListView;
    private final Theme.ResourcesProvider resourcesProvider;
    private boolean reversePositions;
    private boolean shouldAnimateEnterFromBottom;
    private Utilities.Callback0Return<Boolean> supportsThanosEffectContainer;
    private HashMap<Integer, MessageObject.GroupedMessages> willRemovedGroup = new HashMap<>();
    private ArrayList<MessageObject.GroupedMessages> willChangedGroups = new ArrayList<>();
    HashMap<RecyclerView.ViewHolder, Animator> animators = new HashMap<>();
    ArrayList<View> thanosViews = new ArrayList<>();
    ArrayList<Runnable> runOnAnimationsEnd = new ArrayList<>();
    HashMap<Long, Long> groupIdToEnterDelay = new HashMap<>();
    private final ArrayList<RecyclerView.ViewHolder> toBeSnapped = new ArrayList<>();

    public final class AnonymousClass11 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final ChatListItemAnimator this$0;
        public final RecyclerView.ViewHolder val$holder;
        public final View val$view;

        public AnonymousClass11(int i, View view, RecyclerView.ViewHolder viewHolder, ChatListItemAnimator chatListItemAnimator) {
            this.$r8$classId = i;
            this.this$0 = chatListItemAnimator;
            this.val$holder = viewHolder;
            this.val$view = view;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    this.val$view.setAlpha(1.0f);
                    break;
                default:
                    super.onAnimationCancel(animator);
                    break;
            }
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    animator.removeAllListeners();
                    View view = this.val$view;
                    view.setAlpha(1.0f);
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                    view.setTranslationY(0.0f);
                    view.setTranslationY(0.0f);
                    ChatListItemAnimator chatListItemAnimator = this.this$0;
                    ArrayList arrayList = ((DefaultItemAnimator) chatListItemAnimator).mAddAnimations;
                    RecyclerView.ViewHolder viewHolder = this.val$holder;
                    if (arrayList.remove(viewHolder)) {
                        chatListItemAnimator.dispatchAddFinished(viewHolder);
                        chatListItemAnimator.dispatchFinishedWhenDone();
                    }
                    break;
                default:
                    animator.removeAllListeners();
                    View view2 = this.val$view;
                    view2.setAlpha(1.0f);
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                    view2.setTranslationX(0.0f);
                    view2.setTranslationY(0.0f);
                    ChatListItemAnimator chatListItemAnimator2 = this.this$0;
                    ArrayList arrayList2 = ((DefaultItemAnimator) chatListItemAnimator2).mRemoveAnimations;
                    RecyclerView.ViewHolder viewHolder2 = this.val$holder;
                    if (arrayList2.remove(viewHolder2)) {
                        chatListItemAnimator2.dispatchRemoveFinished(viewHolder2);
                        chatListItemAnimator2.dispatchFinishedWhenDone();
                    }
                    break;
            }
        }

        @Override
        public void onAnimationStart(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    this.this$0.dispatchAddStarting(this.val$holder);
                    break;
                default:
                    super.onAnimationStart(animator);
                    break;
            }
        }
    }

    public final class AnonymousClass3 extends AnimatorListenerAdapter {
        public final int $r8$classId = 1;
        public final Object this$0;
        public final Object val$animation;
        public final Object val$holder;
        public final View val$view;

        public AnonymousClass3(VoIPStatusTextView voIPStatusTextView, View view, View view2, Runnable runnable) {
            this.this$0 = voIPStatusTextView;
            this.val$view = view;
            this.val$holder = view2;
            this.val$animation = runnable;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    View view = this.val$view;
                    view.setTranslationY(0.0f);
                    if (view instanceof ChatMessageCell) {
                        ((ChatMessageCell) view).getTransitionParams().messageEntering = false;
                    }
                    break;
                default:
                    super.onAnimationCancel(animator);
                    break;
            }
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    View view = this.val$view;
                    if (view instanceof ChatMessageCell) {
                        ((ChatMessageCell) view).getTransitionParams().messageEntering = false;
                    }
                    ((ViewPropertyAnimator) this.val$animation).setListener(null);
                    ChatListItemAnimator chatListItemAnimator = (ChatListItemAnimator) this.this$0;
                    ArrayList arrayList = ((DefaultItemAnimator) chatListItemAnimator).mAddAnimations;
                    RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) this.val$holder;
                    if (arrayList.remove(viewHolder)) {
                        chatListItemAnimator.dispatchAddFinished(viewHolder);
                        chatListItemAnimator.dispatchFinishedWhenDone();
                    }
                    break;
                default:
                    View view2 = this.val$view;
                    view2.setVisibility(8);
                    view2.setAlpha(1.0f);
                    view2.setTranslationY(0.0f);
                    view2.setScaleY(1.0f);
                    view2.setScaleX(1.0f);
                    View view3 = (View) this.val$holder;
                    view3.setAlpha(1.0f);
                    view3.setTranslationY(0.0f);
                    view3.setVisibility(0);
                    view3.setScaleY(1.0f);
                    view3.setScaleX(1.0f);
                    Runnable runnable = (Runnable) this.val$animation;
                    if (runnable != null) {
                        runnable.run();
                    }
                    VoIPStatusTextView voIPStatusTextView = (VoIPStatusTextView) this.this$0;
                    voIPStatusTextView.animationInProgress = false;
                    CharSequence charSequence = voIPStatusTextView.nextTextToSet;
                    if (charSequence != null) {
                        if (charSequence.equals("timer")) {
                            voIPStatusTextView.showTimer(true);
                        } else {
                            TextView[] textViewArr = voIPStatusTextView.textView;
                            textViewArr[1].setText(voIPStatusTextView.nextTextToSet);
                            voIPStatusTextView.replaceViews(textViewArr[0], textViewArr[1], new GiftSheet$$ExternalSyntheticLambda9(this, 22));
                        }
                        voIPStatusTextView.nextTextToSet = null;
                    }
                    break;
            }
        }

        @Override
        public void onAnimationStart(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    ((ChatListItemAnimator) this.this$0).dispatchAddStarting((RecyclerView.ViewHolder) this.val$holder);
                    break;
                default:
                    super.onAnimationStart(animator);
                    break;
            }
        }

        public AnonymousClass3(ChatListItemAnimator chatListItemAnimator, RecyclerView.ViewHolder viewHolder, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.this$0 = chatListItemAnimator;
            this.val$holder = viewHolder;
            this.val$view = view;
            this.val$animation = viewPropertyAnimator;
        }
    }

    public final class ItemHolderInfoExtended extends RecyclerView.ItemAnimator.ItemHolderInfo {
        public float imageHeight;
        public float imageWidth;
        public float imageX;
        public float imageY;
    }

    public final class MoveInfoExtended extends DefaultItemAnimator.MoveInfo {
        public boolean animateBackgroundOnly;
        public boolean animateChangeGroupBackground;
        public boolean animateChangeInternal;
        public boolean animateImage;
        public boolean animatePinnedBottom;
        public boolean animateRemoveGroup;
        public int deltaBottom;
        public int deltaLeft;
        public int deltaRight;
        public int deltaTop;
        public int groupOffsetBottom;
        public int groupOffsetLeft;
        public int groupOffsetRight;
        public int groupOffsetTop;
        public float imageHeight;
        public float imageWidth;
        public float imageX;
        public float imageY;
    }

    public ChatListItemAnimator(ChatActivity chatActivity, RecyclerListView recyclerListView, Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
        this.activity = chatActivity;
        this.recyclerListView = recyclerListView;
        this.translationInterpolator = DEFAULT_INTERPOLATOR;
        this.alwaysCreateMoveAnimationIfPossible = true;
        setSupportsChangeAnimations(false);
    }

    public static void lambda$animateAddImpl$8(ChatMessageCell chatMessageCell, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        chatMessageCell.getTransitionParams().animateChangeProgress = fFloatValue;
        if (chatMessageCell.getTransitionParams().animateChangeProgress > 1.0f) {
            chatMessageCell.getTransitionParams().animateChangeProgress = 1.0f;
        }
        float f9 = 1.0f - fFloatValue;
        chatMessageCell.getPhotoImage().setImageCoords((f2 * f9) + f, (f4 * f9) + f3, (f6 * fFloatValue) + (f5 * f9), (f8 * fFloatValue) + (f7 * f9));
        chatMessageCell.invalidate();
    }

    public static void lambda$animateMoveImpl$2(MoveInfoExtended moveInfoExtended, ChatMessageCell.TransitionParams transitionParams, boolean z, float f, float f2, ChatMessageCell chatMessageCell, int[] iArr, RecyclerView.ViewHolder viewHolder, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f3 = 1.0f - fFloatValue;
        float f4 = (transitionParams.animateToImageX * fFloatValue) + (moveInfoExtended.imageX * f3);
        float f5 = (transitionParams.animateToImageY * fFloatValue) + (moveInfoExtended.imageY * f3);
        float f6 = (transitionParams.animateToImageW * fFloatValue) + (moveInfoExtended.imageWidth * f3);
        float f7 = (transitionParams.animateToImageH * fFloatValue) + (moveInfoExtended.imageHeight * f3);
        if (z) {
            float f8 = (f2 * fFloatValue) + (f * f3);
            transitionParams.captionEnterProgress = f8;
            if (chatMessageCell.getCurrentMessagesGroup() != null) {
                chatMessageCell.getCurrentMessagesGroup().transitionParams.captionEnterProgress = f8;
            }
        }
        if (transitionParams.animateRadius) {
            ImageReceiver photoImage = chatMessageCell.getPhotoImage();
            float f9 = iArr[0] * f3;
            int[] iArr2 = transitionParams.animateToRadius;
            photoImage.setRoundRadius((int) ((iArr2[0] * fFloatValue) + f9), (int) ((iArr2[1] * fFloatValue) + (iArr[1] * f3)), (int) ((iArr2[2] * fFloatValue) + (iArr[2] * f3)), (int) ((iArr2[3] * fFloatValue) + (iArr[3] * f3)));
        }
        chatMessageCell.setImageCoords(f4, f5, f6, f7);
        viewHolder.itemView.invalidate();
    }

    public static void lambda$animateMoveImpl$3(MoveInfoExtended moveInfoExtended, ChatMessageCell.TransitionParams transitionParams, ChatMessageCell chatMessageCell, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (moveInfoExtended.animateBackgroundOnly) {
            transitionParams.deltaLeft = (-moveInfoExtended.deltaLeft) * fFloatValue;
            transitionParams.deltaRight = (-moveInfoExtended.deltaRight) * fFloatValue;
            transitionParams.deltaTop = (-moveInfoExtended.deltaTop) * fFloatValue;
            transitionParams.deltaBottom = (-moveInfoExtended.deltaBottom) * fFloatValue;
        } else {
            transitionParams.deltaLeft = ((-moveInfoExtended.deltaLeft) * fFloatValue) - chatMessageCell.getAnimationOffsetX();
            transitionParams.deltaRight = ((-moveInfoExtended.deltaRight) * fFloatValue) - chatMessageCell.getAnimationOffsetX();
            transitionParams.deltaTop = ((-moveInfoExtended.deltaTop) * fFloatValue) - chatMessageCell.getTranslationY();
            transitionParams.deltaBottom = ((-moveInfoExtended.deltaBottom) * fFloatValue) - chatMessageCell.getTranslationY();
        }
        chatMessageCell.invalidate();
    }

    public static void lambda$animateMoveImpl$4(MessageObject.GroupedMessages.TransitionParams transitionParams, MoveInfoExtended moveInfoExtended, boolean z, float f, float f2, RecyclerListView recyclerListView, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        transitionParams.offsetTop = moveInfoExtended.groupOffsetTop * fFloatValue;
        transitionParams.offsetBottom = moveInfoExtended.groupOffsetBottom * fFloatValue;
        transitionParams.offsetLeft = moveInfoExtended.groupOffsetLeft * fFloatValue;
        transitionParams.offsetRight = moveInfoExtended.groupOffsetRight * fFloatValue;
        if (z) {
            transitionParams.captionEnterProgress = DiffUtil.m(1.0f, fFloatValue, f2, f * fFloatValue);
        }
        if (recyclerListView != null) {
            recyclerListView.invalidate();
        }
    }

    public static void lambda$animateMoveImpl$5(ChatMessageCell.TransitionParams transitionParams, ChatMessageCell chatMessageCell, ValueAnimator valueAnimator) {
        transitionParams.changePinnedBottomProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        chatMessageCell.invalidate();
    }

    public static void lambda$animateMoveImpl$6(ChatMessageCell.TransitionParams transitionParams, ChatMessageCell chatMessageCell, ValueAnimator valueAnimator) {
        transitionParams.animateChangeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        chatMessageCell.invalidate();
    }

    public static void lambda$animateMoveImpl$7(ChatActionCell.TransitionParams transitionParams, ChatActionCell chatActionCell, ValueAnimator valueAnimator) {
        transitionParams.animateChangeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        chatActionCell.invalidate();
    }

    public static int lambda$runAlphaEnterTransition$1(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        return viewHolder2.itemView.getTop() - viewHolder.itemView.getTop();
    }

    @Override
    public boolean animateAdd(RecyclerView.ViewHolder viewHolder) {
        resetAnimation(viewHolder);
        viewHolder.itemView.setAlpha(0.0f);
        if (this.shouldAnimateEnterFromBottom) {
            View view = viewHolder.itemView;
            if (view instanceof ChatMessageCell) {
                ((ChatMessageCell) view).getTransitionParams().messageEntering = true;
            }
        } else {
            viewHolder.itemView.setScaleX(0.9f);
            viewHolder.itemView.setScaleY(0.9f);
        }
        this.mPendingAdditions.add(viewHolder);
        return true;
    }

    public void animateAddImpl(RecyclerView.ViewHolder viewHolder, int i) {
        View view = viewHolder.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.mAddAnimations.add(viewHolder);
        view.setTranslationY(i);
        viewHolder.itemView.setScaleX(1.0f);
        viewHolder.itemView.setScaleY(1.0f);
        View view2 = viewHolder.itemView;
        ChatMessageCell chatMessageCell = view2 instanceof ChatMessageCell ? (ChatMessageCell) view2 : null;
        if (chatMessageCell == null || !chatMessageCell.getTransitionParams().ignoreAlpha) {
            viewHolder.itemView.setAlpha(1.0f);
        }
        ChatActivity chatActivity = this.activity;
        if (chatActivity != null && chatMessageCell != null && chatActivity.animatingMessageObjects.contains(chatMessageCell.getMessageObject())) {
            this.activity.animatingMessageObjects.remove(chatMessageCell.getMessageObject());
            if (this.activity.getChatActivityEnterView().canShowMessageTransition()) {
                if (chatMessageCell.getMessageObject().isVoice()) {
                    if (Math.abs(view.getTranslationY()) < view.getMeasuredHeight() * 3.0f) {
                        new VoiceMessageEnterTransition(chatMessageCell, this.activity.getChatActivityEnterView(), this.recyclerListView, this.activity.messageEnterTransitionContainer, this.resourcesProvider).start();
                    }
                } else if (SharedConfig.getDevicePerformanceClass() != 0 && Math.abs(view.getTranslationY()) < this.recyclerListView.getMeasuredHeight()) {
                    ChatActivity chatActivity2 = this.activity;
                    new TextMessageEnterTransition(chatMessageCell, chatActivity2, this.recyclerListView, chatActivity2.messageEnterTransitionContainer, this.resourcesProvider).start();
                }
                this.activity.getChatActivityEnterView().startMessageTransition();
            }
        }
        viewPropertyAnimatorAnimate.translationY(0.0f).setDuration(getMoveDuration()).setInterpolator(this.translationInterpolator).setListener(new AnonymousClass3(this, viewHolder, view, viewPropertyAnimatorAnimate)).start();
    }

    @Override
    public boolean animateAppearance(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int height;
        boolean zAnimateAppearance = super.animateAppearance(viewHolder, itemHolderInfo, itemHolderInfo2);
        if (zAnimateAppearance && this.shouldAnimateEnterFromBottom) {
            boolean z = false;
            for (int i = 0; i < this.mPendingAdditions.size(); i++) {
                if (this.mPendingAdditions.get(i).getLayoutPosition() == 0) {
                    z = true;
                }
            }
            if (z) {
                height = 0;
                for (int i2 = 0; i2 < this.mPendingAdditions.size(); i2++) {
                    height += this.mPendingAdditions.get(i2).itemView.getHeight();
                }
            } else {
                height = 0;
            }
            for (int i3 = 0; i3 < this.mPendingAdditions.size(); i3++) {
                this.mPendingAdditions.get(i3).itemView.setTranslationY(height);
            }
        }
        return zAnimateAppearance;
    }

    @Override
    public boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, int i, int i2, int i3, int i4) {
        if (viewHolder == viewHolder2) {
            return animateMove(viewHolder, itemHolderInfo, i, i2, i3, i4);
        }
        View view = viewHolder.itemView;
        float animationOffsetX = view instanceof ChatMessageCell ? ((ChatMessageCell) view).getAnimationOffsetX() : view.getTranslationX();
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        resetAnimation(viewHolder);
        int i5 = (int) ((i3 - i) - animationOffsetX);
        int i6 = (int) ((i4 - i2) - translationY);
        View view2 = viewHolder.itemView;
        if (view2 instanceof ChatMessageCell) {
            ((ChatMessageCell) view2).setAnimationOffsetX(animationOffsetX);
        } else {
            view2.setTranslationX(animationOffsetX);
        }
        viewHolder.itemView.setTranslationY(translationY);
        viewHolder.itemView.setAlpha(alpha);
        if (viewHolder2 != null) {
            resetAnimation(viewHolder2);
            View view3 = viewHolder2.itemView;
            if (view3 instanceof ChatMessageCell) {
                ((ChatMessageCell) view3).setAnimationOffsetX(-i5);
            } else {
                view3.setTranslationX(-i5);
            }
            viewHolder2.itemView.setTranslationY(-i6);
            viewHolder2.itemView.setAlpha(0.0f);
        }
        this.mPendingChanges.add(new DefaultItemAnimator.ChangeInfo(viewHolder, viewHolder2, i, i2, i3, i4));
        checkIsRunning();
        return true;
    }

    @Override
    public void animateChangeImpl(DefaultItemAnimator.ChangeInfo changeInfo) {
        ChatListItemAnimator chatListItemAnimator;
        final DefaultItemAnimator.ChangeInfo changeInfo2;
        RecyclerView.ViewHolder viewHolder = changeInfo.oldHolder;
        final View view = viewHolder == null ? null : viewHolder.itemView;
        RecyclerView.ViewHolder viewHolder2 = changeInfo.newHolder;
        final View view2 = viewHolder2 != null ? viewHolder2.itemView : null;
        if (view != null) {
            final ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.mChangeAnimations.add(changeInfo.oldHolder);
            duration.translationX(changeInfo.toX - changeInfo.fromX);
            duration.translationY(changeInfo.toY - changeInfo.fromY);
            final int i = 0;
            chatListItemAnimator = this;
            changeInfo2 = changeInfo;
            duration.alpha(0.0f).setListener(new AnimatorListenerAdapter(chatListItemAnimator) {
                public final ChatListItemAnimator this$0;

                {
                    this.this$0 = chatListItemAnimator;
                }

                @Override
                public final void onAnimationEnd(Animator animator) {
                    switch (i) {
                        case 0:
                            duration.setListener(null);
                            View view3 = view;
                            view3.setAlpha(1.0f);
                            view3.setScaleX(1.0f);
                            view3.setScaleX(1.0f);
                            if (view3 instanceof ChatMessageCell) {
                                ((ChatMessageCell) view3).setAnimationOffsetX(0.0f);
                            } else {
                                view3.setTranslationX(0.0f);
                            }
                            view3.setTranslationY(0.0f);
                            ChatListItemAnimator chatListItemAnimator2 = this.this$0;
                            ArrayList arrayList = ((DefaultItemAnimator) chatListItemAnimator2).mChangeAnimations;
                            DefaultItemAnimator.ChangeInfo changeInfo3 = changeInfo2;
                            if (arrayList.remove(changeInfo3.oldHolder)) {
                                chatListItemAnimator2.dispatchChangeFinished(changeInfo3.oldHolder, true);
                                chatListItemAnimator2.dispatchFinishedWhenDone();
                            }
                            break;
                        default:
                            duration.setListener(null);
                            View view4 = view;
                            view4.setAlpha(1.0f);
                            view4.setScaleX(1.0f);
                            view4.setScaleX(1.0f);
                            if (view4 instanceof ChatMessageCell) {
                                ((ChatMessageCell) view4).setAnimationOffsetX(0.0f);
                            } else {
                                view4.setTranslationX(0.0f);
                            }
                            view4.setTranslationY(0.0f);
                            ChatListItemAnimator chatListItemAnimator3 = this.this$0;
                            ArrayList arrayList2 = ((DefaultItemAnimator) chatListItemAnimator3).mChangeAnimations;
                            DefaultItemAnimator.ChangeInfo changeInfo4 = changeInfo2;
                            if (arrayList2.remove(changeInfo4.newHolder)) {
                                chatListItemAnimator3.dispatchChangeFinished(changeInfo4.newHolder, false);
                                chatListItemAnimator3.dispatchFinishedWhenDone();
                            }
                            break;
                    }
                }

                @Override
                public final void onAnimationStart(Animator animator) {
                    switch (i) {
                        case 0:
                            this.this$0.dispatchChangeStarting(changeInfo2.oldHolder, true);
                            break;
                        default:
                            this.this$0.dispatchChangeStarting(changeInfo2.newHolder, false);
                            break;
                    }
                }
            }).start();
        } else {
            chatListItemAnimator = this;
            changeInfo2 = changeInfo;
        }
        if (view2 != null) {
            final ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            chatListItemAnimator.mChangeAnimations.add(changeInfo2.newHolder);
            final int i2 = 1;
            final DefaultItemAnimator.ChangeInfo changeInfo3 = changeInfo2;
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new AnimatorListenerAdapter(chatListItemAnimator) {
                public final ChatListItemAnimator this$0;

                {
                    this.this$0 = chatListItemAnimator;
                }

                @Override
                public final void onAnimationEnd(Animator animator) {
                    switch (i2) {
                        case 0:
                            viewPropertyAnimatorAnimate.setListener(null);
                            View view3 = view2;
                            view3.setAlpha(1.0f);
                            view3.setScaleX(1.0f);
                            view3.setScaleX(1.0f);
                            if (view3 instanceof ChatMessageCell) {
                                ((ChatMessageCell) view3).setAnimationOffsetX(0.0f);
                            } else {
                                view3.setTranslationX(0.0f);
                            }
                            view3.setTranslationY(0.0f);
                            ChatListItemAnimator chatListItemAnimator2 = this.this$0;
                            ArrayList arrayList = ((DefaultItemAnimator) chatListItemAnimator2).mChangeAnimations;
                            DefaultItemAnimator.ChangeInfo changeInfo4 = changeInfo3;
                            if (arrayList.remove(changeInfo4.oldHolder)) {
                                chatListItemAnimator2.dispatchChangeFinished(changeInfo4.oldHolder, true);
                                chatListItemAnimator2.dispatchFinishedWhenDone();
                            }
                            break;
                        default:
                            viewPropertyAnimatorAnimate.setListener(null);
                            View view4 = view2;
                            view4.setAlpha(1.0f);
                            view4.setScaleX(1.0f);
                            view4.setScaleX(1.0f);
                            if (view4 instanceof ChatMessageCell) {
                                ((ChatMessageCell) view4).setAnimationOffsetX(0.0f);
                            } else {
                                view4.setTranslationX(0.0f);
                            }
                            view4.setTranslationY(0.0f);
                            ChatListItemAnimator chatListItemAnimator3 = this.this$0;
                            ArrayList arrayList2 = ((DefaultItemAnimator) chatListItemAnimator3).mChangeAnimations;
                            DefaultItemAnimator.ChangeInfo changeInfo5 = changeInfo3;
                            if (arrayList2.remove(changeInfo5.newHolder)) {
                                chatListItemAnimator3.dispatchChangeFinished(changeInfo5.newHolder, false);
                                chatListItemAnimator3.dispatchFinishedWhenDone();
                            }
                            break;
                    }
                }

                @Override
                public final void onAnimationStart(Animator animator) {
                    switch (i2) {
                        case 0:
                            this.this$0.dispatchChangeStarting(changeInfo3.oldHolder, true);
                            break;
                        default:
                            this.this$0.dispatchChangeStarting(changeInfo3.newHolder, false);
                            break;
                    }
                }
            }).start();
        }
    }

    @Override
    public boolean animateMove(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, int i, int i2, int i3, int i4) {
        int translationX;
        int topMediaOffset;
        ChatMessageCell chatMessageCell;
        ChatActionCell chatActionCell;
        float f;
        float f2;
        float imageWidth;
        float f3;
        float f4;
        ChatMessageCell chatMessageCell2;
        boolean z;
        float f5;
        MessageObject.GroupedMessages groupedMessages;
        ChatMessageCell chatMessageCell3;
        int[] iArr;
        View view = viewHolder.itemView;
        if (view instanceof ChatMessageCell) {
            ChatMessageCell chatMessageCell4 = (ChatMessageCell) view;
            translationX = i + ((int) chatMessageCell4.getAnimationOffsetX());
            topMediaOffset = chatMessageCell4.getTransitionParams().lastTopOffset != chatMessageCell4.getTopMediaOffset() ? (chatMessageCell4.getTransitionParams().lastTopOffset - chatMessageCell4.getTopMediaOffset()) + i2 : i2;
            chatMessageCell = chatMessageCell4;
            chatActionCell = null;
        } else if (view instanceof ChatActionCell) {
            translationX = i + ((int) view.getTranslationX());
            topMediaOffset = i2;
            chatActionCell = (ChatActionCell) view;
            chatMessageCell = null;
        } else {
            translationX = i + ((int) view.getTranslationX());
            topMediaOffset = i2;
            chatMessageCell = null;
            chatActionCell = null;
        }
        int i5 = translationX;
        int translationY = topMediaOffset + ((int) viewHolder.itemView.getTranslationY());
        int[] iArr2 = new int[4];
        if (chatMessageCell != null) {
            float imageX = chatMessageCell.getPhotoImage().getImageX();
            float imageY = chatMessageCell.getPhotoImage().getImageY();
            imageWidth = chatMessageCell.getPhotoImage().getImageWidth();
            float imageHeight = chatMessageCell.getPhotoImage().getImageHeight();
            f = 0.0f;
            for (int i6 = 0; i6 < 4; i6++) {
                iArr2[i6] = chatMessageCell.getPhotoImage().getRoundRadius()[i6];
            }
            f3 = imageX;
            f2 = imageHeight;
            f4 = imageY;
        } else {
            f = 0.0f;
            f2 = 0.0f;
            imageWidth = 0.0f;
            f3 = 0.0f;
            f4 = 0.0f;
        }
        resetAnimation(viewHolder);
        int i7 = i3 - i5;
        int i8 = i4 - translationY;
        if (i8 != 0) {
            view.setTranslationY(-i8);
        }
        float f6 = f2;
        ChatActionCell chatActionCell2 = chatActionCell;
        float f7 = imageWidth;
        MoveInfoExtended moveInfoExtended = new MoveInfoExtended(viewHolder, i5, translationY, i3, i4);
        if (chatMessageCell != null) {
            ChatMessageCell.TransitionParams transitionParams = chatMessageCell.getTransitionParams();
            transitionParams.getClass();
            MessageObject.GroupedMessages currentMessagesGroup = chatMessageCell.getCurrentMessagesGroup();
            if (i7 != 0) {
                chatMessageCell.setAnimationOffsetX(-i7);
            }
            if (itemHolderInfo instanceof ItemHolderInfoExtended) {
                ImageReceiver photoImage = chatMessageCell.getPhotoImage();
                ItemHolderInfoExtended itemHolderInfoExtended = (ItemHolderInfoExtended) itemHolderInfo;
                boolean z2 = (!transitionParams.wasDraw || itemHolderInfoExtended.imageHeight == f || itemHolderInfoExtended.imageWidth == f) ? false : true;
                moveInfoExtended.animateImage = z2;
                if (z2) {
                    this.recyclerListView.setClipChildren(false);
                    this.recyclerListView.invalidate();
                    transitionParams.imageChangeBoundsTransition = true;
                    if (chatMessageCell.getMessageObject().isRoundVideo()) {
                        transitionParams.animateToImageX = f3;
                        transitionParams.animateToImageY = f4;
                        transitionParams.animateToImageW = f7;
                        transitionParams.animateToImageH = f6;
                        transitionParams.animateToRadius = iArr2;
                    } else {
                        transitionParams.animateToImageX = photoImage.getImageX();
                        transitionParams.animateToImageY = photoImage.getImageY();
                        transitionParams.animateToImageW = photoImage.getImageWidth();
                        transitionParams.animateToImageH = photoImage.getImageHeight();
                        transitionParams.animateToRadius = photoImage.getRoundRadius();
                    }
                    transitionParams.animateRadius = false;
                    int i9 = 0;
                    while (true) {
                        iArr = transitionParams.imageRoundRadius;
                        if (i9 >= 4) {
                            break;
                        }
                        if (iArr[i9] != transitionParams.animateToRadius[i9]) {
                            transitionParams.animateRadius = true;
                            break;
                        }
                        i9++;
                    }
                    float f8 = transitionParams.animateToImageX;
                    float f9 = itemHolderInfoExtended.imageX;
                    if (f8 == f9 && transitionParams.animateToImageY == itemHolderInfoExtended.imageY && transitionParams.animateToImageH == itemHolderInfoExtended.imageHeight && transitionParams.animateToImageW == itemHolderInfoExtended.imageWidth && !transitionParams.animateRadius) {
                        transitionParams.imageChangeBoundsTransition = false;
                        moveInfoExtended.animateImage = false;
                    } else {
                        moveInfoExtended.imageX = f9;
                        moveInfoExtended.imageY = itemHolderInfoExtended.imageY;
                        moveInfoExtended.imageWidth = itemHolderInfoExtended.imageWidth;
                        moveInfoExtended.imageHeight = itemHolderInfoExtended.imageHeight;
                        if (currentMessagesGroup != null) {
                            boolean z3 = currentMessagesGroup.hasCaption;
                            MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                            boolean z4 = transitionParams2.drawCaptionLayout;
                            if (z3 != z4) {
                                transitionParams2.captionEnterProgress = z4 ? 1.0f : 0.0f;
                            }
                        }
                        if (transitionParams.animateRadius) {
                            if (transitionParams.animateToRadius == photoImage.getRoundRadius()) {
                                transitionParams.animateToRadius = new int[4];
                                for (int i10 = 0; i10 < 4; i10++) {
                                    transitionParams.animateToRadius[i10] = photoImage.getRoundRadius()[i10];
                                }
                            }
                            photoImage.setRoundRadius(iArr);
                        }
                        chatMessageCell.setImageCoords(moveInfoExtended.imageX, moveInfoExtended.imageY, moveInfoExtended.imageWidth, moveInfoExtended.imageHeight);
                    }
                }
                if (currentMessagesGroup == null && transitionParams.wasDraw) {
                    boolean zIsOutOwner = chatMessageCell.getMessageObject().isOutOwner();
                    Rect rect = transitionParams.lastDrawingBackgroundRect;
                    if ((zIsOutOwner && rect.left != chatMessageCell.getBackgroundDrawableLeft()) || ((!zIsOutOwner && rect.right != chatMessageCell.getBackgroundDrawableRight()) || rect.top != chatMessageCell.getBackgroundDrawableTop() || rect.bottom != chatMessageCell.getBackgroundDrawableBottom())) {
                        moveInfoExtended.deltaBottom = chatMessageCell.getBackgroundDrawableBottom() - rect.bottom;
                        moveInfoExtended.deltaTop = chatMessageCell.getBackgroundDrawableTop() - rect.top;
                        if (chatMessageCell.isSideMenuEnabled != transitionParams.lastDrawingSideMenuEnabled) {
                            moveInfoExtended.deltaLeft = chatMessageCell.getBackgroundDrawableLeft() - rect.left;
                            moveInfoExtended.deltaRight = chatMessageCell.getBackgroundDrawableRight() - rect.right;
                        } else if (zIsOutOwner) {
                            moveInfoExtended.deltaLeft = chatMessageCell.getBackgroundDrawableLeft() - rect.left;
                        } else {
                            moveInfoExtended.deltaRight = chatMessageCell.getBackgroundDrawableRight() - rect.right;
                        }
                        moveInfoExtended.animateBackgroundOnly = true;
                        transitionParams.animateBackgroundBoundsInner = true;
                        transitionParams.deltaLeft = -moveInfoExtended.deltaLeft;
                        transitionParams.deltaRight = -moveInfoExtended.deltaRight;
                        transitionParams.deltaTop = -moveInfoExtended.deltaTop;
                        transitionParams.deltaBottom = -moveInfoExtended.deltaBottom;
                        this.recyclerListView.setClipChildren(false);
                        this.recyclerListView.invalidate();
                    }
                }
            }
            if (currentMessagesGroup == null || !this.willChangedGroups.contains(currentMessagesGroup)) {
                chatMessageCell2 = chatMessageCell;
            } else {
                this.willChangedGroups.remove(currentMessagesGroup);
                RecyclerListView recyclerListView = (RecyclerListView) viewHolder.itemView.getParent();
                MessageObject.GroupedMessages.TransitionParams transitionParams3 = currentMessagesGroup.transitionParams;
                boolean z5 = true;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (i11 < recyclerListView.getChildCount()) {
                    View childAt = recyclerListView.getChildAt(i11);
                    int i16 = i11;
                    if (childAt instanceof ChatMessageCell) {
                        ChatMessageCell chatMessageCell5 = (ChatMessageCell) childAt;
                        if (chatMessageCell5.getCurrentMessagesGroup() != currentMessagesGroup || chatMessageCell5.getMessageObject().deleted) {
                            groupedMessages = currentMessagesGroup;
                            chatMessageCell3 = chatMessageCell;
                        } else {
                            int backgroundDrawableLeft = chatMessageCell5.getBackgroundDrawableLeft() + chatMessageCell5.getLeft();
                            groupedMessages = currentMessagesGroup;
                            int backgroundDrawableRight = chatMessageCell5.getBackgroundDrawableRight() + chatMessageCell5.getLeft();
                            chatMessageCell3 = chatMessageCell;
                            int backgroundDrawableTop = chatMessageCell5.getBackgroundDrawableTop() + chatMessageCell5.getPaddingTop() + chatMessageCell5.getTop();
                            int backgroundDrawableBottom = chatMessageCell5.getBackgroundDrawableBottom() + chatMessageCell5.getPaddingTop() + chatMessageCell5.getTop();
                            if (i14 == 0 || backgroundDrawableLeft < i14) {
                                i14 = backgroundDrawableLeft;
                            }
                            if (i15 == 0 || backgroundDrawableRight > i15) {
                                i15 = backgroundDrawableRight;
                            }
                            if (chatMessageCell5.getTransitionParams().wasDraw || transitionParams3.isNewGroup) {
                                if (i12 == 0 || backgroundDrawableTop < i12) {
                                    i12 = backgroundDrawableTop;
                                }
                                if (i13 == 0 || backgroundDrawableBottom > i13) {
                                    i13 = backgroundDrawableBottom;
                                }
                                z5 = false;
                            }
                        }
                    } else {
                        groupedMessages = currentMessagesGroup;
                        chatMessageCell3 = chatMessageCell;
                    }
                    i11 = i16 + 1;
                    currentMessagesGroup = groupedMessages;
                    chatMessageCell = chatMessageCell3;
                }
                chatMessageCell2 = chatMessageCell;
                transitionParams3.isNewGroup = false;
                if (i12 == 0 && i13 == 0 && i14 == 0 && i15 == 0) {
                    moveInfoExtended.animateChangeGroupBackground = false;
                    transitionParams3.backgroundChangeBounds = false;
                } else {
                    int i17 = (-i12) + transitionParams3.top;
                    moveInfoExtended.groupOffsetTop = i17;
                    int i18 = (-i13) + transitionParams3.bottom;
                    moveInfoExtended.groupOffsetBottom = i18;
                    int i19 = (-i14) + transitionParams3.left;
                    moveInfoExtended.groupOffsetLeft = i19;
                    int i20 = (-i15) + transitionParams3.right;
                    moveInfoExtended.groupOffsetRight = i20;
                    moveInfoExtended.animateChangeGroupBackground = true;
                    transitionParams3.backgroundChangeBounds = true;
                    transitionParams3.offsetTop = i17;
                    transitionParams3.offsetBottom = i18;
                    transitionParams3.offsetLeft = i19;
                    transitionParams3.offsetRight = i20;
                    transitionParams3.captionEnterProgress = transitionParams3.drawCaptionLayout ? 1.0f : 0.0f;
                    recyclerListView.setClipChildren(false);
                    recyclerListView.invalidate();
                }
                transitionParams3.drawBackgroundForDeletedItems = z5;
            }
            MessageObject.GroupedMessages groupedMessages2 = this.willRemovedGroup.get(Integer.valueOf(chatMessageCell2.getMessageObject().getId()));
            if (groupedMessages2 != null) {
                MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                this.willRemovedGroup.remove(Integer.valueOf(chatMessageCell2.getMessageObject().getId()));
                if (transitionParams.wasDraw) {
                    int backgroundDrawableLeft2 = chatMessageCell2.getBackgroundDrawableLeft() + chatMessageCell2.getLeft();
                    int backgroundDrawableRight2 = chatMessageCell2.getBackgroundDrawableRight() + chatMessageCell2.getLeft();
                    int backgroundDrawableTop2 = chatMessageCell2.getBackgroundDrawableTop() + chatMessageCell2.getPaddingTop() + chatMessageCell2.getTop();
                    int backgroundDrawableBottom2 = chatMessageCell2.getBackgroundDrawableBottom() + chatMessageCell2.getPaddingTop() + chatMessageCell2.getTop();
                    moveInfoExtended.animateRemoveGroup = true;
                    transitionParams.animateBackgroundBoundsInner = true;
                    int i21 = backgroundDrawableLeft2 - transitionParams4.left;
                    moveInfoExtended.deltaLeft = i21;
                    moveInfoExtended.deltaRight = backgroundDrawableRight2 - transitionParams4.right;
                    moveInfoExtended.deltaTop = backgroundDrawableTop2 - transitionParams4.top;
                    moveInfoExtended.deltaBottom = backgroundDrawableBottom2 - transitionParams4.bottom;
                    moveInfoExtended.animateBackgroundOnly = false;
                    transitionParams.deltaLeft = (int) ((-i21) - chatMessageCell2.getAnimationOffsetX());
                    transitionParams.deltaRight = (int) ((-moveInfoExtended.deltaRight) - chatMessageCell2.getAnimationOffsetX());
                    transitionParams.deltaTop = (int) ((-moveInfoExtended.deltaTop) - chatMessageCell2.getTranslationY());
                    transitionParams.deltaBottom = (int) ((-moveInfoExtended.deltaBottom) - chatMessageCell2.getTranslationY());
                    z = true;
                    transitionParams.transformGroupToSingleMessage = true;
                    this.recyclerListView.setClipChildren(false);
                    this.recyclerListView.invalidate();
                } else {
                    z = true;
                    transitionParams4.drawBackgroundForDeletedItems = true;
                }
            } else {
                z = true;
            }
            if (transitionParams.drawPinnedBottomBackground != chatMessageCell2.isDrawPinnedBottom()) {
                moveInfoExtended.animatePinnedBottom = z;
                f5 = 0.0f;
                transitionParams.changePinnedBottomProgress = 0.0f;
            } else {
                f5 = 0.0f;
            }
            boolean zAnimateChange = transitionParams.animateChange();
            moveInfoExtended.animateChangeInternal = zAnimateChange;
            if (zAnimateChange) {
                transitionParams.animateChange = z;
                transitionParams.animateChangeProgress = f5;
            }
            if (i7 == 0 && i8 == 0 && !moveInfoExtended.animateImage && !moveInfoExtended.animateRemoveGroup && !moveInfoExtended.animateChangeGroupBackground && !moveInfoExtended.animatePinnedBottom && !moveInfoExtended.animateBackgroundOnly && !zAnimateChange) {
                dispatchMoveFinished(viewHolder);
                return false;
            }
        } else if (chatActionCell2 != null) {
            ChatActionCell.TransitionParams transitionParams5 = chatActionCell2.getTransitionParams();
            transitionParams5.getClass();
            if (i7 != 0) {
                view.setTranslationX(-i7);
            }
            boolean zAnimateChange2 = !transitionParams5.wasDraw ? false : ChatActionCell.this.reactionsLayoutInBubble.animateChange();
            moveInfoExtended.animateChangeInternal = zAnimateChange2;
            if (zAnimateChange2) {
                transitionParams5.animateChange = true;
                transitionParams5.animateChangeProgress = 0.0f;
            }
            if (i7 == 0 && i8 == 0 && !zAnimateChange2) {
                dispatchMoveFinished(viewHolder);
                return false;
            }
        } else {
            View view2 = viewHolder.itemView;
            if (view2 instanceof BotHelpCell) {
                ((BotHelpCell) view2).setAnimating(true);
            } else if (view2 instanceof UserInfoCell) {
                ((UserInfoCell) view2).setAnimating(true);
            } else {
                if (i7 == 0 && i8 == 0) {
                    dispatchMoveFinished(viewHolder);
                    return false;
                }
                if (i7 != 0) {
                    view.setTranslationX(-i7);
                }
            }
        }
        this.mPendingMoves.add(moveInfoExtended);
        checkIsRunning();
        return true;
    }

    @Override
    public void animateMoveImpl(RecyclerView.ViewHolder viewHolder, DefaultItemAnimator.MoveInfo moveInfo) {
        animateMoveImpl(viewHolder, moveInfo, false);
    }

    @Override
    public boolean animateRemove(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("animate remove");
        }
        boolean zAnimateRemove = super.animateRemove(viewHolder, itemHolderInfo);
        if (zAnimateRemove && itemHolderInfo != null) {
            int i = itemHolderInfo.top;
            int top = viewHolder.itemView.getTop();
            int left = viewHolder.itemView.getLeft() - itemHolderInfo.left;
            int i2 = top - i;
            if (i2 != 0) {
                viewHolder.itemView.setTranslationY(-i2);
            }
            View view = viewHolder.itemView;
            if (view instanceof ChatMessageCell) {
                ChatMessageCell chatMessageCell = (ChatMessageCell) view;
                if (left != 0) {
                    chatMessageCell.setAnimationOffsetX(-left);
                }
                if (itemHolderInfo instanceof ItemHolderInfoExtended) {
                    ItemHolderInfoExtended itemHolderInfoExtended = (ItemHolderInfoExtended) itemHolderInfo;
                    chatMessageCell.setImageCoords(itemHolderInfoExtended.imageX, itemHolderInfoExtended.imageY, itemHolderInfoExtended.imageWidth, itemHolderInfoExtended.imageHeight);
                    return zAnimateRemove;
                }
            } else if (left != 0) {
                view.setTranslationX(-left);
            }
        }
        return zAnimateRemove;
    }

    public final void animateRemoveGroupImpl(ArrayList arrayList) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("animate remove group impl with thanos");
        }
        this.mRemoveAnimations.addAll(arrayList);
        ThanosEffect thanosEffectRun = this.getThanosEffectContainer.run();
        for (int i = 0; i < arrayList.size(); i++) {
            dispatchRemoveStarting((RecyclerView.ViewHolder) arrayList.get(i));
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(((RecyclerView.ViewHolder) arrayList.get(i2)).itemView);
        }
        thanosEffectRun.animateGroup(arrayList2, new EglRenderer$$ExternalSyntheticLambda6(this, arrayList2, arrayList, 15));
        this.thanosViews.add(arrayList2.get(0));
        this.recyclerListView.stopScroll();
    }

    public void animateRemoveImpl(RecyclerView.ViewHolder viewHolder, boolean z) {
        Utilities.Callback0Return<ThanosEffect> callback0Return;
        int i = 1;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("animate remove impl ".concat(z ? " with thanos" : ""));
        }
        View view = viewHolder.itemView;
        this.mRemoveAnimations.add(viewHolder);
        if (!z || (callback0Return = this.getThanosEffectContainer) == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
            dispatchRemoveStarting(viewHolder);
            objectAnimatorOfFloat.setDuration(getRemoveDuration());
            objectAnimatorOfFloat.addListener(new AnonymousClass11(i, view, viewHolder, this));
            this.animators.put(viewHolder, objectAnimatorOfFloat);
            objectAnimatorOfFloat.start();
        } else {
            ThanosEffect thanosEffectRun = callback0Return.run();
            dispatchRemoveStarting(viewHolder);
            thanosEffectRun.animate(view, new EglRenderer$$ExternalSyntheticLambda6(this, view, viewHolder, 14));
            this.thanosViews.add(view);
        }
        this.recyclerListView.stopScroll();
    }

    public final void cancelAnimators() {
        ThanosEffect thanosEffectRun;
        ArrayList arrayList = new ArrayList(this.animators.values());
        this.animators.clear();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (animator != null) {
                animator.cancel();
            }
        }
        if (this.thanosViews.isEmpty() || (thanosEffectRun = this.getThanosEffectContainer.run()) == null) {
            return;
        }
        thanosEffectRun.kill();
    }

    @Override
    public void endAnimation(RecyclerView.ViewHolder viewHolder) {
        ThanosEffect thanosEffectRun;
        Animator animatorRemove = this.animators.remove(viewHolder);
        if (animatorRemove != null) {
            animatorRemove.cancel();
        }
        if (this.thanosViews.contains(viewHolder.itemView) && (thanosEffectRun = this.getThanosEffectContainer.run()) != null) {
            thanosEffectRun.cancel(viewHolder.itemView);
        }
        super.endAnimation(viewHolder);
        restoreTransitionParams(viewHolder.itemView);
    }

    @Override
    public void endAnimations() {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("end animations");
        }
        ArrayList<MessageObject.GroupedMessages> arrayList = this.willChangedGroups;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            MessageObject.GroupedMessages groupedMessages = arrayList.get(i);
            i++;
            groupedMessages.transitionParams.isNewGroup = false;
        }
        this.willChangedGroups.clear();
        cancelAnimators();
        ChatGreetingsView chatGreetingsView = this.chatGreetingsView;
        if (chatGreetingsView != null) {
            chatGreetingsView.stickerToSendView.setAlpha(1.0f);
        }
        this.greetingsSticker = null;
        this.chatGreetingsView = null;
        for (int size2 = this.mPendingMoves.size() - 1; size2 >= 0; size2--) {
            DefaultItemAnimator.MoveInfo moveInfo = this.mPendingMoves.get(size2);
            restoreTransitionParams(moveInfo.holder.itemView);
            dispatchMoveFinished(moveInfo.holder);
            this.mPendingMoves.remove(size2);
        }
        for (int size3 = this.mPendingRemovals.size() - 1; size3 >= 0; size3--) {
            RecyclerView.ViewHolder viewHolder = this.mPendingRemovals.get(size3);
            restoreTransitionParams(viewHolder.itemView);
            dispatchRemoveFinished(viewHolder);
            this.mPendingRemovals.remove(size3);
        }
        for (int size4 = this.mPendingAdditions.size() - 1; size4 >= 0; size4--) {
            RecyclerView.ViewHolder viewHolder2 = this.mPendingAdditions.get(size4);
            restoreTransitionParams(viewHolder2.itemView);
            dispatchAddFinished(viewHolder2);
            this.mPendingAdditions.remove(size4);
        }
        for (int size5 = this.mPendingChanges.size() - 1; size5 >= 0; size5--) {
            endChangeAnimationIfNecessary(this.mPendingChanges.get(size5));
        }
        this.mPendingChanges.clear();
        if (isRunning()) {
            for (int size6 = this.mMovesList.size() - 1; size6 >= 0; size6--) {
                ArrayList<DefaultItemAnimator.MoveInfo> arrayList2 = this.mMovesList.get(size6);
                for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                    DefaultItemAnimator.MoveInfo moveInfo2 = arrayList2.get(size7);
                    restoreTransitionParams(moveInfo2.holder.itemView);
                    dispatchMoveFinished(moveInfo2.holder);
                    arrayList2.remove(size7);
                    if (arrayList2.isEmpty()) {
                        this.mMovesList.remove(arrayList2);
                    }
                }
            }
            for (int size8 = this.mAdditionsList.size() - 1; size8 >= 0; size8--) {
                ArrayList<RecyclerView.ViewHolder> arrayList3 = this.mAdditionsList.get(size8);
                for (int size9 = arrayList3.size() - 1; size9 >= 0; size9--) {
                    RecyclerView.ViewHolder viewHolder3 = arrayList3.get(size9);
                    restoreTransitionParams(viewHolder3.itemView);
                    dispatchAddFinished(viewHolder3);
                    arrayList3.remove(size9);
                    if (arrayList3.isEmpty()) {
                        this.mAdditionsList.remove(arrayList3);
                    }
                }
            }
            for (int size10 = this.mChangesList.size() - 1; size10 >= 0; size10--) {
                ArrayList<DefaultItemAnimator.ChangeInfo> arrayList4 = this.mChangesList.get(size10);
                for (int size11 = arrayList4.size() - 1; size11 >= 0; size11--) {
                    endChangeAnimationIfNecessary(arrayList4.get(size11));
                    if (arrayList4.isEmpty()) {
                        this.mChangesList.remove(arrayList4);
                    }
                }
            }
            cancelAll(this.mRemoveAnimations);
            cancelAll(this.mMoveAnimations);
            cancelAll(this.mAddAnimations);
            cancelAll(this.mChangeAnimations);
            dispatchAnimationsFinished();
        }
    }

    @Override
    public boolean endChangeAnimationIfNecessary(DefaultItemAnimator.ChangeInfo changeInfo, RecyclerView.ViewHolder viewHolder) {
        ThanosEffect thanosEffectRun;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("end change if necessary");
        }
        Animator animatorRemove = this.animators.remove(viewHolder);
        if (animatorRemove != null) {
            animatorRemove.cancel();
        }
        if (this.thanosViews.contains(viewHolder.itemView) && (thanosEffectRun = this.getThanosEffectContainer.run()) != null) {
            thanosEffectRun.cancel(viewHolder.itemView);
        }
        boolean z = false;
        if (changeInfo.newHolder == viewHolder) {
            changeInfo.newHolder = null;
        } else {
            if (changeInfo.oldHolder != viewHolder) {
                return false;
            }
            changeInfo.oldHolder = null;
            z = true;
        }
        restoreTransitionParams(viewHolder.itemView);
        dispatchChangeFinished(viewHolder, z);
        return true;
    }

    @Override
    public long getChangeDuration() {
        return 250L;
    }

    @Override
    public long getMoveAnimationDelay() {
        return 0L;
    }

    @Override
    public long getMoveDuration() {
        return 250L;
    }

    public void groupWillChanged(MessageObject.GroupedMessages groupedMessages) {
        if (groupedMessages == null) {
            return;
        }
        if (groupedMessages.messages.size() == 0) {
            groupedMessages.transitionParams.drawBackgroundForDeletedItems = true;
            return;
        }
        MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
        if (transitionParams.top == 0 && transitionParams.bottom == 0 && transitionParams.left == 0 && transitionParams.right == 0) {
            int childCount = this.recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.recyclerListView.getChildAt(i);
                if (childAt instanceof ChatMessageCell) {
                    ChatMessageCell chatMessageCell = (ChatMessageCell) childAt;
                    MessageObject messageObject = chatMessageCell.getMessageObject();
                    if (chatMessageCell.getTransitionParams().wasDraw && groupedMessages.messages.contains(messageObject)) {
                        groupedMessages.transitionParams.top = chatMessageCell.getBackgroundDrawableTop() + chatMessageCell.getPaddingTop() + chatMessageCell.getTop();
                        groupedMessages.transitionParams.bottom = chatMessageCell.getBackgroundDrawableBottom() + chatMessageCell.getPaddingTop() + chatMessageCell.getTop();
                        groupedMessages.transitionParams.left = chatMessageCell.getBackgroundDrawableLeft() + chatMessageCell.getLeft();
                        groupedMessages.transitionParams.right = chatMessageCell.getBackgroundDrawableRight() + chatMessageCell.getLeft();
                        groupedMessages.transitionParams.drawCaptionLayout = chatMessageCell.hasCaptionLayout();
                        groupedMessages.transitionParams.pinnedTop = chatMessageCell.isPinnedTop();
                        groupedMessages.transitionParams.pinnedBotton = chatMessageCell.isPinnedBottom();
                        groupedMessages.transitionParams.isNewGroup = true;
                        break;
                    }
                }
            }
        }
        this.willChangedGroups.add(groupedMessages);
    }

    public void groupWillTransformToSingleMessage(MessageObject.GroupedMessages groupedMessages) {
        this.willRemovedGroup.put(Integer.valueOf(groupedMessages.messages.get(0).getId()), groupedMessages);
    }

    public final void lambda$animateRemoveGroupImpl$10(ArrayList arrayList, ArrayList arrayList2) {
        for (int i = 0; i < arrayList.size(); i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
        if (this.mRemoveAnimations.removeAll(arrayList2)) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                dispatchRemoveFinished((RecyclerView.ViewHolder) arrayList2.get(i2));
            }
            dispatchFinishedWhenDone();
        }
        this.thanosViews.removeAll(arrayList);
    }

    public final void lambda$animateRemoveImpl$9(View view, RecyclerView.ViewHolder viewHolder) {
        view.setVisibility(0);
        if (this.mRemoveAnimations.remove(viewHolder)) {
            dispatchRemoveFinished(viewHolder);
            dispatchFinishedWhenDone();
        }
        this.thanosViews.remove(view);
    }

    public final void lambda$runPendingAnimations$0(ValueAnimator valueAnimator) {
        ChatActivity chatActivity = this.activity;
        if (chatActivity != null) {
            chatActivity.onListItemAnimatorTick();
        } else {
            this.recyclerListView.invalidate();
        }
    }

    @Override
    public void onAllAnimationsDone() {
        super.onAllAnimationsDone();
        this.recyclerListView.setClipChildren(true);
        while (!this.runOnAnimationsEnd.isEmpty()) {
            this.runOnAnimationsEnd.remove(0).run();
        }
        cancelAnimators();
    }

    public abstract void onAnimationStart();

    public void onDestroy() {
        onAllAnimationsDone();
    }

    public void onGreetingStickerTransition(RecyclerView.ViewHolder viewHolder, ChatGreetingsView chatGreetingsView) {
        this.greetingsSticker = viewHolder;
        this.chatGreetingsView = chatGreetingsView;
        this.shouldAnimateEnterFromBottom = false;
    }

    public void prepareThanos(RecyclerView.ViewHolder viewHolder) {
        MessageObject messageObject;
        if (viewHolder == null) {
            return;
        }
        this.toBeSnapped.add(viewHolder);
        View view = viewHolder.itemView;
        if (!(view instanceof ChatMessageCell) || (messageObject = ((ChatMessageCell) view).getMessageObject()) == null) {
            return;
        }
        messageObject.deletedByThanos = true;
    }

    @Override
    public RecyclerView.ItemAnimator.ItemHolderInfo recordPreLayoutInformation(RecyclerView.State state, RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfoRecordPreLayoutInformation = super.recordPreLayoutInformation(state, viewHolder, i, list);
        View view = viewHolder.itemView;
        if (!(view instanceof ChatMessageCell)) {
            return itemHolderInfoRecordPreLayoutInformation;
        }
        ItemHolderInfoExtended itemHolderInfoExtended = new ItemHolderInfoExtended();
        itemHolderInfoExtended.left = itemHolderInfoRecordPreLayoutInformation.left;
        itemHolderInfoExtended.top = itemHolderInfoRecordPreLayoutInformation.top;
        ChatMessageCell.TransitionParams transitionParams = ((ChatMessageCell) view).getTransitionParams();
        itemHolderInfoExtended.imageX = transitionParams.lastDrawingImageX;
        itemHolderInfoExtended.imageY = transitionParams.lastDrawingImageY;
        itemHolderInfoExtended.imageWidth = transitionParams.lastDrawingImageW;
        itemHolderInfoExtended.imageHeight = transitionParams.lastDrawingImageH;
        return itemHolderInfoExtended;
    }

    public final void restoreTransitionParams(View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationY(0.0f);
        if (view instanceof BotHelpCell) {
            int measuredHeight = (this.recyclerListView.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((BotHelpCell) view).setAnimating(false);
            if (view.getTop() > measuredHeight) {
                view.setTranslationY(measuredHeight - view.getTop());
                return;
            } else {
                view.setTranslationY(0.0f);
                return;
            }
        }
        if (view instanceof UserInfoCell) {
            int measuredHeight2 = (this.recyclerListView.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
            ((UserInfoCell) view).setAnimating(false);
            if (view.getTop() > measuredHeight2) {
                view.setTranslationY(measuredHeight2 - view.getTop());
                return;
            } else {
                view.setTranslationY(0.0f);
                return;
            }
        }
        if (view instanceof ChatMessageCell) {
            ChatMessageCell chatMessageCell = (ChatMessageCell) view;
            chatMessageCell.getTransitionParams().resetAnimation();
            chatMessageCell.setAnimationOffsetX(0.0f);
        } else {
            if (!(view instanceof ChatActionCell)) {
                view.setTranslationX(0.0f);
                return;
            }
            ChatActionCell.TransitionParams transitionParams = ((ChatActionCell) view).getTransitionParams();
            transitionParams.animateChange = false;
            transitionParams.animateChangeProgress = 1.0f;
        }
    }

    public final void runAlphaEnterTransition() {
        boolean z;
        MessageObject.GroupedMessages currentMessagesGroup;
        MessageObject messageObject;
        Utilities.Callback0Return<Boolean> callback0Return;
        boolean zIsEmpty = this.mPendingRemovals.isEmpty();
        boolean zIsEmpty2 = this.mPendingMoves.isEmpty();
        boolean zIsEmpty3 = this.mPendingChanges.isEmpty();
        boolean zIsEmpty4 = this.mPendingAdditions.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        int i = 0;
        boolean z2 = (this.getThanosEffectContainer == null || (callback0Return = this.supportsThanosEffectContainer) == null || !callback0Return.run().booleanValue()) ? false : true;
        if (z2) {
            LongSparseArray longSparseArray = null;
            int i2 = 0;
            while (i2 < this.mPendingRemovals.size()) {
                RecyclerView.ViewHolder viewHolder = this.mPendingRemovals.get(i2);
                if (this.toBeSnapped.contains(viewHolder)) {
                    View view = viewHolder.itemView;
                    if ((view instanceof ChatMessageCell) && ((ChatMessageCell) view).getCurrentMessagesGroup() != null && (messageObject = ((ChatMessageCell) viewHolder.itemView).getMessageObject()) != null && messageObject.getGroupId() != 0) {
                        if (longSparseArray == null) {
                            longSparseArray = new LongSparseArray();
                        }
                        ArrayList arrayList = (ArrayList) longSparseArray.get(messageObject.getGroupId());
                        if (arrayList == null) {
                            long groupId = messageObject.getGroupId();
                            ArrayList arrayList2 = new ArrayList();
                            longSparseArray.put(groupId, arrayList2);
                            arrayList = arrayList2;
                        }
                        this.toBeSnapped.remove(viewHolder);
                        this.mPendingRemovals.remove(i2);
                        i2--;
                        arrayList.add(viewHolder);
                    }
                }
                i2++;
            }
            if (longSparseArray != null) {
                z = false;
                for (int i3 = 0; i3 < longSparseArray.size(); i3++) {
                    ArrayList arrayList3 = (ArrayList) longSparseArray.valueAt(i3);
                    if (arrayList3.size() > 0) {
                        View view2 = ((RecyclerView.ViewHolder) arrayList3.get(0)).itemView;
                        if (!(view2 instanceof ChatMessageCell) || (currentMessagesGroup = ((ChatMessageCell) view2).getCurrentMessagesGroup()) == null || currentMessagesGroup.messages.size() <= arrayList3.size()) {
                            animateRemoveGroupImpl(arrayList3);
                            z = true;
                        } else {
                            this.mPendingRemovals.addAll(arrayList3);
                        }
                    }
                }
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        ArrayList<RecyclerView.ViewHolder> arrayList4 = this.mPendingRemovals;
        int size = arrayList4.size();
        int i4 = 0;
        while (i4 < size) {
            RecyclerView.ViewHolder viewHolder2 = arrayList4.get(i4);
            i4++;
            RecyclerView.ViewHolder viewHolder3 = viewHolder2;
            boolean z3 = this.toBeSnapped.remove(viewHolder3) && z2;
            animateRemoveImpl(viewHolder3, z3);
            if (z3) {
                z = true;
            }
        }
        this.mPendingRemovals.clear();
        if (!zIsEmpty2) {
            ArrayList<DefaultItemAnimator.MoveInfo> arrayList5 = new ArrayList<>();
            arrayList5.addAll(this.mPendingMoves);
            this.mMovesList.add(arrayList5);
            this.mPendingMoves.clear();
            NanoHTTPD.ServerRunnable serverRunnable = new NanoHTTPD.ServerRunnable(this, arrayList5, z, 2);
            if (!this.delayAnimations || zIsEmpty) {
                serverRunnable.run();
            } else {
                View view3 = arrayList5.get(0).holder.itemView;
                long moveAnimationDelay = z ? 0L : getMoveAnimationDelay();
                WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                view3.postOnAnimationDelayed(serverRunnable, moveAnimationDelay);
            }
        }
        if (!zIsEmpty3) {
            ArrayList<DefaultItemAnimator.ChangeInfo> arrayList6 = new ArrayList<>();
            arrayList6.addAll(this.mPendingChanges);
            this.mChangesList.add(arrayList6);
            this.mPendingChanges.clear();
            zzb zzbVar = new zzb(9, this, arrayList6);
            if (!this.delayAnimations || zIsEmpty) {
                zzbVar.run();
            } else {
                View view4 = arrayList6.get(0).oldHolder.itemView;
                WeakHashMap weakHashMap2 = ViewCompat.sViewPropertyAnimatorMap;
                view4.postOnAnimationDelayed(zzbVar, 0L);
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(this.mPendingAdditions);
        this.mPendingAdditions.clear();
        this.alphaEnterDelay = 0L;
        Collections.sort(arrayList7, new CacheModel$$ExternalSyntheticLambda0(18));
        int size2 = arrayList7.size();
        while (i < size2) {
            Object obj = arrayList7.get(i);
            i++;
            animateAddImpl((RecyclerView.ViewHolder) obj);
        }
        arrayList7.clear();
    }

    public void runOnAnimationEnd(Runnable runnable) {
        this.runOnAnimationsEnd.add(runnable);
    }

    @Override
    public void runPendingAnimations() {
        boolean z;
        boolean zIsEmpty = this.mPendingRemovals.isEmpty();
        boolean zIsEmpty2 = this.mPendingMoves.isEmpty();
        boolean zIsEmpty3 = this.mPendingChanges.isEmpty();
        boolean zIsEmpty4 = this.mPendingAdditions.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        int i = 0;
        if (this.shouldAnimateEnterFromBottom) {
            z = false;
            for (int i2 = 0; i2 < this.mPendingAdditions.size(); i2++) {
                if (this.reversePositions) {
                    if (this.mPendingAdditions.get(i2).getLayoutPosition() == (this.recyclerListView.getAdapter() == null ? 0 : this.recyclerListView.getAdapter().getItemCount()) - 1) {
                        z = true;
                    }
                } else if (this.mPendingAdditions.get(i2).getLayoutPosition() == 0) {
                    z = true;
                }
            }
        } else {
            z = false;
        }
        onAnimationStart();
        if (z) {
            boolean zIsEmpty5 = this.mPendingRemovals.isEmpty();
            boolean zIsEmpty6 = this.mPendingMoves.isEmpty();
            boolean zIsEmpty7 = this.mPendingChanges.isEmpty();
            boolean zIsEmpty8 = this.mPendingAdditions.isEmpty();
            if (!zIsEmpty5 || !zIsEmpty6 || !zIsEmpty8 || !zIsEmpty7) {
                int height = 0;
                for (int i3 = 0; i3 < this.mPendingAdditions.size(); i3++) {
                    View view = this.mPendingAdditions.get(i3).itemView;
                    if (view instanceof ChatMessageCell) {
                        ChatMessageCell chatMessageCell = (ChatMessageCell) view;
                        if (chatMessageCell.getCurrentPosition() == null || (chatMessageCell.getCurrentPosition().flags & 1) != 0) {
                            height += this.mPendingAdditions.get(i3).itemView.getHeight();
                        }
                    } else {
                        height += this.mPendingAdditions.get(i3).itemView.getHeight();
                    }
                }
                ArrayList<RecyclerView.ViewHolder> arrayList = this.mPendingRemovals;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    RecyclerView.ViewHolder viewHolder = arrayList.get(i4);
                    i4++;
                    animateRemoveImpl(viewHolder);
                }
                this.mPendingRemovals.clear();
                if (!zIsEmpty6) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(this.mPendingMoves);
                    this.mPendingMoves.clear();
                    int size2 = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        Object obj = arrayList2.get(i5);
                        i5++;
                        DefaultItemAnimator.MoveInfo moveInfo = (DefaultItemAnimator.MoveInfo) obj;
                        animateMoveImpl(moveInfo.holder, moveInfo);
                    }
                    arrayList2.clear();
                }
                if (!zIsEmpty8) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.addAll(this.mPendingAdditions);
                    this.mPendingAdditions.clear();
                    int size3 = arrayList3.size();
                    while (i < size3) {
                        Object obj2 = arrayList3.get(i);
                        i++;
                        animateAddImpl((RecyclerView.ViewHolder) obj2, height);
                    }
                    arrayList3.clear();
                }
            }
        } else {
            runAlphaEnterTransition();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new RichMediaCell$$ExternalSyntheticLambda1(this, 17));
        valueAnimatorOfFloat.setDuration(getMoveDuration() + getRemoveDuration());
        valueAnimatorOfFloat.start();
    }

    public void setOnSnapMessage(Utilities.Callback0Return<Boolean> callback0Return, Utilities.Callback0Return<ThanosEffect> callback0Return2) {
        this.supportsThanosEffectContainer = callback0Return;
        this.getThanosEffectContainer = callback0Return2;
    }

    public void setReversePositions(boolean z) {
        this.reversePositions = z;
    }

    public void setShouldAnimateEnterFromBottom(boolean z) {
        this.shouldAnimateEnterFromBottom = z;
    }

    public boolean willAddedFromAlpha(View view) {
        RecyclerView.ViewHolder childViewHolder;
        if (this.shouldAnimateEnterFromBottom || (childViewHolder = this.recyclerListView.getChildViewHolder(view)) == null) {
            return false;
        }
        return this.mPendingAdditions.contains(childViewHolder) || this.mAddAnimations.contains(childViewHolder);
    }

    public boolean willRemoved(View view) {
        RecyclerView.ViewHolder childViewHolder = this.recyclerListView.getChildViewHolder(view);
        if (childViewHolder != null) {
            return this.mPendingRemovals.contains(childViewHolder) || this.mRemoveAnimations.contains(childViewHolder);
        }
        return false;
    }

    public void animateMoveImpl(final RecyclerView.ViewHolder viewHolder, DefaultItemAnimator.MoveInfo moveInfo, boolean z) {
        View view;
        ChatActionCell chatActionCell;
        ChatActionCell.TransitionParams transitionParams;
        final ChatMessageCell chatMessageCell;
        final ChatMessageCell.TransitionParams transitionParams2;
        final MoveInfoExtended moveInfoExtended;
        float f;
        boolean z2;
        MessageObject.GroupedMessages currentMessagesGroup;
        final int i;
        final float f2;
        final float f3;
        final boolean z3;
        final float f4;
        int iHasCaptionLayout;
        final float f5;
        final boolean z4;
        char c;
        int[] iArr;
        View view2;
        final int i2 = 0;
        final int i3 = 1;
        int i4 = moveInfo.fromX;
        final View view3 = viewHolder.itemView;
        final int i5 = moveInfo.toY - moveInfo.fromY;
        AnimatorSet animatorSet = new AnimatorSet();
        if (i5 != 0) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
        }
        this.mMoveAnimations.add(viewHolder);
        MoveInfoExtended moveInfoExtended2 = (MoveInfoExtended) moveInfo;
        ChatActivity chatActivity = this.activity;
        if (chatActivity != null) {
            View view4 = viewHolder.itemView;
            if (view4 instanceof BotHelpCell) {
                final BotHelpCell botHelpCell = (BotHelpCell) view4;
                final float translationY = botHelpCell.getTranslationY();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final ChatListItemAnimator this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i2) {
                            case 0:
                                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ChatListItemAnimator chatListItemAnimator = this.this$0;
                                float measuredHeight = ((chatListItemAnimator.recyclerListView.getMeasuredHeight() - chatListItemAnimator.activity.getChatListViewPadding()) - chatListItemAnimator.activity.blurredViewBottomOffset) / 2.0f;
                                BotHelpCell botHelpCell2 = (BotHelpCell) botHelpCell;
                                float chatListViewPadding = chatListItemAnimator.activity.getChatListViewPadding() + (measuredHeight - (botHelpCell2.getMeasuredHeight() / 2.0f));
                                botHelpCell2.setTranslationY(((((float) botHelpCell2.getTop()) > chatListViewPadding ? chatListViewPadding - botHelpCell2.getTop() : 0.0f) * fFloatValue) + ((1.0f - fFloatValue) * translationY));
                                break;
                            default:
                                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ChatListItemAnimator chatListItemAnimator2 = this.this$0;
                                float measuredHeight2 = ((chatListItemAnimator2.recyclerListView.getMeasuredHeight() - chatListItemAnimator2.activity.getChatListViewPadding()) - chatListItemAnimator2.activity.blurredViewBottomOffset) / 2.0f;
                                UserInfoCell userInfoCell = (UserInfoCell) botHelpCell;
                                float chatListViewPadding2 = chatListItemAnimator2.activity.getChatListViewPadding() + (measuredHeight2 - (userInfoCell.getMeasuredHeight() / 2.0f));
                                userInfoCell.setTranslationY(((((float) userInfoCell.getTop()) > chatListViewPadding2 ? chatListViewPadding2 - userInfoCell.getTop() : 0.0f) * fFloatValue2) + ((1.0f - fFloatValue2) * translationY));
                                break;
                        }
                    }
                });
                animatorSet.playTogether(valueAnimatorOfFloat);
            } else if (chatActivity != null) {
                view2 = viewHolder.itemView;
                if (view2 instanceof UserInfoCell) {
                    final UserInfoCell userInfoCell = (UserInfoCell) view2;
                    final float translationY2 = userInfoCell.getTranslationY();
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final ChatListItemAnimator this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i3) {
                                case 0:
                                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    ChatListItemAnimator chatListItemAnimator = this.this$0;
                                    float measuredHeight = ((chatListItemAnimator.recyclerListView.getMeasuredHeight() - chatListItemAnimator.activity.getChatListViewPadding()) - chatListItemAnimator.activity.blurredViewBottomOffset) / 2.0f;
                                    BotHelpCell botHelpCell2 = (BotHelpCell) userInfoCell;
                                    float chatListViewPadding = chatListItemAnimator.activity.getChatListViewPadding() + (measuredHeight - (botHelpCell2.getMeasuredHeight() / 2.0f));
                                    botHelpCell2.setTranslationY(((((float) botHelpCell2.getTop()) > chatListViewPadding ? chatListViewPadding - botHelpCell2.getTop() : 0.0f) * fFloatValue) + ((1.0f - fFloatValue) * translationY2));
                                    break;
                                default:
                                    float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    ChatListItemAnimator chatListItemAnimator2 = this.this$0;
                                    float measuredHeight2 = ((chatListItemAnimator2.recyclerListView.getMeasuredHeight() - chatListItemAnimator2.activity.getChatListViewPadding()) - chatListItemAnimator2.activity.blurredViewBottomOffset) / 2.0f;
                                    UserInfoCell userInfoCell2 = (UserInfoCell) userInfoCell;
                                    float chatListViewPadding2 = chatListItemAnimator2.activity.getChatListViewPadding() + (measuredHeight2 - (userInfoCell2.getMeasuredHeight() / 2.0f));
                                    userInfoCell2.setTranslationY(((((float) userInfoCell2.getTop()) > chatListViewPadding2 ? chatListViewPadding2 - userInfoCell2.getTop() : 0.0f) * fFloatValue2) + ((1.0f - fFloatValue2) * translationY2));
                                    break;
                            }
                        }
                    });
                    animatorSet.playTogether(valueAnimatorOfFloat2);
                } else {
                    view = viewHolder.itemView;
                    if (view instanceof ChatMessageCell) {
                        chatMessageCell = (ChatMessageCell) view;
                        transitionParams2 = chatMessageCell.getTransitionParams();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(chatMessageCell, chatMessageCell.ANIMATION_OFFSET_X, 0.0f));
                        if (moveInfoExtended2.animateImage) {
                            chatMessageCell.setImageCoords(moveInfoExtended2.imageX, moveInfoExtended2.imageY, moveInfoExtended2.imageWidth, moveInfoExtended2.imageHeight);
                            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            if (chatMessageCell.getCurrentMessagesGroup() == null) {
                                f4 = transitionParams2.captionEnterProgress;
                            } else {
                                f4 = chatMessageCell.getCurrentMessagesGroup().transitionParams.captionEnterProgress;
                            }
                            if (chatMessageCell.getCurrentMessagesGroup() == null) {
                                iHasCaptionLayout = chatMessageCell.hasCaptionLayout();
                            } else {
                                iHasCaptionLayout = chatMessageCell.getCurrentMessagesGroup().hasCaption;
                            }
                            f5 = iHasCaptionLayout;
                            if (f4 != f5) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (transitionParams2.animateRadius) {
                                iArr = new int[4];
                                c = 0;
                                while (i2 < 4) {
                                    iArr[i2] = chatMessageCell.getPhotoImage().getRoundRadius()[i2];
                                    i2++;
                                }
                            } else {
                                c = 0;
                                iArr = null;
                            }
                            moveInfoExtended = moveInfoExtended2;
                            final int[] iArr2 = iArr;
                            f = 0.0f;
                            valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    ChatListItemAnimator.lambda$animateMoveImpl$2(moveInfoExtended, transitionParams2, z4, f4, f5, chatMessageCell, iArr2, viewHolder, valueAnimator);
                                }
                            });
                            Animator[] animatorArr = new Animator[1];
                            animatorArr[c] = valueAnimatorOfFloat3;
                            animatorSet.playTogether(animatorArr);
                        } else {
                            moveInfoExtended = moveInfoExtended2;
                            f = 0.0f;
                        }
                        if (moveInfoExtended.deltaBottom != 0 && moveInfoExtended.deltaRight == 0 && moveInfoExtended.deltaTop == 0 && moveInfoExtended.deltaLeft == 0) {
                            transitionParams2.toDeltaLeft = f;
                            transitionParams2.toDeltaRight = f;
                            z2 = false;
                        } else {
                            this.recyclerListView.setClipChildren(false);
                            this.recyclerListView.invalidate();
                            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
                            if (moveInfoExtended.animateBackgroundOnly) {
                                transitionParams2.toDeltaLeft = -moveInfoExtended.deltaLeft;
                                transitionParams2.toDeltaRight = -moveInfoExtended.deltaRight;
                            } else {
                                transitionParams2.toDeltaLeft = (-moveInfoExtended.deltaLeft) - chatMessageCell.getAnimationOffsetX();
                                transitionParams2.toDeltaRight = (-moveInfoExtended.deltaRight) - chatMessageCell.getAnimationOffsetX();
                            }
                            valueAnimatorOfFloat4.addUpdateListener(new PeerStoriesView$40$$ExternalSyntheticLambda1(moveInfoExtended, transitionParams2, chatMessageCell, 2));
                            z2 = false;
                            animatorSet.playTogether(valueAnimatorOfFloat4);
                        }
                        currentMessagesGroup = chatMessageCell.getCurrentMessagesGroup();
                        if (currentMessagesGroup == null) {
                            moveInfoExtended.animateChangeGroupBackground = z2;
                        }
                        if (moveInfoExtended.animateChangeGroupBackground) {
                            ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(1.0f, 0.0f);
                            final MessageObject.GroupedMessages.TransitionParams transitionParams3 = currentMessagesGroup.transitionParams;
                            final RecyclerListView recyclerListView = (RecyclerListView) viewHolder.itemView.getParent();
                            f2 = currentMessagesGroup.transitionParams.captionEnterProgress;
                            if (currentMessagesGroup.hasCaption) {
                                f3 = 1.0f;
                            } else {
                                f3 = 0.0f;
                            }
                            if (f2 != f3) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            final MoveInfoExtended moveInfoExtended3 = moveInfoExtended;
                            valueAnimatorOfFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    ChatListItemAnimator.lambda$animateMoveImpl$4(transitionParams3, moveInfoExtended3, z3, f2, f3, recyclerListView, valueAnimator);
                                }
                            });
                            valueAnimatorOfFloat5.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public final void onAnimationEnd(Animator animator) {
                                    MessageObject.GroupedMessages.TransitionParams transitionParams4 = transitionParams3;
                                    transitionParams4.backgroundChangeBounds = false;
                                    transitionParams4.drawBackgroundForDeletedItems = false;
                                }
                            });
                            i = 0;
                            animatorSet.playTogether(valueAnimatorOfFloat5);
                        } else {
                            i = 0;
                        }
                        if (moveInfoExtended.animatePinnedBottom) {
                            ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            valueAnimatorOfFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i) {
                                        case 0:
                                            ChatListItemAnimator.lambda$animateMoveImpl$5(transitionParams2, chatMessageCell, valueAnimator);
                                            break;
                                        default:
                                            ChatListItemAnimator.lambda$animateMoveImpl$6(transitionParams2, chatMessageCell, valueAnimator);
                                            break;
                                    }
                                }
                            });
                            Animator[] animatorArr2 = new Animator[1];
                            animatorArr2[i] = valueAnimatorOfFloat6;
                            animatorSet.playTogether(animatorArr2);
                        }
                        if (moveInfoExtended.animateChangeInternal) {
                            ValueAnimator valueAnimatorOfFloat7 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            transitionParams2.animateChange = true;
                            valueAnimatorOfFloat7.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i3) {
                                        case 0:
                                            ChatListItemAnimator.lambda$animateMoveImpl$5(transitionParams2, chatMessageCell, valueAnimator);
                                            break;
                                        default:
                                            ChatListItemAnimator.lambda$animateMoveImpl$6(transitionParams2, chatMessageCell, valueAnimator);
                                            break;
                                    }
                                }
                            });
                            animatorSet.playTogether(valueAnimatorOfFloat7);
                        }
                    } else if (view instanceof ChatActionCell) {
                        chatActionCell = (ChatActionCell) view;
                        transitionParams = chatActionCell.getTransitionParams();
                        if (moveInfoExtended2.animateChangeInternal) {
                            ValueAnimator valueAnimatorOfFloat8 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            transitionParams.animateChange = true;
                            valueAnimatorOfFloat8.addUpdateListener(new SuperRipple$$ExternalSyntheticLambda7(16, transitionParams, chatActionCell));
                            animatorSet.playTogether(valueAnimatorOfFloat8);
                        }
                    }
                }
            } else {
                view = viewHolder.itemView;
                if (view instanceof ChatMessageCell) {
                    chatMessageCell = (ChatMessageCell) view;
                    transitionParams2 = chatMessageCell.getTransitionParams();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(chatMessageCell, chatMessageCell.ANIMATION_OFFSET_X, 0.0f));
                    if (moveInfoExtended2.animateImage) {
                        chatMessageCell.setImageCoords(moveInfoExtended2.imageX, moveInfoExtended2.imageY, moveInfoExtended2.imageWidth, moveInfoExtended2.imageHeight);
                        ValueAnimator valueAnimatorOfFloat9 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        if (chatMessageCell.getCurrentMessagesGroup() == null) {
                            f4 = transitionParams2.captionEnterProgress;
                        } else {
                            f4 = chatMessageCell.getCurrentMessagesGroup().transitionParams.captionEnterProgress;
                        }
                        if (chatMessageCell.getCurrentMessagesGroup() == null) {
                            iHasCaptionLayout = chatMessageCell.hasCaptionLayout();
                        } else {
                            iHasCaptionLayout = chatMessageCell.getCurrentMessagesGroup().hasCaption;
                        }
                        f5 = iHasCaptionLayout;
                        if (f4 != f5) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (transitionParams2.animateRadius) {
                            iArr = new int[4];
                            c = 0;
                            while (i2 < 4) {
                                iArr[i2] = chatMessageCell.getPhotoImage().getRoundRadius()[i2];
                                i2++;
                            }
                        } else {
                            c = 0;
                            iArr = null;
                        }
                        moveInfoExtended = moveInfoExtended2;
                        final int[] iArr3 = iArr;
                        f = 0.0f;
                        valueAnimatorOfFloat9.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ChatListItemAnimator.lambda$animateMoveImpl$2(moveInfoExtended, transitionParams2, z4, f4, f5, chatMessageCell, iArr3, viewHolder, valueAnimator);
                            }
                        });
                        Animator[] animatorArr3 = new Animator[1];
                        animatorArr3[c] = valueAnimatorOfFloat9;
                        animatorSet.playTogether(animatorArr3);
                    } else {
                        moveInfoExtended = moveInfoExtended2;
                        f = 0.0f;
                    }
                    if (moveInfoExtended.deltaBottom != 0) {
                        this.recyclerListView.setClipChildren(false);
                        this.recyclerListView.invalidate();
                        ValueAnimator valueAnimatorOfFloat10 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        if (moveInfoExtended.animateBackgroundOnly) {
                            transitionParams2.toDeltaLeft = -moveInfoExtended.deltaLeft;
                            transitionParams2.toDeltaRight = -moveInfoExtended.deltaRight;
                        } else {
                            transitionParams2.toDeltaLeft = (-moveInfoExtended.deltaLeft) - chatMessageCell.getAnimationOffsetX();
                            transitionParams2.toDeltaRight = (-moveInfoExtended.deltaRight) - chatMessageCell.getAnimationOffsetX();
                        }
                        valueAnimatorOfFloat10.addUpdateListener(new PeerStoriesView$40$$ExternalSyntheticLambda1(moveInfoExtended, transitionParams2, chatMessageCell, 2));
                        z2 = false;
                        animatorSet.playTogether(valueAnimatorOfFloat10);
                    } else {
                        this.recyclerListView.setClipChildren(false);
                        this.recyclerListView.invalidate();
                        ValueAnimator valueAnimatorOfFloat11 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        if (moveInfoExtended.animateBackgroundOnly) {
                            transitionParams2.toDeltaLeft = -moveInfoExtended.deltaLeft;
                            transitionParams2.toDeltaRight = -moveInfoExtended.deltaRight;
                        } else {
                            transitionParams2.toDeltaLeft = (-moveInfoExtended.deltaLeft) - chatMessageCell.getAnimationOffsetX();
                            transitionParams2.toDeltaRight = (-moveInfoExtended.deltaRight) - chatMessageCell.getAnimationOffsetX();
                        }
                        valueAnimatorOfFloat11.addUpdateListener(new PeerStoriesView$40$$ExternalSyntheticLambda1(moveInfoExtended, transitionParams2, chatMessageCell, 2));
                        z2 = false;
                        animatorSet.playTogether(valueAnimatorOfFloat11);
                    }
                    currentMessagesGroup = chatMessageCell.getCurrentMessagesGroup();
                    if (currentMessagesGroup == null) {
                        moveInfoExtended.animateChangeGroupBackground = z2;
                    }
                    if (moveInfoExtended.animateChangeGroupBackground) {
                        ValueAnimator valueAnimatorOfFloat12 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        final MessageObject.GroupedMessages.TransitionParams transitionParams4 = currentMessagesGroup.transitionParams;
                        final RecyclerListView recyclerListView2 = (RecyclerListView) viewHolder.itemView.getParent();
                        f2 = currentMessagesGroup.transitionParams.captionEnterProgress;
                        if (currentMessagesGroup.hasCaption) {
                            f3 = 1.0f;
                        } else {
                            f3 = 0.0f;
                        }
                        if (f2 != f3) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        final MoveInfoExtended moveInfoExtended4 = moveInfoExtended;
                        valueAnimatorOfFloat12.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ChatListItemAnimator.lambda$animateMoveImpl$4(transitionParams4, moveInfoExtended4, z3, f2, f3, recyclerListView2, valueAnimator);
                            }
                        });
                        valueAnimatorOfFloat12.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public final void onAnimationEnd(Animator animator) {
                                MessageObject.GroupedMessages.TransitionParams transitionParams5 = transitionParams4;
                                transitionParams5.backgroundChangeBounds = false;
                                transitionParams5.drawBackgroundForDeletedItems = false;
                            }
                        });
                        i = 0;
                        animatorSet.playTogether(valueAnimatorOfFloat12);
                    } else {
                        i = 0;
                    }
                    if (moveInfoExtended.animatePinnedBottom) {
                        ValueAnimator valueAnimatorOfFloat13 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat13.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i) {
                                    case 0:
                                        ChatListItemAnimator.lambda$animateMoveImpl$5(transitionParams2, chatMessageCell, valueAnimator);
                                        break;
                                    default:
                                        ChatListItemAnimator.lambda$animateMoveImpl$6(transitionParams2, chatMessageCell, valueAnimator);
                                        break;
                                }
                            }
                        });
                        Animator[] animatorArr4 = new Animator[1];
                        animatorArr4[i] = valueAnimatorOfFloat13;
                        animatorSet.playTogether(animatorArr4);
                    }
                    if (moveInfoExtended.animateChangeInternal) {
                        ValueAnimator valueAnimatorOfFloat14 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        transitionParams2.animateChange = true;
                        valueAnimatorOfFloat14.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i3) {
                                    case 0:
                                        ChatListItemAnimator.lambda$animateMoveImpl$5(transitionParams2, chatMessageCell, valueAnimator);
                                        break;
                                    default:
                                        ChatListItemAnimator.lambda$animateMoveImpl$6(transitionParams2, chatMessageCell, valueAnimator);
                                        break;
                                }
                            }
                        });
                        animatorSet.playTogether(valueAnimatorOfFloat14);
                    }
                } else if (view instanceof ChatActionCell) {
                    chatActionCell = (ChatActionCell) view;
                    transitionParams = chatActionCell.getTransitionParams();
                    if (moveInfoExtended2.animateChangeInternal) {
                        ValueAnimator valueAnimatorOfFloat15 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        transitionParams.animateChange = true;
                        valueAnimatorOfFloat15.addUpdateListener(new SuperRipple$$ExternalSyntheticLambda7(16, transitionParams, chatActionCell));
                        animatorSet.playTogether(valueAnimatorOfFloat15);
                    }
                }
            }
        } else if (chatActivity != null) {
            view2 = viewHolder.itemView;
            if (view2 instanceof UserInfoCell) {
                final View userInfoCell2 = (UserInfoCell) view2;
                final float translationY3 = userInfoCell2.getTranslationY();
                ValueAnimator valueAnimatorOfFloat16 = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat16.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final ChatListItemAnimator this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i3) {
                            case 0:
                                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ChatListItemAnimator chatListItemAnimator = this.this$0;
                                float measuredHeight = ((chatListItemAnimator.recyclerListView.getMeasuredHeight() - chatListItemAnimator.activity.getChatListViewPadding()) - chatListItemAnimator.activity.blurredViewBottomOffset) / 2.0f;
                                BotHelpCell botHelpCell2 = (BotHelpCell) userInfoCell2;
                                float chatListViewPadding = chatListItemAnimator.activity.getChatListViewPadding() + (measuredHeight - (botHelpCell2.getMeasuredHeight() / 2.0f));
                                botHelpCell2.setTranslationY(((((float) botHelpCell2.getTop()) > chatListViewPadding ? chatListViewPadding - botHelpCell2.getTop() : 0.0f) * fFloatValue) + ((1.0f - fFloatValue) * translationY3));
                                break;
                            default:
                                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                ChatListItemAnimator chatListItemAnimator2 = this.this$0;
                                float measuredHeight2 = ((chatListItemAnimator2.recyclerListView.getMeasuredHeight() - chatListItemAnimator2.activity.getChatListViewPadding()) - chatListItemAnimator2.activity.blurredViewBottomOffset) / 2.0f;
                                UserInfoCell userInfoCell3 = (UserInfoCell) userInfoCell2;
                                float chatListViewPadding2 = chatListItemAnimator2.activity.getChatListViewPadding() + (measuredHeight2 - (userInfoCell3.getMeasuredHeight() / 2.0f));
                                userInfoCell3.setTranslationY(((((float) userInfoCell3.getTop()) > chatListViewPadding2 ? chatListViewPadding2 - userInfoCell3.getTop() : 0.0f) * fFloatValue2) + ((1.0f - fFloatValue2) * translationY3));
                                break;
                        }
                    }
                });
                animatorSet.playTogether(valueAnimatorOfFloat16);
            } else {
                view = viewHolder.itemView;
                if (view instanceof ChatMessageCell) {
                    chatMessageCell = (ChatMessageCell) view;
                    transitionParams2 = chatMessageCell.getTransitionParams();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(chatMessageCell, chatMessageCell.ANIMATION_OFFSET_X, 0.0f));
                    if (moveInfoExtended2.animateImage) {
                        chatMessageCell.setImageCoords(moveInfoExtended2.imageX, moveInfoExtended2.imageY, moveInfoExtended2.imageWidth, moveInfoExtended2.imageHeight);
                        ValueAnimator valueAnimatorOfFloat17 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        if (chatMessageCell.getCurrentMessagesGroup() == null) {
                            f4 = transitionParams2.captionEnterProgress;
                        } else {
                            f4 = chatMessageCell.getCurrentMessagesGroup().transitionParams.captionEnterProgress;
                        }
                        if (chatMessageCell.getCurrentMessagesGroup() == null) {
                            iHasCaptionLayout = chatMessageCell.hasCaptionLayout();
                        } else {
                            iHasCaptionLayout = chatMessageCell.getCurrentMessagesGroup().hasCaption;
                        }
                        f5 = iHasCaptionLayout;
                        if (f4 != f5) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (transitionParams2.animateRadius) {
                            iArr = new int[4];
                            c = 0;
                            while (i2 < 4) {
                                iArr[i2] = chatMessageCell.getPhotoImage().getRoundRadius()[i2];
                                i2++;
                            }
                        } else {
                            c = 0;
                            iArr = null;
                        }
                        moveInfoExtended = moveInfoExtended2;
                        final int[] iArr4 = iArr;
                        f = 0.0f;
                        valueAnimatorOfFloat17.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ChatListItemAnimator.lambda$animateMoveImpl$2(moveInfoExtended, transitionParams2, z4, f4, f5, chatMessageCell, iArr4, viewHolder, valueAnimator);
                            }
                        });
                        Animator[] animatorArr5 = new Animator[1];
                        animatorArr5[c] = valueAnimatorOfFloat17;
                        animatorSet.playTogether(animatorArr5);
                    } else {
                        moveInfoExtended = moveInfoExtended2;
                        f = 0.0f;
                    }
                    if (moveInfoExtended.deltaBottom != 0) {
                        this.recyclerListView.setClipChildren(false);
                        this.recyclerListView.invalidate();
                        ValueAnimator valueAnimatorOfFloat18 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        if (moveInfoExtended.animateBackgroundOnly) {
                            transitionParams2.toDeltaLeft = -moveInfoExtended.deltaLeft;
                            transitionParams2.toDeltaRight = -moveInfoExtended.deltaRight;
                        } else {
                            transitionParams2.toDeltaLeft = (-moveInfoExtended.deltaLeft) - chatMessageCell.getAnimationOffsetX();
                            transitionParams2.toDeltaRight = (-moveInfoExtended.deltaRight) - chatMessageCell.getAnimationOffsetX();
                        }
                        valueAnimatorOfFloat18.addUpdateListener(new PeerStoriesView$40$$ExternalSyntheticLambda1(moveInfoExtended, transitionParams2, chatMessageCell, 2));
                        z2 = false;
                        animatorSet.playTogether(valueAnimatorOfFloat18);
                    } else {
                        this.recyclerListView.setClipChildren(false);
                        this.recyclerListView.invalidate();
                        ValueAnimator valueAnimatorOfFloat19 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        if (moveInfoExtended.animateBackgroundOnly) {
                            transitionParams2.toDeltaLeft = -moveInfoExtended.deltaLeft;
                            transitionParams2.toDeltaRight = -moveInfoExtended.deltaRight;
                        } else {
                            transitionParams2.toDeltaLeft = (-moveInfoExtended.deltaLeft) - chatMessageCell.getAnimationOffsetX();
                            transitionParams2.toDeltaRight = (-moveInfoExtended.deltaRight) - chatMessageCell.getAnimationOffsetX();
                        }
                        valueAnimatorOfFloat19.addUpdateListener(new PeerStoriesView$40$$ExternalSyntheticLambda1(moveInfoExtended, transitionParams2, chatMessageCell, 2));
                        z2 = false;
                        animatorSet.playTogether(valueAnimatorOfFloat19);
                    }
                    currentMessagesGroup = chatMessageCell.getCurrentMessagesGroup();
                    if (currentMessagesGroup == null) {
                        moveInfoExtended.animateChangeGroupBackground = z2;
                    }
                    if (moveInfoExtended.animateChangeGroupBackground) {
                        ValueAnimator valueAnimatorOfFloat110 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        final MessageObject.GroupedMessages.TransitionParams transitionParams5 = currentMessagesGroup.transitionParams;
                        final RecyclerListView recyclerListView3 = (RecyclerListView) viewHolder.itemView.getParent();
                        f2 = currentMessagesGroup.transitionParams.captionEnterProgress;
                        if (currentMessagesGroup.hasCaption) {
                            f3 = 1.0f;
                        } else {
                            f3 = 0.0f;
                        }
                        if (f2 != f3) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        final MoveInfoExtended moveInfoExtended5 = moveInfoExtended;
                        valueAnimatorOfFloat110.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ChatListItemAnimator.lambda$animateMoveImpl$4(transitionParams5, moveInfoExtended5, z3, f2, f3, recyclerListView3, valueAnimator);
                            }
                        });
                        valueAnimatorOfFloat110.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public final void onAnimationEnd(Animator animator) {
                                MessageObject.GroupedMessages.TransitionParams transitionParams6 = transitionParams5;
                                transitionParams6.backgroundChangeBounds = false;
                                transitionParams6.drawBackgroundForDeletedItems = false;
                            }
                        });
                        i = 0;
                        animatorSet.playTogether(valueAnimatorOfFloat110);
                    } else {
                        i = 0;
                    }
                    if (moveInfoExtended.animatePinnedBottom) {
                        ValueAnimator valueAnimatorOfFloat111 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat111.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i) {
                                    case 0:
                                        ChatListItemAnimator.lambda$animateMoveImpl$5(transitionParams2, chatMessageCell, valueAnimator);
                                        break;
                                    default:
                                        ChatListItemAnimator.lambda$animateMoveImpl$6(transitionParams2, chatMessageCell, valueAnimator);
                                        break;
                                }
                            }
                        });
                        Animator[] animatorArr6 = new Animator[1];
                        animatorArr6[i] = valueAnimatorOfFloat111;
                        animatorSet.playTogether(animatorArr6);
                    }
                    if (moveInfoExtended.animateChangeInternal) {
                        ValueAnimator valueAnimatorOfFloat112 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        transitionParams2.animateChange = true;
                        valueAnimatorOfFloat112.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i3) {
                                    case 0:
                                        ChatListItemAnimator.lambda$animateMoveImpl$5(transitionParams2, chatMessageCell, valueAnimator);
                                        break;
                                    default:
                                        ChatListItemAnimator.lambda$animateMoveImpl$6(transitionParams2, chatMessageCell, valueAnimator);
                                        break;
                                }
                            }
                        });
                        animatorSet.playTogether(valueAnimatorOfFloat112);
                    }
                } else if (view instanceof ChatActionCell) {
                    chatActionCell = (ChatActionCell) view;
                    transitionParams = chatActionCell.getTransitionParams();
                    if (moveInfoExtended2.animateChangeInternal) {
                        ValueAnimator valueAnimatorOfFloat113 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        transitionParams.animateChange = true;
                        valueAnimatorOfFloat113.addUpdateListener(new SuperRipple$$ExternalSyntheticLambda7(16, transitionParams, chatActionCell));
                        animatorSet.playTogether(valueAnimatorOfFloat113);
                    }
                }
            }
        } else {
            view = viewHolder.itemView;
            if (view instanceof ChatMessageCell) {
                chatMessageCell = (ChatMessageCell) view;
                transitionParams2 = chatMessageCell.getTransitionParams();
                animatorSet.playTogether(ObjectAnimator.ofFloat(chatMessageCell, chatMessageCell.ANIMATION_OFFSET_X, 0.0f));
                if (moveInfoExtended2.animateImage) {
                    chatMessageCell.setImageCoords(moveInfoExtended2.imageX, moveInfoExtended2.imageY, moveInfoExtended2.imageWidth, moveInfoExtended2.imageHeight);
                    ValueAnimator valueAnimatorOfFloat114 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    if (chatMessageCell.getCurrentMessagesGroup() == null) {
                        f4 = transitionParams2.captionEnterProgress;
                    } else {
                        f4 = chatMessageCell.getCurrentMessagesGroup().transitionParams.captionEnterProgress;
                    }
                    if (chatMessageCell.getCurrentMessagesGroup() == null) {
                        iHasCaptionLayout = chatMessageCell.hasCaptionLayout();
                    } else {
                        iHasCaptionLayout = chatMessageCell.getCurrentMessagesGroup().hasCaption;
                    }
                    f5 = iHasCaptionLayout;
                    if (f4 != f5) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (transitionParams2.animateRadius) {
                        iArr = new int[4];
                        c = 0;
                        while (i2 < 4) {
                            iArr[i2] = chatMessageCell.getPhotoImage().getRoundRadius()[i2];
                            i2++;
                        }
                    } else {
                        c = 0;
                        iArr = null;
                    }
                    moveInfoExtended = moveInfoExtended2;
                    final int[] iArr5 = iArr;
                    f = 0.0f;
                    valueAnimatorOfFloat114.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ChatListItemAnimator.lambda$animateMoveImpl$2(moveInfoExtended, transitionParams2, z4, f4, f5, chatMessageCell, iArr5, viewHolder, valueAnimator);
                        }
                    });
                    Animator[] animatorArr7 = new Animator[1];
                    animatorArr7[c] = valueAnimatorOfFloat114;
                    animatorSet.playTogether(animatorArr7);
                } else {
                    moveInfoExtended = moveInfoExtended2;
                    f = 0.0f;
                }
                if (moveInfoExtended.deltaBottom != 0) {
                    this.recyclerListView.setClipChildren(false);
                    this.recyclerListView.invalidate();
                    ValueAnimator valueAnimatorOfFloat115 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    if (moveInfoExtended.animateBackgroundOnly) {
                        transitionParams2.toDeltaLeft = -moveInfoExtended.deltaLeft;
                        transitionParams2.toDeltaRight = -moveInfoExtended.deltaRight;
                    } else {
                        transitionParams2.toDeltaLeft = (-moveInfoExtended.deltaLeft) - chatMessageCell.getAnimationOffsetX();
                        transitionParams2.toDeltaRight = (-moveInfoExtended.deltaRight) - chatMessageCell.getAnimationOffsetX();
                    }
                    valueAnimatorOfFloat115.addUpdateListener(new PeerStoriesView$40$$ExternalSyntheticLambda1(moveInfoExtended, transitionParams2, chatMessageCell, 2));
                    z2 = false;
                    animatorSet.playTogether(valueAnimatorOfFloat115);
                } else {
                    this.recyclerListView.setClipChildren(false);
                    this.recyclerListView.invalidate();
                    ValueAnimator valueAnimatorOfFloat116 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    if (moveInfoExtended.animateBackgroundOnly) {
                        transitionParams2.toDeltaLeft = -moveInfoExtended.deltaLeft;
                        transitionParams2.toDeltaRight = -moveInfoExtended.deltaRight;
                    } else {
                        transitionParams2.toDeltaLeft = (-moveInfoExtended.deltaLeft) - chatMessageCell.getAnimationOffsetX();
                        transitionParams2.toDeltaRight = (-moveInfoExtended.deltaRight) - chatMessageCell.getAnimationOffsetX();
                    }
                    valueAnimatorOfFloat116.addUpdateListener(new PeerStoriesView$40$$ExternalSyntheticLambda1(moveInfoExtended, transitionParams2, chatMessageCell, 2));
                    z2 = false;
                    animatorSet.playTogether(valueAnimatorOfFloat116);
                }
                currentMessagesGroup = chatMessageCell.getCurrentMessagesGroup();
                if (currentMessagesGroup == null) {
                    moveInfoExtended.animateChangeGroupBackground = z2;
                }
                if (moveInfoExtended.animateChangeGroupBackground) {
                    ValueAnimator valueAnimatorOfFloat117 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    final MessageObject.GroupedMessages.TransitionParams transitionParams6 = currentMessagesGroup.transitionParams;
                    final RecyclerListView recyclerListView4 = (RecyclerListView) viewHolder.itemView.getParent();
                    f2 = currentMessagesGroup.transitionParams.captionEnterProgress;
                    if (currentMessagesGroup.hasCaption) {
                        f3 = 1.0f;
                    } else {
                        f3 = 0.0f;
                    }
                    if (f2 != f3) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    final MoveInfoExtended moveInfoExtended6 = moveInfoExtended;
                    valueAnimatorOfFloat117.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ChatListItemAnimator.lambda$animateMoveImpl$4(transitionParams6, moveInfoExtended6, z3, f2, f3, recyclerListView4, valueAnimator);
                        }
                    });
                    valueAnimatorOfFloat117.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public final void onAnimationEnd(Animator animator) {
                            MessageObject.GroupedMessages.TransitionParams transitionParams7 = transitionParams6;
                            transitionParams7.backgroundChangeBounds = false;
                            transitionParams7.drawBackgroundForDeletedItems = false;
                        }
                    });
                    i = 0;
                    animatorSet.playTogether(valueAnimatorOfFloat117);
                } else {
                    i = 0;
                }
                if (moveInfoExtended.animatePinnedBottom) {
                    ValueAnimator valueAnimatorOfFloat118 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat118.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i) {
                                case 0:
                                    ChatListItemAnimator.lambda$animateMoveImpl$5(transitionParams2, chatMessageCell, valueAnimator);
                                    break;
                                default:
                                    ChatListItemAnimator.lambda$animateMoveImpl$6(transitionParams2, chatMessageCell, valueAnimator);
                                    break;
                            }
                        }
                    });
                    Animator[] animatorArr8 = new Animator[1];
                    animatorArr8[i] = valueAnimatorOfFloat118;
                    animatorSet.playTogether(animatorArr8);
                }
                if (moveInfoExtended.animateChangeInternal) {
                    ValueAnimator valueAnimatorOfFloat119 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    transitionParams2.animateChange = true;
                    valueAnimatorOfFloat119.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i3) {
                                case 0:
                                    ChatListItemAnimator.lambda$animateMoveImpl$5(transitionParams2, chatMessageCell, valueAnimator);
                                    break;
                                default:
                                    ChatListItemAnimator.lambda$animateMoveImpl$6(transitionParams2, chatMessageCell, valueAnimator);
                                    break;
                            }
                        }
                    });
                    animatorSet.playTogether(valueAnimatorOfFloat119);
                }
            } else if (view instanceof ChatActionCell) {
                chatActionCell = (ChatActionCell) view;
                transitionParams = chatActionCell.getTransitionParams();
                if (moveInfoExtended2.animateChangeInternal) {
                    ValueAnimator valueAnimatorOfFloat1110 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    transitionParams.animateChange = true;
                    valueAnimatorOfFloat1110.addUpdateListener(new SuperRipple$$ExternalSyntheticLambda7(16, transitionParams, chatActionCell));
                    animatorSet.playTogether(valueAnimatorOfFloat1110);
                }
            }
        }
        if (z) {
            animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        } else {
            Interpolator interpolator = this.translationInterpolator;
            if (interpolator != null) {
                animatorSet.setInterpolator(interpolator);
            }
        }
        animatorSet.setDuration((long) (getMoveDuration() * (z ? 1.9f : 1.0f)));
        animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public final void onAnimationCancel(Animator animator) {
                if (i5 != 0) {
                    view3.setTranslationY(0.0f);
                }
            }

            @Override
            public final void onAnimationEnd(Animator animator) {
                animator.removeAllListeners();
                RecyclerView.ViewHolder viewHolder2 = viewHolder;
                View view5 = viewHolder2.itemView;
                ChatListItemAnimator chatListItemAnimator = this;
                chatListItemAnimator.restoreTransitionParams(view5);
                View view6 = viewHolder2.itemView;
                if (view6 instanceof ChatMessageCell) {
                    ChatMessageCell chatMessageCell2 = (ChatMessageCell) view6;
                    if (chatMessageCell2.makeVisibleAfterChange) {
                        chatMessageCell2.makeVisibleAfterChange = false;
                        chatMessageCell2.setVisibility(0);
                    }
                    MessageObject.GroupedMessages currentMessagesGroup2 = chatMessageCell2.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 != null) {
                        currentMessagesGroup2.transitionParams.reset();
                    }
                }
                if (((DefaultItemAnimator) chatListItemAnimator).mMoveAnimations.remove(viewHolder2)) {
                    chatListItemAnimator.dispatchMoveFinished(viewHolder2);
                    chatListItemAnimator.dispatchFinishedWhenDone();
                }
            }

            @Override
            public final void onAnimationStart(Animator animator) {
                this.dispatchMoveStarting(viewHolder);
            }
        });
        animatorSet.start();
        this.animators.put(viewHolder, animatorSet);
    }

    @Override
    public void animateAddImpl(RecyclerView.ViewHolder viewHolder) {
        char c;
        boolean z;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("animate add impl");
        }
        View view = viewHolder.itemView;
        this.mAddAnimations.add(viewHolder);
        if (viewHolder == this.greetingsSticker) {
            view.setAlpha(1.0f);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        if (view instanceof ChatMessageCell) {
            ChatMessageCell chatMessageCell = (ChatMessageCell) view;
            if (chatMessageCell.getAnimationOffsetX() != 0.0f) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(chatMessageCell, chatMessageCell.ANIMATION_OFFSET_X, chatMessageCell.getAnimationOffsetX(), 0.0f));
            }
            chatMessageCell.setPivotX(((chatMessageCell.getBackgroundDrawableRight() - chatMessageCell.getBackgroundDrawableLeft()) / 2.0f) + chatMessageCell.getBackgroundDrawableLeft());
            view.animate().translationY(0.0f).setDuration(getAddDuration()).start();
        } else {
            view.animate().translationX(0.0f).translationY(0.0f).setDuration(getAddDuration()).start();
        }
        long jMax = (long) ((1.0f - Math.max(0.0f, Math.min(1.0f, view.getBottom() / this.recyclerListView.getMeasuredHeight()))) * 100.0f);
        if (view instanceof ChatMessageCell) {
            if (viewHolder == this.greetingsSticker) {
                ChatGreetingsView chatGreetingsView = this.chatGreetingsView;
                if (chatGreetingsView != null) {
                    chatGreetingsView.stickerToSendView.setAlpha(0.0f);
                }
                this.recyclerListView.setClipChildren(false);
                final ChatMessageCell chatMessageCell2 = (ChatMessageCell) view;
                View view2 = (View) this.chatGreetingsView.getParent();
                float x = view2.getX() + this.chatGreetingsView.getX() + this.chatGreetingsView.stickerToSendView.getX();
                float y = view2.getY() + this.chatGreetingsView.getY() + this.chatGreetingsView.stickerToSendView.getY();
                float x2 = chatMessageCell2.getX() + this.recyclerListView.getX() + chatMessageCell2.getPhotoImage().getImageX();
                float y2 = chatMessageCell2.getY() + this.recyclerListView.getY() + chatMessageCell2.getPhotoImage().getImageY();
                final float width = this.chatGreetingsView.stickerToSendView.getWidth();
                c = 0;
                final float height = this.chatGreetingsView.stickerToSendView.getHeight();
                final float imageWidth = chatMessageCell2.getPhotoImage().getImageWidth();
                final float imageHeight = chatMessageCell2.getPhotoImage().getImageHeight();
                final float f = x - x2;
                final float f2 = y - y2;
                final float imageX = chatMessageCell2.getPhotoImage().getImageX();
                final float imageY = chatMessageCell2.getPhotoImage().getImageY();
                chatMessageCell2.getTransitionParams().imageChangeBoundsTransition = true;
                chatMessageCell2.getTransitionParams().animateDrawingTimeAlpha = true;
                chatMessageCell2.getPhotoImage().setImageCoords(imageX + f, imageX + f2, width, height);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ChatListItemAnimator.lambda$animateAddImpl$8(chatMessageCell2, imageX, f, imageY, f2, width, imageWidth, height, imageHeight, valueAnimator);
                    }
                });
                valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public final void onAnimationEnd(Animator animator) {
                        ChatMessageCell chatMessageCell3 = chatMessageCell2;
                        chatMessageCell3.getTransitionParams().resetAnimation();
                        chatMessageCell3.getPhotoImage().setImageCoords(imageX, imageY, imageWidth, imageHeight);
                        ChatListItemAnimator chatListItemAnimator = ChatListItemAnimator.this;
                        if (chatListItemAnimator.chatGreetingsView != null) {
                            chatListItemAnimator.chatGreetingsView.stickerToSendView.setAlpha(1.0f);
                        }
                        chatMessageCell3.invalidate();
                    }
                });
                animatorSet.play(valueAnimatorOfFloat);
                jMax = jMax;
                z = false;
            } else {
                c = 0;
                MessageObject.GroupedMessages currentMessagesGroup = ((ChatMessageCell) view).getCurrentMessagesGroup();
                if (currentMessagesGroup == null) {
                    jMax = jMax;
                } else {
                    Long l = this.groupIdToEnterDelay.get(Long.valueOf(currentMessagesGroup.groupId));
                    if (l == null) {
                        this.groupIdToEnterDelay.put(Long.valueOf(currentMessagesGroup.groupId), Long.valueOf(jMax));
                        jMax = jMax;
                    } else {
                        jMax = l.longValue();
                    }
                }
                if (currentMessagesGroup != null && currentMessagesGroup.transitionParams.backgroundChangeBounds) {
                    animatorSet.setStartDelay(140L);
                }
            }
            view.setAlpha(0.0f);
            Property property = View.ALPHA;
            float[] fArr = new float[2];
            fArr[c] = view.getAlpha();
            fArr[1] = 1.0f;
            Animator[] animatorArr = new Animator[1];
            animatorArr[c] = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
            animatorSet.playTogether(animatorArr);
            if (z) {
                view.setScaleX(0.9f);
                view.setScaleY(0.9f);
                Property property2 = View.SCALE_Y;
                float[] fArr2 = new float[2];
                fArr2[c] = view.getScaleY();
                fArr2[1] = 1.0f;
                Animator[] animatorArr2 = new Animator[1];
                animatorArr2[c] = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
                animatorSet.playTogether(animatorArr2);
                Property property3 = View.SCALE_X;
                float[] fArr3 = new float[2];
                fArr3[c] = view.getScaleX();
                fArr3[1] = 1.0f;
                Animator[] animatorArr3 = new Animator[1];
                animatorArr3[c] = ObjectAnimator.ofFloat(view, (Property<View, Float>) property3, fArr3);
                animatorSet.playTogether(animatorArr3);
            } else {
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
            }
            if (viewHolder == this.greetingsSticker) {
                animatorSet.setDuration(350L);
                animatorSet.setInterpolator(new OvershootInterpolator());
            } else {
                animatorSet.setStartDelay(jMax);
                animatorSet.setDuration(250L);
            }
            animatorSet.addListener(new AnonymousClass11(0, view, viewHolder, this));
            this.animators.put(viewHolder, animatorSet);
            animatorSet.start();
        }
        c = 0;
        z = true;
        view.setAlpha(0.0f);
        Property property4 = View.ALPHA;
        float[] fArr4 = new float[2];
        fArr4[c] = view.getAlpha();
        fArr4[1] = 1.0f;
        Animator[] animatorArr4 = new Animator[1];
        animatorArr4[c] = ObjectAnimator.ofFloat(view, (Property<View, Float>) property4, fArr4);
        animatorSet.playTogether(animatorArr4);
        if (z) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
            Property property5 = View.SCALE_Y;
            float[] fArr5 = new float[2];
            fArr5[c] = view.getScaleY();
            fArr5[1] = 1.0f;
            Animator[] animatorArr5 = new Animator[1];
            animatorArr5[c] = ObjectAnimator.ofFloat(view, (Property<View, Float>) property5, fArr5);
            animatorSet.playTogether(animatorArr5);
            Property property6 = View.SCALE_X;
            float[] fArr6 = new float[2];
            fArr6[c] = view.getScaleX();
            fArr6[1] = 1.0f;
            Animator[] animatorArr6 = new Animator[1];
            animatorArr6[c] = ObjectAnimator.ofFloat(view, (Property<View, Float>) property6, fArr6);
            animatorSet.playTogether(animatorArr6);
        } else {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        if (viewHolder == this.greetingsSticker) {
            animatorSet.setDuration(350L);
            animatorSet.setInterpolator(new OvershootInterpolator());
        } else {
            animatorSet.setStartDelay(jMax);
            animatorSet.setDuration(250L);
        }
        animatorSet.addListener(new AnonymousClass11(0, view, viewHolder, this));
        this.animators.put(viewHolder, animatorSet);
        animatorSet.start();
    }
}
