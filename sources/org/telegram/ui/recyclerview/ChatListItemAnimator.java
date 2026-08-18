package org.telegram.ui.recyclerview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
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
import org.telegram.ui.TextMessageEnterTransition;
import org.telegram.ui.VoiceMessageEnterTransition;

public abstract class ChatListItemAnimator extends DefaultItemAnimator {
    public static final Interpolator DEFAULT_INTERPOLATOR = new CubicBezierInterpolator(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    private final ChatActivity activity;
    long alphaEnterDelay;
    private ChatGreetingsView chatGreetingsView;
    private Utilities.Callback0Return getThanosEffectContainer;
    private RecyclerView.ViewHolder greetingsSticker;
    private final RecyclerListView recyclerListView;
    private final Theme.ResourcesProvider resourcesProvider;
    private boolean reversePositions;
    private boolean shouldAnimateEnterFromBottom;
    private Utilities.Callback0Return supportsThanosEffectContainer;
    private HashMap willRemovedGroup = new HashMap();
    private ArrayList willChangedGroups = new ArrayList();
    HashMap animators = new HashMap();
    ArrayList thanosViews = new ArrayList();
    ArrayList runOnAnimationsEnd = new ArrayList();
    HashMap groupIdToEnterDelay = new HashMap();
    private final ArrayList toBeSnapped = new ArrayList();

    @Override
    public long getChangeDuration() {
        return 250L;
    }

    @Override
    protected long getMoveAnimationDelay() {
        return 0L;
    }

    @Override
    public long getMoveDuration() {
        return 250L;
    }

    public void onAnimationStart() {
    }

    public ChatListItemAnimator(ChatActivity chatActivity, RecyclerListView recyclerListView, Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
        this.activity = chatActivity;
        this.recyclerListView = recyclerListView;
        this.translationInterpolator = DEFAULT_INTERPOLATOR;
        this.alwaysCreateMoveAnimationIfPossible = true;
        setSupportsChangeAnimations(false);
    }

    @Override
    public void runPendingAnimations() {
        boolean zIsEmpty = this.mPendingRemovals.isEmpty();
        boolean zIsEmpty2 = this.mPendingMoves.isEmpty();
        boolean zIsEmpty3 = this.mPendingChanges.isEmpty();
        boolean zIsEmpty4 = this.mPendingAdditions.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        boolean z = false;
        if (this.shouldAnimateEnterFromBottom) {
            boolean z2 = false;
            for (int i = 0; i < this.mPendingAdditions.size(); i++) {
                if (this.reversePositions) {
                    if (((RecyclerView.ViewHolder) this.mPendingAdditions.get(i)).getLayoutPosition() == (this.recyclerListView.getAdapter() == null ? 0 : this.recyclerListView.getAdapter().getItemCount()) - 1) {
                        z2 = true;
                    }
                } else if (((RecyclerView.ViewHolder) this.mPendingAdditions.get(i)).getLayoutPosition() == 0) {
                    z2 = true;
                }
            }
            z = z2;
        }
        onAnimationStart();
        if (z) {
            runMessageEnterTransition();
        } else {
            runAlphaEnterTransition();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$runPendingAnimations$0(valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(getRemoveDuration() + getMoveDuration());
        valueAnimatorOfFloat.start();
    }

    public void lambda$runPendingAnimations$0(ValueAnimator valueAnimator) {
        ChatActivity chatActivity = this.activity;
        if (chatActivity != null) {
            chatActivity.onListItemAnimatorTick();
        } else {
            this.recyclerListView.invalidate();
        }
    }

    private void runAlphaEnterTransition() {
        final boolean z;
        MessageObject.GroupedMessages currentMessagesGroup;
        MessageObject messageObject;
        Utilities.Callback0Return callback0Return;
        boolean zIsEmpty = this.mPendingRemovals.isEmpty();
        boolean zIsEmpty2 = this.mPendingMoves.isEmpty();
        boolean zIsEmpty3 = this.mPendingChanges.isEmpty();
        boolean zIsEmpty4 = this.mPendingAdditions.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        boolean z2 = (this.getThanosEffectContainer == null || (callback0Return = this.supportsThanosEffectContainer) == null || !((Boolean) callback0Return.run()).booleanValue()) ? false : true;
        if (z2) {
            LongSparseArray longSparseArray = null;
            int i = 0;
            while (i < this.mPendingRemovals.size()) {
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) this.mPendingRemovals.get(i);
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
                        this.mPendingRemovals.remove(i);
                        i--;
                        arrayList.add(viewHolder);
                    }
                }
                i++;
            }
            if (longSparseArray != null) {
                z = false;
                for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                    ArrayList arrayList3 = (ArrayList) longSparseArray.valueAt(i2);
                    if (arrayList3.size() > 0) {
                        View view2 = ((RecyclerView.ViewHolder) arrayList3.get(0)).itemView;
                        if ((view2 instanceof ChatMessageCell) && (currentMessagesGroup = ((ChatMessageCell) view2).getCurrentMessagesGroup()) != null && currentMessagesGroup.messages.size() > arrayList3.size()) {
                            this.mPendingRemovals.addAll(arrayList3);
                        } else {
                            animateRemoveGroupImpl(arrayList3);
                            z = true;
                        }
                    }
                }
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        for (RecyclerView.ViewHolder viewHolder2 : this.mPendingRemovals) {
            boolean z3 = this.toBeSnapped.remove(viewHolder2) && z2;
            animateRemoveImpl(viewHolder2, z3);
            if (z3) {
                z = true;
            }
        }
        this.mPendingRemovals.clear();
        if (!zIsEmpty2) {
            final ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll(this.mPendingMoves);
            this.mMovesList.add(arrayList4);
            this.mPendingMoves.clear();
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    for (DefaultItemAnimator.MoveInfo moveInfo : arrayList4) {
                        ChatListItemAnimator.this.animateMoveImpl(moveInfo.holder, moveInfo, z);
                    }
                    arrayList4.clear();
                    ((DefaultItemAnimator) ChatListItemAnimator.this).mMovesList.remove(arrayList4);
                }
            };
            if (this.delayAnimations && !zIsEmpty) {
                ViewCompat.postOnAnimationDelayed(((DefaultItemAnimator.MoveInfo) arrayList4.get(0)).holder.itemView, runnable, z ? 0L : getMoveAnimationDelay());
            } else {
                runnable.run();
            }
        }
        if (!zIsEmpty3) {
            final ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(this.mPendingChanges);
            this.mChangesList.add(arrayList5);
            this.mPendingChanges.clear();
            Runnable runnable2 = new Runnable() {
                @Override
                public void run() {
                    Iterator it = arrayList5.iterator();
                    while (it.hasNext()) {
                        ChatListItemAnimator.this.animateChangeImpl((DefaultItemAnimator.ChangeInfo) it.next());
                    }
                    arrayList5.clear();
                    ((DefaultItemAnimator) ChatListItemAnimator.this).mChangesList.remove(arrayList5);
                }
            };
            if (this.delayAnimations && !zIsEmpty) {
                ViewCompat.postOnAnimationDelayed(((DefaultItemAnimator.ChangeInfo) arrayList5.get(0)).oldHolder.itemView, runnable2, 0L);
            } else {
                runnable2.run();
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList6 = new ArrayList();
        arrayList6.addAll(this.mPendingAdditions);
        this.mPendingAdditions.clear();
        this.alphaEnterDelay = 0L;
        Collections.sort(arrayList6, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return ChatListItemAnimator.lambda$runAlphaEnterTransition$1((RecyclerView.ViewHolder) obj, (RecyclerView.ViewHolder) obj2);
            }
        });
        Iterator it = arrayList6.iterator();
        while (it.hasNext()) {
            animateAddImpl((RecyclerView.ViewHolder) it.next());
        }
        arrayList6.clear();
    }

    public static int lambda$runAlphaEnterTransition$1(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        return viewHolder2.itemView.getTop() - viewHolder.itemView.getTop();
    }

    private void runMessageEnterTransition() {
        boolean zIsEmpty = this.mPendingRemovals.isEmpty();
        boolean zIsEmpty2 = this.mPendingMoves.isEmpty();
        boolean zIsEmpty3 = this.mPendingChanges.isEmpty();
        boolean zIsEmpty4 = this.mPendingAdditions.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        int height = 0;
        for (int i = 0; i < this.mPendingAdditions.size(); i++) {
            View view = ((RecyclerView.ViewHolder) this.mPendingAdditions.get(i)).itemView;
            if (view instanceof ChatMessageCell) {
                ChatMessageCell chatMessageCell = (ChatMessageCell) view;
                if (chatMessageCell.getCurrentPosition() == null || (chatMessageCell.getCurrentPosition().flags & 1) != 0) {
                    height += ((RecyclerView.ViewHolder) this.mPendingAdditions.get(i)).itemView.getHeight();
                }
            } else {
                height += ((RecyclerView.ViewHolder) this.mPendingAdditions.get(i)).itemView.getHeight();
            }
        }
        Iterator it = this.mPendingRemovals.iterator();
        while (it.hasNext()) {
            animateRemoveImpl((RecyclerView.ViewHolder) it.next());
        }
        this.mPendingRemovals.clear();
        if (!zIsEmpty2) {
            ArrayList<DefaultItemAnimator.MoveInfo> arrayList = new ArrayList();
            arrayList.addAll(this.mPendingMoves);
            this.mPendingMoves.clear();
            for (DefaultItemAnimator.MoveInfo moveInfo : arrayList) {
                animateMoveImpl(moveInfo.holder, moveInfo);
            }
            arrayList.clear();
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(this.mPendingAdditions);
        this.mPendingAdditions.clear();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            animateAddImpl((RecyclerView.ViewHolder) it2.next(), height);
        }
        arrayList2.clear();
    }

    @Override
    public boolean animateAppearance(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2) {
        int height;
        boolean zAnimateAppearance = super.animateAppearance(viewHolder, itemHolderInfo, itemHolderInfo2);
        if (zAnimateAppearance && this.shouldAnimateEnterFromBottom) {
            boolean z = false;
            for (int i = 0; i < this.mPendingAdditions.size(); i++) {
                if (((RecyclerView.ViewHolder) this.mPendingAdditions.get(i)).getLayoutPosition() == 0) {
                    z = true;
                }
            }
            if (z) {
                height = 0;
                for (int i2 = 0; i2 < this.mPendingAdditions.size(); i2++) {
                    height += ((RecyclerView.ViewHolder) this.mPendingAdditions.get(i2)).itemView.getHeight();
                }
            } else {
                height = 0;
            }
            for (int i3 = 0; i3 < this.mPendingAdditions.size(); i3++) {
                ((RecyclerView.ViewHolder) this.mPendingAdditions.get(i3)).itemView.setTranslationY(height);
            }
        }
        return zAnimateAppearance;
    }

    @Override
    public boolean animateAdd(RecyclerView.ViewHolder viewHolder) {
        resetAnimation(viewHolder);
        viewHolder.itemView.setAlpha(0.0f);
        if (!this.shouldAnimateEnterFromBottom) {
            viewHolder.itemView.setScaleX(0.9f);
            viewHolder.itemView.setScaleY(0.9f);
        } else {
            View view = viewHolder.itemView;
            if (view instanceof ChatMessageCell) {
                ((ChatMessageCell) view).getTransitionParams().messageEntering = true;
            }
        }
        this.mPendingAdditions.add(viewHolder);
        return true;
    }

    public void animateAddImpl(final RecyclerView.ViewHolder viewHolder, int i) {
        final View view = viewHolder.itemView;
        final ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
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
        viewPropertyAnimatorAnimate.translationY(0.0f).setDuration(getMoveDuration()).setInterpolator(this.translationInterpolator).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationStart(Animator animator) {
                ChatListItemAnimator.this.dispatchAddStarting(viewHolder);
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                view.setTranslationY(0.0f);
                View view3 = view;
                if (view3 instanceof ChatMessageCell) {
                    ((ChatMessageCell) view3).getTransitionParams().messageEntering = false;
                }
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                View view3 = view;
                if (view3 instanceof ChatMessageCell) {
                    ((ChatMessageCell) view3).getTransitionParams().messageEntering = false;
                }
                viewPropertyAnimatorAnimate.setListener(null);
                if (((DefaultItemAnimator) ChatListItemAnimator.this).mAddAnimations.remove(viewHolder)) {
                    ChatListItemAnimator.this.dispatchAddFinished(viewHolder);
                    ChatListItemAnimator.this.dispatchFinishedWhenDone();
                }
            }
        }).start();
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
                }
            } else if (left != 0) {
                view.setTranslationX(-left);
            }
        }
        return zAnimateRemove;
    }

    @Override
    public boolean animateMove(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, int i, int i2, int i3, int i4) {
        int topMediaOffset;
        int translationX;
        ChatMessageCell chatMessageCell;
        ChatActionCell chatActionCell;
        int translationX2;
        int[] iArr;
        float f;
        float imageWidth;
        float f2;
        float f3;
        int i5;
        MoveInfoExtended moveInfoExtended;
        ChatActionCell chatActionCell2;
        int i6;
        float f4;
        float f5;
        float f6;
        float f7;
        View view;
        ChatActionCell.TransitionParams transitionParams;
        boolean zAnimateChange;
        ChatMessageCell.TransitionParams transitionParams2;
        MessageObject.GroupedMessages currentMessagesGroup;
        int i7;
        int i8;
        MessageObject.GroupedMessages groupedMessages;
        boolean z;
        float f8;
        boolean zAnimateChange2;
        MessageObject.GroupedMessages.TransitionParams transitionParams3;
        MessageObject.GroupedMessages groupedMessages2;
        int i9;
        int i10;
        ImageReceiver photoImage;
        ItemHolderInfoExtended itemHolderInfoExtended;
        boolean z2;
        boolean zIsOutOwner;
        boolean z3;
        int i11;
        float f9;
        float f10;
        int i12;
        boolean z4;
        MessageObject.GroupedMessages.TransitionParams transitionParams4;
        boolean z5;
        float f11;
        int i13;
        View view2 = viewHolder.itemView;
        if (view2 instanceof ChatMessageCell) {
            ChatMessageCell chatMessageCell2 = (ChatMessageCell) view2;
            translationX2 = i + ((int) chatMessageCell2.getAnimationOffsetX());
            topMediaOffset = chatMessageCell2.getTransitionParams().lastTopOffset != chatMessageCell2.getTopMediaOffset() ? i2 + (chatMessageCell2.getTransitionParams().lastTopOffset - chatMessageCell2.getTopMediaOffset()) : i2;
            chatMessageCell = chatMessageCell2;
            chatActionCell = null;
        } else {
            if (view2 instanceof ChatActionCell) {
                translationX2 = i + ((int) view2.getTranslationX());
                topMediaOffset = i2;
                chatActionCell = (ChatActionCell) view2;
                chatMessageCell = null;
            } else {
                topMediaOffset = i2;
                translationX = i + ((int) view2.getTranslationX());
                chatMessageCell = null;
                chatActionCell = null;
            }
            int translationY = topMediaOffset + ((int) viewHolder.itemView.getTranslationY());
            iArr = new int[4];
            if (chatMessageCell != null) {
                float imageX = chatMessageCell.getPhotoImage().getImageX();
                float imageY = chatMessageCell.getPhotoImage().getImageY();
                imageWidth = chatMessageCell.getPhotoImage().getImageWidth();
                float imageHeight = chatMessageCell.getPhotoImage().getImageHeight();
                for (i13 = 0; i13 < 4; i13++) {
                    iArr[i13] = chatMessageCell.getPhotoImage().getRoundRadius()[i13];
                }
                f3 = imageX;
                f2 = imageY;
                f = imageHeight;
            } else {
                f = 0.0f;
                imageWidth = 0.0f;
                f2 = 0.0f;
                f3 = 0.0f;
            }
            resetAnimation(viewHolder);
            int i14 = i3 - translationX;
            i5 = i4 - translationY;
            if (i5 != 0) {
                view2.setTranslationY(-i5);
            }
            chatActionCell2 = chatActionCell;
            i6 = i14;
            f4 = f;
            f5 = imageWidth;
            f6 = f2;
            f7 = f3;
            moveInfoExtended = new MoveInfoExtended(viewHolder, translationX, translationY, i3, i4);
            if (chatMessageCell != null) {
                transitionParams2 = chatMessageCell.getTransitionParams();
                if (!transitionParams2.supportChangeAnimation()) {
                    if (i6 != 0 && i5 == 0) {
                        dispatchMoveFinished(viewHolder);
                        return false;
                    }
                    if (i6 != 0) {
                        view2.setTranslationX(-i6);
                    }
                    this.mPendingMoves.add(moveInfoExtended);
                    checkIsRunning();
                    return true;
                }
                currentMessagesGroup = chatMessageCell.getCurrentMessagesGroup();
                if (i6 != 0) {
                    chatMessageCell.setAnimationOffsetX(-i6);
                }
                if (itemHolderInfo instanceof ItemHolderInfoExtended) {
                    photoImage = chatMessageCell.getPhotoImage();
                    itemHolderInfoExtended = (ItemHolderInfoExtended) itemHolderInfo;
                    if (transitionParams2.wasDraw || itemHolderInfoExtended.imageHeight == 0.0f || itemHolderInfoExtended.imageWidth == 0.0f) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    moveInfoExtended.animateImage = z2;
                    if (z2) {
                        this.recyclerListView.setClipChildren(false);
                        this.recyclerListView.invalidate();
                        transitionParams2.imageChangeBoundsTransition = true;
                        if (chatMessageCell.getMessageObject().isRoundVideo()) {
                            transitionParams2.animateToImageX = f7;
                            transitionParams2.animateToImageY = f6;
                            transitionParams2.animateToImageW = f5;
                            transitionParams2.animateToImageH = f4;
                            transitionParams2.animateToRadius = iArr;
                        } else {
                            transitionParams2.animateToImageX = photoImage.getImageX();
                            transitionParams2.animateToImageY = photoImage.getImageY();
                            transitionParams2.animateToImageW = photoImage.getImageWidth();
                            transitionParams2.animateToImageH = photoImage.getImageHeight();
                            transitionParams2.animateToRadius = photoImage.getRoundRadius();
                        }
                        transitionParams2.animateRadius = false;
                        for (i11 = 0; i11 < 4; i11++) {
                            if (transitionParams2.imageRoundRadius[i11] != transitionParams2.animateToRadius[i11]) {
                                transitionParams2.animateRadius = true;
                                break;
                            }
                        }
                        f9 = transitionParams2.animateToImageX;
                        f10 = itemHolderInfoExtended.imageX;
                        if (f9 != f10 && transitionParams2.animateToImageY == itemHolderInfoExtended.imageY && transitionParams2.animateToImageH == itemHolderInfoExtended.imageHeight && transitionParams2.animateToImageW == itemHolderInfoExtended.imageWidth && !transitionParams2.animateRadius) {
                            transitionParams2.imageChangeBoundsTransition = false;
                            moveInfoExtended.animateImage = false;
                        } else {
                            moveInfoExtended.imageX = f10;
                            moveInfoExtended.imageY = itemHolderInfoExtended.imageY;
                            moveInfoExtended.imageWidth = itemHolderInfoExtended.imageWidth;
                            moveInfoExtended.imageHeight = itemHolderInfoExtended.imageHeight;
                            if (currentMessagesGroup != null) {
                                z4 = currentMessagesGroup.hasCaption;
                                transitionParams4 = currentMessagesGroup.transitionParams;
                                z5 = transitionParams4.drawCaptionLayout;
                                if (z4 != z5) {
                                    if (z5) {
                                        f11 = 1.0f;
                                    } else {
                                        f11 = 0.0f;
                                    }
                                    transitionParams4.captionEnterProgress = f11;
                                }
                            }
                            if (transitionParams2.animateRadius) {
                                if (transitionParams2.animateToRadius == photoImage.getRoundRadius()) {
                                    transitionParams2.animateToRadius = new int[4];
                                    for (i12 = 0; i12 < 4; i12++) {
                                        transitionParams2.animateToRadius[i12] = photoImage.getRoundRadius()[i12];
                                    }
                                }
                                photoImage.setRoundRadius(transitionParams2.imageRoundRadius);
                            }
                            chatMessageCell.setImageCoords(moveInfoExtended.imageX, moveInfoExtended.imageY, moveInfoExtended.imageWidth, moveInfoExtended.imageHeight);
                        }
                    }
                    if (currentMessagesGroup == null && transitionParams2.wasDraw) {
                        zIsOutOwner = chatMessageCell.getMessageObject().isOutOwner();
                        z3 = ((zIsOutOwner || transitionParams2.lastDrawingBackgroundRect.left == chatMessageCell.getBackgroundDrawableLeft()) && (zIsOutOwner || transitionParams2.lastDrawingBackgroundRect.right == chatMessageCell.getBackgroundDrawableRight())) ? false : true;
                        if (!z3 || transitionParams2.lastDrawingBackgroundRect.top != chatMessageCell.getBackgroundDrawableTop() || transitionParams2.lastDrawingBackgroundRect.bottom != chatMessageCell.getBackgroundDrawableBottom()) {
                            moveInfoExtended.deltaBottom = chatMessageCell.getBackgroundDrawableBottom() - transitionParams2.lastDrawingBackgroundRect.bottom;
                            moveInfoExtended.deltaTop = chatMessageCell.getBackgroundDrawableTop() - transitionParams2.lastDrawingBackgroundRect.top;
                            if (chatMessageCell.isSideMenuEnabled != transitionParams2.lastDrawingSideMenuEnabled) {
                                moveInfoExtended.deltaLeft = chatMessageCell.getBackgroundDrawableLeft() - transitionParams2.lastDrawingBackgroundRect.left;
                                moveInfoExtended.deltaRight = chatMessageCell.getBackgroundDrawableRight() - transitionParams2.lastDrawingBackgroundRect.right;
                            } else if (zIsOutOwner) {
                                moveInfoExtended.deltaLeft = chatMessageCell.getBackgroundDrawableLeft() - transitionParams2.lastDrawingBackgroundRect.left;
                            } else {
                                moveInfoExtended.deltaRight = chatMessageCell.getBackgroundDrawableRight() - transitionParams2.lastDrawingBackgroundRect.right;
                            }
                            moveInfoExtended.animateBackgroundOnly = true;
                            transitionParams2.animateBackgroundBoundsInner = true;
                            transitionParams2.animateBackgroundWidth = z3;
                            transitionParams2.deltaLeft = -moveInfoExtended.deltaLeft;
                            transitionParams2.deltaRight = -moveInfoExtended.deltaRight;
                            transitionParams2.deltaTop = -moveInfoExtended.deltaTop;
                            transitionParams2.deltaBottom = -moveInfoExtended.deltaBottom;
                            this.recyclerListView.setClipChildren(false);
                            this.recyclerListView.invalidate();
                        }
                    }
                }
                if (currentMessagesGroup == null && this.willChangedGroups.contains(currentMessagesGroup)) {
                    this.willChangedGroups.remove(currentMessagesGroup);
                    RecyclerListView recyclerListView = (RecyclerListView) viewHolder.itemView.getParent();
                    MessageObject.GroupedMessages.TransitionParams transitionParams5 = currentMessagesGroup.transitionParams;
                    int i15 = 0;
                    int i16 = 0;
                    int i17 = 0;
                    int i18 = 0;
                    int i19 = 0;
                    boolean z6 = true;
                    while (i17 < recyclerListView.getChildCount()) {
                        View childAt = recyclerListView.getChildAt(i17);
                        if (childAt instanceof ChatMessageCell) {
                            ChatMessageCell chatMessageCell3 = (ChatMessageCell) childAt;
                            if (chatMessageCell3.getCurrentMessagesGroup() != currentMessagesGroup || chatMessageCell3.getMessageObject().deleted) {
                                groupedMessages2 = currentMessagesGroup;
                                i9 = i6;
                                i10 = i5;
                            } else {
                                int left = chatMessageCell3.getLeft() + chatMessageCell3.getBackgroundDrawableLeft();
                                groupedMessages2 = currentMessagesGroup;
                                int left2 = chatMessageCell3.getLeft() + chatMessageCell3.getBackgroundDrawableRight();
                                i10 = i5;
                                int top = chatMessageCell3.getTop() + chatMessageCell3.getPaddingTop() + chatMessageCell3.getBackgroundDrawableTop();
                                i9 = i6;
                                int top2 = chatMessageCell3.getTop() + chatMessageCell3.getPaddingTop() + chatMessageCell3.getBackgroundDrawableBottom();
                                if (i15 == 0 || left < i15) {
                                    i15 = left;
                                }
                                if (i16 == 0 || left2 > i16) {
                                    i16 = left2;
                                }
                                if (chatMessageCell3.getTransitionParams().wasDraw || transitionParams5.isNewGroup) {
                                    if (i18 == 0 || top < i18) {
                                        i18 = top;
                                    }
                                    if (i19 == 0 || top2 > i19) {
                                        i19 = top2;
                                    }
                                    z6 = false;
                                }
                            }
                        } else {
                            groupedMessages2 = currentMessagesGroup;
                            i9 = i6;
                            i10 = i5;
                        }
                        i17++;
                        currentMessagesGroup = groupedMessages2;
                        i5 = i10;
                        i6 = i9;
                    }
                    i7 = i6;
                    i8 = i5;
                    transitionParams5.isNewGroup = false;
                    if (i18 == 0 && i19 == 0 && i15 == 0 && i16 == 0) {
                        moveInfoExtended.animateChangeGroupBackground = false;
                        transitionParams5.backgroundChangeBounds = false;
                    } else {
                        int i20 = (-i18) + transitionParams5.top;
                        moveInfoExtended.groupOffsetTop = i20;
                        int i21 = (-i19) + transitionParams5.bottom;
                        moveInfoExtended.groupOffsetBottom = i21;
                        int i22 = (-i15) + transitionParams5.left;
                        moveInfoExtended.groupOffsetLeft = i22;
                        int i23 = (-i16) + transitionParams5.right;
                        moveInfoExtended.groupOffsetRight = i23;
                        moveInfoExtended.animateChangeGroupBackground = true;
                        transitionParams5.backgroundChangeBounds = true;
                        transitionParams5.offsetTop = i20;
                        transitionParams5.offsetBottom = i21;
                        transitionParams5.offsetLeft = i22;
                        transitionParams5.offsetRight = i23;
                        transitionParams5.captionEnterProgress = transitionParams5.drawCaptionLayout ? 1.0f : 0.0f;
                        recyclerListView.setClipChildren(false);
                        recyclerListView.invalidate();
                    }
                    transitionParams5.drawBackgroundForDeletedItems = z6;
                } else {
                    i7 = i6;
                    i8 = i5;
                }
                groupedMessages = (MessageObject.GroupedMessages) this.willRemovedGroup.get(Integer.valueOf(chatMessageCell.getMessageObject().getId()));
                if (groupedMessages != null) {
                    transitionParams3 = groupedMessages.transitionParams;
                    this.willRemovedGroup.remove(Integer.valueOf(chatMessageCell.getMessageObject().getId()));
                    if (transitionParams2.wasDraw) {
                        int left3 = chatMessageCell.getLeft() + chatMessageCell.getBackgroundDrawableLeft();
                        int left4 = chatMessageCell.getLeft() + chatMessageCell.getBackgroundDrawableRight();
                        int top3 = chatMessageCell.getTop() + chatMessageCell.getPaddingTop() + chatMessageCell.getBackgroundDrawableTop();
                        int top4 = chatMessageCell.getTop() + chatMessageCell.getPaddingTop() + chatMessageCell.getBackgroundDrawableBottom();
                        moveInfoExtended.animateRemoveGroup = true;
                        transitionParams2.animateBackgroundBoundsInner = true;
                        int i24 = left3 - transitionParams3.left;
                        moveInfoExtended.deltaLeft = i24;
                        moveInfoExtended.deltaRight = left4 - transitionParams3.right;
                        moveInfoExtended.deltaTop = top3 - transitionParams3.top;
                        moveInfoExtended.deltaBottom = top4 - transitionParams3.bottom;
                        moveInfoExtended.animateBackgroundOnly = false;
                        transitionParams2.deltaLeft = (int) ((-i24) - chatMessageCell.getAnimationOffsetX());
                        transitionParams2.deltaRight = (int) ((-moveInfoExtended.deltaRight) - chatMessageCell.getAnimationOffsetX());
                        transitionParams2.deltaTop = (int) ((-moveInfoExtended.deltaTop) - chatMessageCell.getTranslationY());
                        transitionParams2.deltaBottom = (int) ((-moveInfoExtended.deltaBottom) - chatMessageCell.getTranslationY());
                        z = true;
                        transitionParams2.transformGroupToSingleMessage = true;
                        this.recyclerListView.setClipChildren(false);
                        this.recyclerListView.invalidate();
                    } else {
                        z = true;
                        transitionParams3.drawBackgroundForDeletedItems = true;
                    }
                } else {
                    z = true;
                }
                if (transitionParams2.drawPinnedBottomBackground != chatMessageCell.isDrawPinnedBottom()) {
                    moveInfoExtended.animatePinnedBottom = z;
                    f8 = 0.0f;
                    transitionParams2.changePinnedBottomProgress = 0.0f;
                } else {
                    f8 = 0.0f;
                }
                zAnimateChange2 = transitionParams2.animateChange();
                moveInfoExtended.animateChangeInternal = zAnimateChange2;
                if (zAnimateChange2) {
                    transitionParams2.animateChange = z;
                    transitionParams2.animateChangeProgress = f8;
                }
                if (i7 == 0 && i8 == 0 && !moveInfoExtended.animateImage && !moveInfoExtended.animateRemoveGroup && !moveInfoExtended.animateChangeGroupBackground && !moveInfoExtended.animatePinnedBottom && !moveInfoExtended.animateBackgroundOnly && !zAnimateChange2) {
                    dispatchMoveFinished(viewHolder);
                    return false;
                }
            } else if (chatActionCell2 != null) {
                transitionParams = chatActionCell2.getTransitionParams();
                if (!transitionParams.supportChangeAnimation()) {
                    if (i6 != 0 && i5 == 0) {
                        dispatchMoveFinished(viewHolder);
                        return false;
                    }
                    if (i6 != 0) {
                        view2.setTranslationX(-i6);
                    }
                    this.mPendingMoves.add(moveInfoExtended);
                    checkIsRunning();
                    return true;
                }
                if (i6 != 0) {
                    view2.setTranslationX(-i6);
                }
                zAnimateChange = transitionParams.animateChange();
                moveInfoExtended.animateChangeInternal = zAnimateChange;
                if (zAnimateChange) {
                    transitionParams.animateChange = true;
                    transitionParams.animateChangeProgress = 0.0f;
                }
                if (i6 == 0 && i5 == 0 && !zAnimateChange) {
                    dispatchMoveFinished(viewHolder);
                    return false;
                }
            } else {
                view = viewHolder.itemView;
                if (view instanceof BotHelpCell) {
                    ((BotHelpCell) view).setAnimating(true);
                } else if (view instanceof UserInfoCell) {
                    ((UserInfoCell) view).setAnimating(true);
                } else {
                    if (i6 != 0 && i5 == 0) {
                        dispatchMoveFinished(viewHolder);
                        return false;
                    }
                    if (i6 != 0) {
                        view2.setTranslationX(-i6);
                    }
                }
            }
            this.mPendingMoves.add(moveInfoExtended);
            checkIsRunning();
            return true;
        }
        translationX = translationX2;
        int translationY2 = topMediaOffset + ((int) viewHolder.itemView.getTranslationY());
        iArr = new int[4];
        if (chatMessageCell != null) {
            float imageX2 = chatMessageCell.getPhotoImage().getImageX();
            float imageY2 = chatMessageCell.getPhotoImage().getImageY();
            imageWidth = chatMessageCell.getPhotoImage().getImageWidth();
            float imageHeight2 = chatMessageCell.getPhotoImage().getImageHeight();
            while (i13 < 4) {
                iArr[i13] = chatMessageCell.getPhotoImage().getRoundRadius()[i13];
            }
            f3 = imageX2;
            f2 = imageY2;
            f = imageHeight2;
        } else {
            f = 0.0f;
            imageWidth = 0.0f;
            f2 = 0.0f;
            f3 = 0.0f;
        }
        resetAnimation(viewHolder);
        int i110 = i3 - translationX;
        i5 = i4 - translationY2;
        if (i5 != 0) {
            view2.setTranslationY(-i5);
        }
        chatActionCell2 = chatActionCell;
        i6 = i110;
        f4 = f;
        f5 = imageWidth;
        f6 = f2;
        f7 = f3;
        moveInfoExtended = new MoveInfoExtended(viewHolder, translationX, translationY2, i3, i4);
        if (chatMessageCell != null) {
            transitionParams2 = chatMessageCell.getTransitionParams();
            if (!transitionParams2.supportChangeAnimation()) {
                if (i6 != 0) {
                }
                if (i6 != 0) {
                    view2.setTranslationX(-i6);
                }
                this.mPendingMoves.add(moveInfoExtended);
                checkIsRunning();
                return true;
            }
            currentMessagesGroup = chatMessageCell.getCurrentMessagesGroup();
            if (i6 != 0) {
                chatMessageCell.setAnimationOffsetX(-i6);
            }
            if (itemHolderInfo instanceof ItemHolderInfoExtended) {
                photoImage = chatMessageCell.getPhotoImage();
                itemHolderInfoExtended = (ItemHolderInfoExtended) itemHolderInfo;
                if (transitionParams2.wasDraw) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                moveInfoExtended.animateImage = z2;
                if (z2) {
                    this.recyclerListView.setClipChildren(false);
                    this.recyclerListView.invalidate();
                    transitionParams2.imageChangeBoundsTransition = true;
                    if (chatMessageCell.getMessageObject().isRoundVideo()) {
                        transitionParams2.animateToImageX = f7;
                        transitionParams2.animateToImageY = f6;
                        transitionParams2.animateToImageW = f5;
                        transitionParams2.animateToImageH = f4;
                        transitionParams2.animateToRadius = iArr;
                    } else {
                        transitionParams2.animateToImageX = photoImage.getImageX();
                        transitionParams2.animateToImageY = photoImage.getImageY();
                        transitionParams2.animateToImageW = photoImage.getImageWidth();
                        transitionParams2.animateToImageH = photoImage.getImageHeight();
                        transitionParams2.animateToRadius = photoImage.getRoundRadius();
                    }
                    transitionParams2.animateRadius = false;
                    while (i11 < 4) {
                        if (transitionParams2.imageRoundRadius[i11] != transitionParams2.animateToRadius[i11]) {
                            transitionParams2.animateRadius = true;
                            break;
                        }
                    }
                    f9 = transitionParams2.animateToImageX;
                    f10 = itemHolderInfoExtended.imageX;
                    if (f9 != f10) {
                        moveInfoExtended.imageX = f10;
                        moveInfoExtended.imageY = itemHolderInfoExtended.imageY;
                        moveInfoExtended.imageWidth = itemHolderInfoExtended.imageWidth;
                        moveInfoExtended.imageHeight = itemHolderInfoExtended.imageHeight;
                        if (currentMessagesGroup != null) {
                            z4 = currentMessagesGroup.hasCaption;
                            transitionParams4 = currentMessagesGroup.transitionParams;
                            z5 = transitionParams4.drawCaptionLayout;
                            if (z4 != z5) {
                                if (z5) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = 0.0f;
                                }
                                transitionParams4.captionEnterProgress = f11;
                            }
                        }
                        if (transitionParams2.animateRadius) {
                            if (transitionParams2.animateToRadius == photoImage.getRoundRadius()) {
                                transitionParams2.animateToRadius = new int[4];
                                while (i12 < 4) {
                                    transitionParams2.animateToRadius[i12] = photoImage.getRoundRadius()[i12];
                                }
                            }
                            photoImage.setRoundRadius(transitionParams2.imageRoundRadius);
                        }
                        chatMessageCell.setImageCoords(moveInfoExtended.imageX, moveInfoExtended.imageY, moveInfoExtended.imageWidth, moveInfoExtended.imageHeight);
                    } else {
                        moveInfoExtended.imageX = f10;
                        moveInfoExtended.imageY = itemHolderInfoExtended.imageY;
                        moveInfoExtended.imageWidth = itemHolderInfoExtended.imageWidth;
                        moveInfoExtended.imageHeight = itemHolderInfoExtended.imageHeight;
                        if (currentMessagesGroup != null) {
                            z4 = currentMessagesGroup.hasCaption;
                            transitionParams4 = currentMessagesGroup.transitionParams;
                            z5 = transitionParams4.drawCaptionLayout;
                            if (z4 != z5) {
                                if (z5) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = 0.0f;
                                }
                                transitionParams4.captionEnterProgress = f11;
                            }
                        }
                        if (transitionParams2.animateRadius) {
                            if (transitionParams2.animateToRadius == photoImage.getRoundRadius()) {
                                transitionParams2.animateToRadius = new int[4];
                                while (i12 < 4) {
                                    transitionParams2.animateToRadius[i12] = photoImage.getRoundRadius()[i12];
                                }
                            }
                            photoImage.setRoundRadius(transitionParams2.imageRoundRadius);
                        }
                        chatMessageCell.setImageCoords(moveInfoExtended.imageX, moveInfoExtended.imageY, moveInfoExtended.imageWidth, moveInfoExtended.imageHeight);
                    }
                }
                if (currentMessagesGroup == null) {
                    zIsOutOwner = chatMessageCell.getMessageObject().isOutOwner();
                    if (zIsOutOwner) {
                    }
                    if (!z3) {
                        moveInfoExtended.deltaBottom = chatMessageCell.getBackgroundDrawableBottom() - transitionParams2.lastDrawingBackgroundRect.bottom;
                        moveInfoExtended.deltaTop = chatMessageCell.getBackgroundDrawableTop() - transitionParams2.lastDrawingBackgroundRect.top;
                        if (chatMessageCell.isSideMenuEnabled != transitionParams2.lastDrawingSideMenuEnabled) {
                            moveInfoExtended.deltaLeft = chatMessageCell.getBackgroundDrawableLeft() - transitionParams2.lastDrawingBackgroundRect.left;
                            moveInfoExtended.deltaRight = chatMessageCell.getBackgroundDrawableRight() - transitionParams2.lastDrawingBackgroundRect.right;
                        } else if (zIsOutOwner) {
                            moveInfoExtended.deltaLeft = chatMessageCell.getBackgroundDrawableLeft() - transitionParams2.lastDrawingBackgroundRect.left;
                        } else {
                            moveInfoExtended.deltaRight = chatMessageCell.getBackgroundDrawableRight() - transitionParams2.lastDrawingBackgroundRect.right;
                        }
                        moveInfoExtended.animateBackgroundOnly = true;
                        transitionParams2.animateBackgroundBoundsInner = true;
                        transitionParams2.animateBackgroundWidth = z3;
                        transitionParams2.deltaLeft = -moveInfoExtended.deltaLeft;
                        transitionParams2.deltaRight = -moveInfoExtended.deltaRight;
                        transitionParams2.deltaTop = -moveInfoExtended.deltaTop;
                        transitionParams2.deltaBottom = -moveInfoExtended.deltaBottom;
                        this.recyclerListView.setClipChildren(false);
                        this.recyclerListView.invalidate();
                    } else {
                        moveInfoExtended.deltaBottom = chatMessageCell.getBackgroundDrawableBottom() - transitionParams2.lastDrawingBackgroundRect.bottom;
                        moveInfoExtended.deltaTop = chatMessageCell.getBackgroundDrawableTop() - transitionParams2.lastDrawingBackgroundRect.top;
                        if (chatMessageCell.isSideMenuEnabled != transitionParams2.lastDrawingSideMenuEnabled) {
                            moveInfoExtended.deltaLeft = chatMessageCell.getBackgroundDrawableLeft() - transitionParams2.lastDrawingBackgroundRect.left;
                            moveInfoExtended.deltaRight = chatMessageCell.getBackgroundDrawableRight() - transitionParams2.lastDrawingBackgroundRect.right;
                        } else if (zIsOutOwner) {
                            moveInfoExtended.deltaLeft = chatMessageCell.getBackgroundDrawableLeft() - transitionParams2.lastDrawingBackgroundRect.left;
                        } else {
                            moveInfoExtended.deltaRight = chatMessageCell.getBackgroundDrawableRight() - transitionParams2.lastDrawingBackgroundRect.right;
                        }
                        moveInfoExtended.animateBackgroundOnly = true;
                        transitionParams2.animateBackgroundBoundsInner = true;
                        transitionParams2.animateBackgroundWidth = z3;
                        transitionParams2.deltaLeft = -moveInfoExtended.deltaLeft;
                        transitionParams2.deltaRight = -moveInfoExtended.deltaRight;
                        transitionParams2.deltaTop = -moveInfoExtended.deltaTop;
                        transitionParams2.deltaBottom = -moveInfoExtended.deltaBottom;
                        this.recyclerListView.setClipChildren(false);
                        this.recyclerListView.invalidate();
                    }
                }
            }
            if (currentMessagesGroup == null) {
                i7 = i6;
                i8 = i5;
            } else {
                i7 = i6;
                i8 = i5;
            }
            groupedMessages = (MessageObject.GroupedMessages) this.willRemovedGroup.get(Integer.valueOf(chatMessageCell.getMessageObject().getId()));
            if (groupedMessages != null) {
                transitionParams3 = groupedMessages.transitionParams;
                this.willRemovedGroup.remove(Integer.valueOf(chatMessageCell.getMessageObject().getId()));
                if (transitionParams2.wasDraw) {
                    int left5 = chatMessageCell.getLeft() + chatMessageCell.getBackgroundDrawableLeft();
                    int left6 = chatMessageCell.getLeft() + chatMessageCell.getBackgroundDrawableRight();
                    int top5 = chatMessageCell.getTop() + chatMessageCell.getPaddingTop() + chatMessageCell.getBackgroundDrawableTop();
                    int top6 = chatMessageCell.getTop() + chatMessageCell.getPaddingTop() + chatMessageCell.getBackgroundDrawableBottom();
                    moveInfoExtended.animateRemoveGroup = true;
                    transitionParams2.animateBackgroundBoundsInner = true;
                    int i25 = left5 - transitionParams3.left;
                    moveInfoExtended.deltaLeft = i25;
                    moveInfoExtended.deltaRight = left6 - transitionParams3.right;
                    moveInfoExtended.deltaTop = top5 - transitionParams3.top;
                    moveInfoExtended.deltaBottom = top6 - transitionParams3.bottom;
                    moveInfoExtended.animateBackgroundOnly = false;
                    transitionParams2.deltaLeft = (int) ((-i25) - chatMessageCell.getAnimationOffsetX());
                    transitionParams2.deltaRight = (int) ((-moveInfoExtended.deltaRight) - chatMessageCell.getAnimationOffsetX());
                    transitionParams2.deltaTop = (int) ((-moveInfoExtended.deltaTop) - chatMessageCell.getTranslationY());
                    transitionParams2.deltaBottom = (int) ((-moveInfoExtended.deltaBottom) - chatMessageCell.getTranslationY());
                    z = true;
                    transitionParams2.transformGroupToSingleMessage = true;
                    this.recyclerListView.setClipChildren(false);
                    this.recyclerListView.invalidate();
                } else {
                    z = true;
                    transitionParams3.drawBackgroundForDeletedItems = true;
                }
            } else {
                z = true;
            }
            if (transitionParams2.drawPinnedBottomBackground != chatMessageCell.isDrawPinnedBottom()) {
                moveInfoExtended.animatePinnedBottom = z;
                f8 = 0.0f;
                transitionParams2.changePinnedBottomProgress = 0.0f;
            } else {
                f8 = 0.0f;
            }
            zAnimateChange2 = transitionParams2.animateChange();
            moveInfoExtended.animateChangeInternal = zAnimateChange2;
            if (zAnimateChange2) {
                transitionParams2.animateChange = z;
                transitionParams2.animateChangeProgress = f8;
            }
            if (i7 == 0) {
                dispatchMoveFinished(viewHolder);
                return false;
            }
        } else if (chatActionCell2 != null) {
            transitionParams = chatActionCell2.getTransitionParams();
            if (!transitionParams.supportChangeAnimation()) {
                if (i6 != 0) {
                }
                if (i6 != 0) {
                    view2.setTranslationX(-i6);
                }
                this.mPendingMoves.add(moveInfoExtended);
                checkIsRunning();
                return true;
            }
            if (i6 != 0) {
                view2.setTranslationX(-i6);
            }
            zAnimateChange = transitionParams.animateChange();
            moveInfoExtended.animateChangeInternal = zAnimateChange;
            if (zAnimateChange) {
                transitionParams.animateChange = true;
                transitionParams.animateChangeProgress = 0.0f;
            }
            if (i6 == 0) {
                dispatchMoveFinished(viewHolder);
                return false;
            }
        } else {
            view = viewHolder.itemView;
            if (view instanceof BotHelpCell) {
                ((BotHelpCell) view).setAnimating(true);
            } else if (view instanceof UserInfoCell) {
                ((UserInfoCell) view).setAnimating(true);
            } else {
                if (i6 != 0) {
                }
                if (i6 != 0) {
                    view2.setTranslationX(-i6);
                }
            }
        }
        this.mPendingMoves.add(moveInfoExtended);
        checkIsRunning();
        return true;
    }

    @Override
    protected void animateMoveImpl(RecyclerView.ViewHolder viewHolder, DefaultItemAnimator.MoveInfo moveInfo) {
        animateMoveImpl(viewHolder, moveInfo, false);
    }

    protected void animateMoveImpl(final RecyclerView.ViewHolder viewHolder, DefaultItemAnimator.MoveInfo moveInfo, boolean z) {
        View view;
        AnimatorSet animatorSet;
        final ChatActionCell chatActionCell;
        final ChatActionCell.TransitionParams transitionParams;
        ChatMessageCell chatMessageCell;
        final ChatMessageCell.TransitionParams transitionParams2;
        final ChatMessageCell chatMessageCell2;
        final MoveInfoExtended moveInfoExtended;
        final ChatMessageCell.TransitionParams transitionParams3;
        final ChatMessageCell chatMessageCell3;
        boolean z2;
        MessageObject.GroupedMessages currentMessagesGroup;
        final float f;
        final float f2;
        final boolean z3;
        float f3;
        final float f4;
        int iHasCaptionLayout;
        final float f5;
        boolean z4;
        final int[] iArr;
        int[] iArr2;
        int i;
        View view2;
        int i2 = moveInfo.fromX;
        int i3 = moveInfo.fromY;
        int i4 = moveInfo.toY;
        final View view3 = viewHolder.itemView;
        final int i5 = i4 - i3;
        AnimatorSet animatorSet2 = new AnimatorSet();
        if (i5 != 0) {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
        }
        this.mMoveAnimations.add(viewHolder);
        final MoveInfoExtended moveInfoExtended2 = (MoveInfoExtended) moveInfo;
        ChatActivity chatActivity = this.activity;
        if (chatActivity != null) {
            View view4 = viewHolder.itemView;
            if (view4 instanceof BotHelpCell) {
                final BotHelpCell botHelpCell = (BotHelpCell) view4;
                final float translationY = botHelpCell.getTranslationY();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        float measuredHeight = ((((ChatListItemAnimator.this.recyclerListView.getMeasuredHeight() - ChatListItemAnimator.this.activity.getChatListViewPadding()) - ChatListItemAnimator.this.activity.blurredViewBottomOffset) / 2.0f) - (botHelpCell.getMeasuredHeight() / 2.0f)) + ChatListItemAnimator.this.activity.getChatListViewPadding();
                        botHelpCell.setTranslationY((translationY * (1.0f - fFloatValue)) + ((((float) botHelpCell.getTop()) > measuredHeight ? measuredHeight - botHelpCell.getTop() : 0.0f) * fFloatValue));
                    }
                });
                animatorSet2.playTogether(valueAnimatorOfFloat);
            } else {
                if (chatActivity != null) {
                    view2 = viewHolder.itemView;
                    if (view2 instanceof UserInfoCell) {
                        final UserInfoCell userInfoCell = (UserInfoCell) view2;
                        final float translationY2 = userInfoCell.getTranslationY();
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                float measuredHeight = ((((ChatListItemAnimator.this.recyclerListView.getMeasuredHeight() - ChatListItemAnimator.this.activity.getChatListViewPadding()) - ChatListItemAnimator.this.activity.blurredViewBottomOffset) / 2.0f) - (userInfoCell.getMeasuredHeight() / 2.0f)) + ChatListItemAnimator.this.activity.getChatListViewPadding();
                                userInfoCell.setTranslationY((translationY2 * (1.0f - fFloatValue)) + ((((float) userInfoCell.getTop()) > measuredHeight ? measuredHeight - userInfoCell.getTop() : 0.0f) * fFloatValue));
                            }
                        });
                        animatorSet2.playTogether(valueAnimatorOfFloat2);
                    }
                }
                view = viewHolder.itemView;
                if (view instanceof ChatMessageCell) {
                    chatMessageCell = (ChatMessageCell) view;
                    transitionParams2 = chatMessageCell.getTransitionParams();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(chatMessageCell, (Property<ChatMessageCell, Float>) chatMessageCell.ANIMATION_OFFSET_X, 0.0f));
                    if (moveInfoExtended2.animateImage) {
                        chatMessageCell.setImageCoords(moveInfoExtended2.imageX, moveInfoExtended2.imageY, moveInfoExtended2.imageWidth, moveInfoExtended2.imageHeight);
                        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        if (chatMessageCell.getCurrentMessagesGroup() == null) {
                            f3 = transitionParams2.captionEnterProgress;
                        } else {
                            f3 = chatMessageCell.getCurrentMessagesGroup().transitionParams.captionEnterProgress;
                        }
                        f4 = f3;
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
                            iArr2 = new int[4];
                            for (i = 0; i < 4; i++) {
                                iArr2[i] = chatMessageCell.getPhotoImage().getRoundRadius()[i];
                            }
                            iArr = iArr2;
                        } else {
                            iArr = null;
                        }
                        final boolean z5 = z4;
                        chatMessageCell2 = chatMessageCell;
                        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ChatListItemAnimator.lambda$animateMoveImpl$2(moveInfoExtended2, transitionParams2, z5, f4, f5, chatMessageCell2, iArr, viewHolder, valueAnimator);
                            }
                        });
                        animatorSet = animatorSet2;
                        animatorSet.playTogether(valueAnimatorOfFloat3);
                        moveInfoExtended = moveInfoExtended2;
                    } else {
                        chatMessageCell2 = chatMessageCell;
                        animatorSet = animatorSet2;
                        moveInfoExtended = moveInfoExtended2;
                    }
                    if (moveInfoExtended.deltaBottom == 0 || moveInfoExtended.deltaRight != 0 || moveInfoExtended.deltaTop != 0 || moveInfoExtended.deltaLeft != 0) {
                        transitionParams3 = transitionParams2;
                        this.recyclerListView.setClipChildren(false);
                        this.recyclerListView.invalidate();
                        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        if (moveInfoExtended.animateBackgroundOnly) {
                            transitionParams3.toDeltaLeft = -moveInfoExtended.deltaLeft;
                            transitionParams3.toDeltaRight = -moveInfoExtended.deltaRight;
                        } else {
                            transitionParams3.toDeltaLeft = (-moveInfoExtended.deltaLeft) - chatMessageCell2.getAnimationOffsetX();
                            transitionParams3.toDeltaRight = (-moveInfoExtended.deltaRight) - chatMessageCell2.getAnimationOffsetX();
                        }
                        chatMessageCell3 = chatMessageCell2;
                        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ChatListItemAnimator.lambda$animateMoveImpl$3(moveInfoExtended, transitionParams3, chatMessageCell3, valueAnimator);
                            }
                        });
                        z2 = false;
                        animatorSet.playTogether(valueAnimatorOfFloat4);
                    } else {
                        transitionParams3 = transitionParams2;
                        transitionParams3.toDeltaLeft = 0.0f;
                        transitionParams3.toDeltaRight = 0.0f;
                        chatMessageCell3 = chatMessageCell2;
                        z2 = false;
                    }
                    currentMessagesGroup = chatMessageCell3.getCurrentMessagesGroup();
                    if (currentMessagesGroup == null) {
                        moveInfoExtended.animateChangeGroupBackground = z2;
                    }
                    if (moveInfoExtended.animateChangeGroupBackground) {
                        ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(1.0f, 0.0f);
                        final MessageObject.GroupedMessages.TransitionParams transitionParams4 = currentMessagesGroup.transitionParams;
                        final RecyclerListView recyclerListView = (RecyclerListView) viewHolder.itemView.getParent();
                        f = currentMessagesGroup.transitionParams.captionEnterProgress;
                        if (currentMessagesGroup.hasCaption) {
                            f2 = 1.0f;
                        } else {
                            f2 = 0.0f;
                        }
                        if (f != f2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        final MoveInfoExtended moveInfoExtended3 = moveInfoExtended;
                        valueAnimatorOfFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ChatListItemAnimator.lambda$animateMoveImpl$4(transitionParams4, moveInfoExtended3, z3, f, f2, recyclerListView, valueAnimator);
                            }
                        });
                        valueAnimatorOfFloat5.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                MessageObject.GroupedMessages.TransitionParams transitionParams5 = transitionParams4;
                                transitionParams5.backgroundChangeBounds = false;
                                transitionParams5.drawBackgroundForDeletedItems = false;
                            }
                        });
                        animatorSet.playTogether(valueAnimatorOfFloat5);
                    }
                    if (moveInfoExtended.animatePinnedBottom) {
                        ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ChatListItemAnimator.lambda$animateMoveImpl$5(transitionParams3, chatMessageCell3, valueAnimator);
                            }
                        });
                        animatorSet.playTogether(valueAnimatorOfFloat6);
                    }
                    if (moveInfoExtended.animateChangeInternal) {
                        ValueAnimator valueAnimatorOfFloat7 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        transitionParams3.animateChange = true;
                        valueAnimatorOfFloat7.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ChatListItemAnimator.lambda$animateMoveImpl$6(transitionParams3, chatMessageCell3, valueAnimator);
                            }
                        });
                        animatorSet.playTogether(valueAnimatorOfFloat7);
                    }
                } else {
                    animatorSet = animatorSet2;
                    if (view instanceof ChatActionCell) {
                        chatActionCell = (ChatActionCell) view;
                        transitionParams = chatActionCell.getTransitionParams();
                        if (moveInfoExtended2.animateChangeInternal) {
                            ValueAnimator valueAnimatorOfFloat8 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            transitionParams.animateChange = true;
                            valueAnimatorOfFloat8.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    ChatListItemAnimator.lambda$animateMoveImpl$7(transitionParams, chatActionCell, valueAnimator);
                                }
                            });
                            animatorSet.playTogether(valueAnimatorOfFloat8);
                        }
                    }
                }
            }
            animatorSet = animatorSet2;
        } else {
            if (chatActivity != null) {
                view2 = viewHolder.itemView;
                if (view2 instanceof UserInfoCell) {
                    final UserInfoCell userInfoCell2 = (UserInfoCell) view2;
                    final float translationY3 = userInfoCell2.getTranslationY();
                    ValueAnimator valueAnimatorOfFloat9 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat9.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            float measuredHeight = ((((ChatListItemAnimator.this.recyclerListView.getMeasuredHeight() - ChatListItemAnimator.this.activity.getChatListViewPadding()) - ChatListItemAnimator.this.activity.blurredViewBottomOffset) / 2.0f) - (userInfoCell2.getMeasuredHeight() / 2.0f)) + ChatListItemAnimator.this.activity.getChatListViewPadding();
                            userInfoCell2.setTranslationY((translationY3 * (1.0f - fFloatValue)) + ((((float) userInfoCell2.getTop()) > measuredHeight ? measuredHeight - userInfoCell2.getTop() : 0.0f) * fFloatValue));
                        }
                    });
                    animatorSet2.playTogether(valueAnimatorOfFloat9);
                    animatorSet = animatorSet2;
                }
            }
            view = viewHolder.itemView;
            if (view instanceof ChatMessageCell) {
                chatMessageCell = (ChatMessageCell) view;
                transitionParams2 = chatMessageCell.getTransitionParams();
                animatorSet2.playTogether(ObjectAnimator.ofFloat(chatMessageCell, (Property<ChatMessageCell, Float>) chatMessageCell.ANIMATION_OFFSET_X, 0.0f));
                if (moveInfoExtended2.animateImage) {
                    chatMessageCell.setImageCoords(moveInfoExtended2.imageX, moveInfoExtended2.imageY, moveInfoExtended2.imageWidth, moveInfoExtended2.imageHeight);
                    ValueAnimator valueAnimatorOfFloat10 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    if (chatMessageCell.getCurrentMessagesGroup() == null) {
                        f3 = transitionParams2.captionEnterProgress;
                    } else {
                        f3 = chatMessageCell.getCurrentMessagesGroup().transitionParams.captionEnterProgress;
                    }
                    f4 = f3;
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
                        iArr2 = new int[4];
                        while (i < 4) {
                            iArr2[i] = chatMessageCell.getPhotoImage().getRoundRadius()[i];
                        }
                        iArr = iArr2;
                    } else {
                        iArr = null;
                    }
                    final boolean z6 = z4;
                    chatMessageCell2 = chatMessageCell;
                    valueAnimatorOfFloat10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ChatListItemAnimator.lambda$animateMoveImpl$2(moveInfoExtended2, transitionParams2, z6, f4, f5, chatMessageCell2, iArr, viewHolder, valueAnimator);
                        }
                    });
                    animatorSet = animatorSet2;
                    animatorSet.playTogether(valueAnimatorOfFloat10);
                    moveInfoExtended = moveInfoExtended2;
                } else {
                    chatMessageCell2 = chatMessageCell;
                    animatorSet = animatorSet2;
                    moveInfoExtended = moveInfoExtended2;
                }
                if (moveInfoExtended.deltaBottom == 0) {
                    transitionParams3 = transitionParams2;
                    this.recyclerListView.setClipChildren(false);
                    this.recyclerListView.invalidate();
                    ValueAnimator valueAnimatorOfFloat11 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    if (moveInfoExtended.animateBackgroundOnly) {
                        transitionParams3.toDeltaLeft = -moveInfoExtended.deltaLeft;
                        transitionParams3.toDeltaRight = -moveInfoExtended.deltaRight;
                    } else {
                        transitionParams3.toDeltaLeft = (-moveInfoExtended.deltaLeft) - chatMessageCell2.getAnimationOffsetX();
                        transitionParams3.toDeltaRight = (-moveInfoExtended.deltaRight) - chatMessageCell2.getAnimationOffsetX();
                    }
                    chatMessageCell3 = chatMessageCell2;
                    valueAnimatorOfFloat11.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ChatListItemAnimator.lambda$animateMoveImpl$3(moveInfoExtended, transitionParams3, chatMessageCell3, valueAnimator);
                        }
                    });
                    z2 = false;
                    animatorSet.playTogether(valueAnimatorOfFloat11);
                } else {
                    transitionParams3 = transitionParams2;
                    this.recyclerListView.setClipChildren(false);
                    this.recyclerListView.invalidate();
                    ValueAnimator valueAnimatorOfFloat12 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    if (moveInfoExtended.animateBackgroundOnly) {
                        transitionParams3.toDeltaLeft = -moveInfoExtended.deltaLeft;
                        transitionParams3.toDeltaRight = -moveInfoExtended.deltaRight;
                    } else {
                        transitionParams3.toDeltaLeft = (-moveInfoExtended.deltaLeft) - chatMessageCell2.getAnimationOffsetX();
                        transitionParams3.toDeltaRight = (-moveInfoExtended.deltaRight) - chatMessageCell2.getAnimationOffsetX();
                    }
                    chatMessageCell3 = chatMessageCell2;
                    valueAnimatorOfFloat12.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ChatListItemAnimator.lambda$animateMoveImpl$3(moveInfoExtended, transitionParams3, chatMessageCell3, valueAnimator);
                        }
                    });
                    z2 = false;
                    animatorSet.playTogether(valueAnimatorOfFloat12);
                }
                currentMessagesGroup = chatMessageCell3.getCurrentMessagesGroup();
                if (currentMessagesGroup == null) {
                    moveInfoExtended.animateChangeGroupBackground = z2;
                }
                if (moveInfoExtended.animateChangeGroupBackground) {
                    ValueAnimator valueAnimatorOfFloat13 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    final MessageObject.GroupedMessages.TransitionParams transitionParams5 = currentMessagesGroup.transitionParams;
                    final RecyclerListView recyclerListView2 = (RecyclerListView) viewHolder.itemView.getParent();
                    f = currentMessagesGroup.transitionParams.captionEnterProgress;
                    if (currentMessagesGroup.hasCaption) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    if (f != f2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    final MoveInfoExtended moveInfoExtended4 = moveInfoExtended;
                    valueAnimatorOfFloat13.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ChatListItemAnimator.lambda$animateMoveImpl$4(transitionParams5, moveInfoExtended4, z3, f, f2, recyclerListView2, valueAnimator);
                        }
                    });
                    valueAnimatorOfFloat13.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            MessageObject.GroupedMessages.TransitionParams transitionParams6 = transitionParams5;
                            transitionParams6.backgroundChangeBounds = false;
                            transitionParams6.drawBackgroundForDeletedItems = false;
                        }
                    });
                    animatorSet.playTogether(valueAnimatorOfFloat13);
                }
                if (moveInfoExtended.animatePinnedBottom) {
                    ValueAnimator valueAnimatorOfFloat14 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat14.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ChatListItemAnimator.lambda$animateMoveImpl$5(transitionParams3, chatMessageCell3, valueAnimator);
                        }
                    });
                    animatorSet.playTogether(valueAnimatorOfFloat14);
                }
                if (moveInfoExtended.animateChangeInternal) {
                    ValueAnimator valueAnimatorOfFloat15 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    transitionParams3.animateChange = true;
                    valueAnimatorOfFloat15.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ChatListItemAnimator.lambda$animateMoveImpl$6(transitionParams3, chatMessageCell3, valueAnimator);
                        }
                    });
                    animatorSet.playTogether(valueAnimatorOfFloat15);
                }
            } else {
                animatorSet = animatorSet2;
                if (view instanceof ChatActionCell) {
                    chatActionCell = (ChatActionCell) view;
                    transitionParams = chatActionCell.getTransitionParams();
                    if (moveInfoExtended2.animateChangeInternal) {
                        ValueAnimator valueAnimatorOfFloat16 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        transitionParams.animateChange = true;
                        valueAnimatorOfFloat16.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ChatListItemAnimator.lambda$animateMoveImpl$7(transitionParams, chatActionCell, valueAnimator);
                            }
                        });
                        animatorSet.playTogether(valueAnimatorOfFloat16);
                    }
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
            public void onAnimationStart(Animator animator) {
                ChatListItemAnimator.this.dispatchMoveStarting(viewHolder);
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                if (i5 != 0) {
                    view3.setTranslationY(0.0f);
                }
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                animator.removeAllListeners();
                ChatListItemAnimator.this.restoreTransitionParams(viewHolder.itemView);
                View view5 = viewHolder.itemView;
                if (view5 instanceof ChatMessageCell) {
                    ChatMessageCell chatMessageCell4 = (ChatMessageCell) view5;
                    if (chatMessageCell4.makeVisibleAfterChange) {
                        chatMessageCell4.makeVisibleAfterChange = false;
                        chatMessageCell4.setVisibility(0);
                    }
                    MessageObject.GroupedMessages currentMessagesGroup2 = chatMessageCell4.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 != null) {
                        currentMessagesGroup2.transitionParams.reset();
                    }
                }
                if (((DefaultItemAnimator) ChatListItemAnimator.this).mMoveAnimations.remove(viewHolder)) {
                    ChatListItemAnimator.this.dispatchMoveFinished(viewHolder);
                    ChatListItemAnimator.this.dispatchFinishedWhenDone();
                }
            }
        });
        animatorSet.start();
        this.animators.put(viewHolder, animatorSet);
    }

    public static void lambda$animateMoveImpl$2(MoveInfoExtended moveInfoExtended, ChatMessageCell.TransitionParams transitionParams, boolean z, float f, float f2, ChatMessageCell chatMessageCell, int[] iArr, RecyclerView.ViewHolder viewHolder, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f3 = 1.0f - fFloatValue;
        float f4 = (moveInfoExtended.imageX * f3) + (transitionParams.animateToImageX * fFloatValue);
        float f5 = (moveInfoExtended.imageY * f3) + (transitionParams.animateToImageY * fFloatValue);
        float f6 = (moveInfoExtended.imageWidth * f3) + (transitionParams.animateToImageW * fFloatValue);
        float f7 = (moveInfoExtended.imageHeight * f3) + (transitionParams.animateToImageH * fFloatValue);
        if (z) {
            float f8 = (f * f3) + (f2 * fFloatValue);
            transitionParams.captionEnterProgress = f8;
            if (chatMessageCell.getCurrentMessagesGroup() != null) {
                chatMessageCell.getCurrentMessagesGroup().transitionParams.captionEnterProgress = f8;
            }
        }
        if (transitionParams.animateRadius) {
            ImageReceiver photoImage = chatMessageCell.getPhotoImage();
            float f9 = iArr[0] * f3;
            int[] iArr2 = transitionParams.animateToRadius;
            photoImage.setRoundRadius((int) (f9 + (iArr2[0] * fFloatValue)), (int) ((iArr[1] * f3) + (iArr2[1] * fFloatValue)), (int) ((iArr[2] * f3) + (iArr2[2] * fFloatValue)), (int) ((iArr[3] * f3) + (iArr2[3] * fFloatValue)));
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
            transitionParams.captionEnterProgress = (f * fFloatValue) + (f2 * (1.0f - fFloatValue));
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

    @Override
    public boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, int i, int i2, int i3, int i4) {
        float translationX;
        if (viewHolder == viewHolder2) {
            return animateMove(viewHolder, itemHolderInfo, i, i2, i3, i4);
        }
        View view = viewHolder.itemView;
        if (view instanceof ChatMessageCell) {
            translationX = ((ChatMessageCell) view).getAnimationOffsetX();
        } else {
            translationX = view.getTranslationX();
        }
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        resetAnimation(viewHolder);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        View view2 = viewHolder.itemView;
        if (view2 instanceof ChatMessageCell) {
            ((ChatMessageCell) view2).setAnimationOffsetX(translationX);
        } else {
            view2.setTranslationX(translationX);
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
    public void animateChangeImpl(final DefaultItemAnimator.ChangeInfo changeInfo) {
        RecyclerView.ViewHolder viewHolder = changeInfo.oldHolder;
        final View view = viewHolder == null ? null : viewHolder.itemView;
        RecyclerView.ViewHolder viewHolder2 = changeInfo.newHolder;
        final View view2 = viewHolder2 != null ? viewHolder2.itemView : null;
        if (view != null) {
            final ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.mChangeAnimations.add(changeInfo.oldHolder);
            duration.translationX(changeInfo.toX - changeInfo.fromX);
            duration.translationY(changeInfo.toY - changeInfo.fromY);
            duration.alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationStart(Animator animator) {
                    ChatListItemAnimator.this.dispatchChangeStarting(changeInfo.oldHolder, true);
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    duration.setListener(null);
                    view.setAlpha(1.0f);
                    view.setScaleX(1.0f);
                    view.setScaleX(1.0f);
                    View view3 = view;
                    if (view3 instanceof ChatMessageCell) {
                        ((ChatMessageCell) view3).setAnimationOffsetX(0.0f);
                    } else {
                        view3.setTranslationX(0.0f);
                    }
                    view.setTranslationY(0.0f);
                    if (((DefaultItemAnimator) ChatListItemAnimator.this).mChangeAnimations.remove(changeInfo.oldHolder)) {
                        ChatListItemAnimator.this.dispatchChangeFinished(changeInfo.oldHolder, true);
                        ChatListItemAnimator.this.dispatchFinishedWhenDone();
                    }
                }
            }).start();
        }
        if (view2 != null) {
            final ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.mChangeAnimations.add(changeInfo.newHolder);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationStart(Animator animator) {
                    ChatListItemAnimator.this.dispatchChangeStarting(changeInfo.newHolder, false);
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    viewPropertyAnimatorAnimate.setListener(null);
                    view2.setAlpha(1.0f);
                    view2.setScaleX(1.0f);
                    view2.setScaleX(1.0f);
                    View view3 = view2;
                    if (view3 instanceof ChatMessageCell) {
                        ((ChatMessageCell) view3).setAnimationOffsetX(0.0f);
                    } else {
                        view3.setTranslationX(0.0f);
                    }
                    view2.setTranslationY(0.0f);
                    if (((DefaultItemAnimator) ChatListItemAnimator.this).mChangeAnimations.remove(changeInfo.newHolder)) {
                        ChatListItemAnimator.this.dispatchChangeFinished(changeInfo.newHolder, false);
                        ChatListItemAnimator.this.dispatchFinishedWhenDone();
                    }
                }
            }).start();
        }
    }

    @Override
    public RecyclerView.ItemAnimator.ItemHolderInfo recordPreLayoutInformation(RecyclerView.State state, RecyclerView.ViewHolder viewHolder, int i, List list) {
        RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfoRecordPreLayoutInformation = super.recordPreLayoutInformation(state, viewHolder, i, list);
        View view = viewHolder.itemView;
        if (!(view instanceof ChatMessageCell)) {
            return itemHolderInfoRecordPreLayoutInformation;
        }
        ItemHolderInfoExtended itemHolderInfoExtended = new ItemHolderInfoExtended();
        itemHolderInfoExtended.left = itemHolderInfoRecordPreLayoutInformation.left;
        itemHolderInfoExtended.top = itemHolderInfoRecordPreLayoutInformation.top;
        itemHolderInfoExtended.right = itemHolderInfoRecordPreLayoutInformation.right;
        itemHolderInfoExtended.bottom = itemHolderInfoRecordPreLayoutInformation.bottom;
        ChatMessageCell.TransitionParams transitionParams = ((ChatMessageCell) view).getTransitionParams();
        itemHolderInfoExtended.imageX = transitionParams.lastDrawingImageX;
        itemHolderInfoExtended.imageY = transitionParams.lastDrawingImageY;
        itemHolderInfoExtended.imageWidth = transitionParams.lastDrawingImageW;
        itemHolderInfoExtended.imageHeight = transitionParams.lastDrawingImageH;
        return itemHolderInfoExtended;
    }

    @Override
    protected void onAllAnimationsDone() {
        super.onAllAnimationsDone();
        this.recyclerListView.setClipChildren(true);
        while (!this.runOnAnimationsEnd.isEmpty()) {
            ((Runnable) this.runOnAnimationsEnd.remove(0)).run();
        }
        cancelAnimators();
    }

    private void cancelAnimators() {
        ThanosEffect thanosEffect;
        ArrayList<Animator> arrayList = new ArrayList(this.animators.values());
        this.animators.clear();
        for (Animator animator : arrayList) {
            if (animator != null) {
                animator.cancel();
            }
        }
        if (this.thanosViews.isEmpty() || (thanosEffect = (ThanosEffect) this.getThanosEffectContainer.run()) == null) {
            return;
        }
        thanosEffect.kill();
    }

    @Override
    public void endAnimation(RecyclerView.ViewHolder viewHolder) {
        ThanosEffect thanosEffect;
        Animator animator = (Animator) this.animators.remove(viewHolder);
        if (animator != null) {
            animator.cancel();
        }
        if (this.thanosViews.contains(viewHolder.itemView) && (thanosEffect = (ThanosEffect) this.getThanosEffectContainer.run()) != null) {
            thanosEffect.cancel(viewHolder.itemView);
        }
        super.endAnimation(viewHolder);
        restoreTransitionParams(viewHolder.itemView);
    }

    public void restoreTransitionParams(View view) {
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
        } else if (view instanceof ChatActionCell) {
            ((ChatActionCell) view).getTransitionParams().resetAnimation();
        } else {
            view.setTranslationX(0.0f);
        }
    }

    @Override
    public void endAnimations() {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("end animations");
        }
        Iterator it = this.willChangedGroups.iterator();
        while (it.hasNext()) {
            ((MessageObject.GroupedMessages) it.next()).transitionParams.isNewGroup = false;
        }
        this.willChangedGroups.clear();
        cancelAnimators();
        ChatGreetingsView chatGreetingsView = this.chatGreetingsView;
        if (chatGreetingsView != null) {
            chatGreetingsView.stickerToSendView.setAlpha(1.0f);
        }
        this.greetingsSticker = null;
        this.chatGreetingsView = null;
        for (int size = this.mPendingMoves.size() - 1; size >= 0; size--) {
            DefaultItemAnimator.MoveInfo moveInfo = (DefaultItemAnimator.MoveInfo) this.mPendingMoves.get(size);
            restoreTransitionParams(moveInfo.holder.itemView);
            dispatchMoveFinished(moveInfo.holder);
            this.mPendingMoves.remove(size);
        }
        for (int size2 = this.mPendingRemovals.size() - 1; size2 >= 0; size2--) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) this.mPendingRemovals.get(size2);
            restoreTransitionParams(viewHolder.itemView);
            dispatchRemoveFinished(viewHolder);
            this.mPendingRemovals.remove(size2);
        }
        for (int size3 = this.mPendingAdditions.size() - 1; size3 >= 0; size3--) {
            RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) this.mPendingAdditions.get(size3);
            restoreTransitionParams(viewHolder2.itemView);
            dispatchAddFinished(viewHolder2);
            this.mPendingAdditions.remove(size3);
        }
        for (int size4 = this.mPendingChanges.size() - 1; size4 >= 0; size4--) {
            endChangeAnimationIfNecessary((DefaultItemAnimator.ChangeInfo) this.mPendingChanges.get(size4));
        }
        this.mPendingChanges.clear();
        if (isRunning()) {
            for (int size5 = this.mMovesList.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.mMovesList.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    DefaultItemAnimator.MoveInfo moveInfo2 = (DefaultItemAnimator.MoveInfo) arrayList.get(size6);
                    restoreTransitionParams(moveInfo2.holder.itemView);
                    dispatchMoveFinished(moveInfo2.holder);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.mMovesList.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.mAdditionsList.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.mAdditionsList.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.ViewHolder viewHolder3 = (RecyclerView.ViewHolder) arrayList2.get(size8);
                    restoreTransitionParams(viewHolder3.itemView);
                    dispatchAddFinished(viewHolder3);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.mAdditionsList.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.mChangesList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.mChangesList.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    endChangeAnimationIfNecessary((DefaultItemAnimator.ChangeInfo) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.mChangesList.remove(arrayList3);
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
    protected boolean endChangeAnimationIfNecessary(DefaultItemAnimator.ChangeInfo changeInfo, RecyclerView.ViewHolder viewHolder) {
        ThanosEffect thanosEffect;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("end change if necessary");
        }
        Animator animator = (Animator) this.animators.remove(viewHolder);
        if (animator != null) {
            animator.cancel();
        }
        if (this.thanosViews.contains(viewHolder.itemView) && (thanosEffect = (ThanosEffect) this.getThanosEffectContainer.run()) != null) {
            thanosEffect.cancel(viewHolder.itemView);
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

    public void groupWillTransformToSingleMessage(MessageObject.GroupedMessages groupedMessages) {
        this.willRemovedGroup.put(Integer.valueOf(groupedMessages.messages.get(0).getId()), groupedMessages);
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
                        groupedMessages.transitionParams.top = chatMessageCell.getTop() + chatMessageCell.getPaddingTop() + chatMessageCell.getBackgroundDrawableTop();
                        groupedMessages.transitionParams.bottom = chatMessageCell.getTop() + chatMessageCell.getPaddingTop() + chatMessageCell.getBackgroundDrawableBottom();
                        groupedMessages.transitionParams.left = chatMessageCell.getLeft() + chatMessageCell.getBackgroundDrawableLeft();
                        groupedMessages.transitionParams.right = chatMessageCell.getLeft() + chatMessageCell.getBackgroundDrawableRight();
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

    public void animateAddImpl(final RecyclerView.ViewHolder viewHolder) {
        boolean z;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("animate add impl");
        }
        final View view = viewHolder.itemView;
        this.mAddAnimations.add(viewHolder);
        if (viewHolder == this.greetingsSticker) {
            view.setAlpha(1.0f);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        if (view instanceof ChatMessageCell) {
            ChatMessageCell chatMessageCell = (ChatMessageCell) view;
            if (chatMessageCell.getAnimationOffsetX() != 0.0f) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(chatMessageCell, (Property<ChatMessageCell, Float>) chatMessageCell.ANIMATION_OFFSET_X, chatMessageCell.getAnimationOffsetX(), 0.0f));
            }
            chatMessageCell.setPivotX(chatMessageCell.getBackgroundDrawableLeft() + ((chatMessageCell.getBackgroundDrawableRight() - chatMessageCell.getBackgroundDrawableLeft()) / 2.0f));
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
                float x = this.chatGreetingsView.stickerToSendView.getX() + this.chatGreetingsView.getX() + view2.getX();
                float y = this.chatGreetingsView.stickerToSendView.getY() + this.chatGreetingsView.getY() + view2.getY();
                float imageX = chatMessageCell2.getPhotoImage().getImageX() + this.recyclerListView.getX() + chatMessageCell2.getX();
                float imageY = chatMessageCell2.getPhotoImage().getImageY() + this.recyclerListView.getY() + chatMessageCell2.getY();
                final float width = this.chatGreetingsView.stickerToSendView.getWidth();
                final float height = this.chatGreetingsView.stickerToSendView.getHeight();
                final float imageWidth = chatMessageCell2.getPhotoImage().getImageWidth();
                final float imageHeight = chatMessageCell2.getPhotoImage().getImageHeight();
                final float f = x - imageX;
                final float f2 = y - imageY;
                final float imageX2 = chatMessageCell2.getPhotoImage().getImageX();
                final float imageY2 = chatMessageCell2.getPhotoImage().getImageY();
                chatMessageCell2.getTransitionParams().imageChangeBoundsTransition = true;
                chatMessageCell2.getTransitionParams().animateDrawingTimeAlpha = true;
                chatMessageCell2.getPhotoImage().setImageCoords(imageX2 + f, imageX2 + f2, width, height);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ChatListItemAnimator.lambda$animateAddImpl$8(chatMessageCell2, imageX2, f, imageY2, f2, width, imageWidth, height, imageHeight, valueAnimator);
                    }
                });
                valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        chatMessageCell2.getTransitionParams().resetAnimation();
                        chatMessageCell2.getPhotoImage().setImageCoords(imageX2, imageY2, imageWidth, imageHeight);
                        if (ChatListItemAnimator.this.chatGreetingsView != null) {
                            ChatListItemAnimator.this.chatGreetingsView.stickerToSendView.setAlpha(1.0f);
                        }
                        chatMessageCell2.invalidate();
                    }
                });
                animatorSet.play(valueAnimatorOfFloat);
                jMax = jMax;
                z = false;
            } else {
                MessageObject.GroupedMessages currentMessagesGroup = ((ChatMessageCell) view).getCurrentMessagesGroup();
                if (currentMessagesGroup == null) {
                    jMax = jMax;
                } else {
                    Long l = (Long) this.groupIdToEnterDelay.get(Long.valueOf(currentMessagesGroup.groupId));
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
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 1.0f));
            if (z) {
                view.setScaleX(0.9f);
                view.setScaleY(0.9f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, view.getScaleY(), 1.0f));
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, view.getScaleX(), 1.0f));
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
            animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationStart(Animator animator) {
                    ChatListItemAnimator.this.dispatchAddStarting(viewHolder);
                }

                @Override
                public void onAnimationCancel(Animator animator) {
                    view.setAlpha(1.0f);
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    animator.removeAllListeners();
                    view.setAlpha(1.0f);
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                    view.setTranslationY(0.0f);
                    view.setTranslationY(0.0f);
                    if (((DefaultItemAnimator) ChatListItemAnimator.this).mAddAnimations.remove(viewHolder)) {
                        ChatListItemAnimator.this.dispatchAddFinished(viewHolder);
                        ChatListItemAnimator.this.dispatchFinishedWhenDone();
                    }
                }
            });
            this.animators.put(viewHolder, animatorSet);
            animatorSet.start();
        }
        z = true;
        view.setAlpha(0.0f);
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 1.0f));
        if (z) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, view.getScaleY(), 1.0f));
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, view.getScaleX(), 1.0f));
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
        animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationStart(Animator animator) {
                ChatListItemAnimator.this.dispatchAddStarting(viewHolder);
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                view.setAlpha(1.0f);
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                animator.removeAllListeners();
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationY(0.0f);
                view.setTranslationY(0.0f);
                if (((DefaultItemAnimator) ChatListItemAnimator.this).mAddAnimations.remove(viewHolder)) {
                    ChatListItemAnimator.this.dispatchAddFinished(viewHolder);
                    ChatListItemAnimator.this.dispatchFinishedWhenDone();
                }
            }
        });
        this.animators.put(viewHolder, animatorSet);
        animatorSet.start();
    }

    public static void lambda$animateAddImpl$8(ChatMessageCell chatMessageCell, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        chatMessageCell.getTransitionParams().animateChangeProgress = fFloatValue;
        if (chatMessageCell.getTransitionParams().animateChangeProgress > 1.0f) {
            chatMessageCell.getTransitionParams().animateChangeProgress = 1.0f;
        }
        float f9 = 1.0f - fFloatValue;
        chatMessageCell.getPhotoImage().setImageCoords(f + (f2 * f9), f3 + (f4 * f9), (f5 * f9) + (f6 * fFloatValue), (f7 * f9) + (f8 * fFloatValue));
        chatMessageCell.invalidate();
    }

    protected void animateRemoveImpl(final RecyclerView.ViewHolder viewHolder, boolean z) {
        Utilities.Callback0Return callback0Return;
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb = new StringBuilder();
            sb.append("animate remove impl ");
            sb.append(z ? " with thanos" : "");
            FileLog.d(sb.toString());
        }
        final View view = viewHolder.itemView;
        this.mRemoveAnimations.add(viewHolder);
        if (z && (callback0Return = this.getThanosEffectContainer) != null) {
            ThanosEffect thanosEffect = (ThanosEffect) callback0Return.run();
            dispatchRemoveStarting(viewHolder);
            thanosEffect.animate(view, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$animateRemoveImpl$9(view, viewHolder);
                }
            });
            this.thanosViews.add(view);
        } else {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
            dispatchRemoveStarting(viewHolder);
            objectAnimatorOfFloat.setDuration(getRemoveDuration());
            objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    animator.removeAllListeners();
                    view.setAlpha(1.0f);
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    if (((DefaultItemAnimator) ChatListItemAnimator.this).mRemoveAnimations.remove(viewHolder)) {
                        ChatListItemAnimator.this.dispatchRemoveFinished(viewHolder);
                        ChatListItemAnimator.this.dispatchFinishedWhenDone();
                    }
                }
            });
            this.animators.put(viewHolder, objectAnimatorOfFloat);
            objectAnimatorOfFloat.start();
        }
        this.recyclerListView.stopScroll();
    }

    public void lambda$animateRemoveImpl$9(View view, RecyclerView.ViewHolder viewHolder) {
        view.setVisibility(0);
        if (this.mRemoveAnimations.remove(viewHolder)) {
            dispatchRemoveFinished(viewHolder);
            dispatchFinishedWhenDone();
        }
        this.thanosViews.remove(view);
    }

    private void animateRemoveGroupImpl(final ArrayList arrayList) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("animate remove group impl with thanos");
        }
        this.mRemoveAnimations.addAll(arrayList);
        ThanosEffect thanosEffect = (ThanosEffect) this.getThanosEffectContainer.run();
        for (int i = 0; i < arrayList.size(); i++) {
            dispatchRemoveStarting((RecyclerView.ViewHolder) arrayList.get(i));
        }
        final ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(((RecyclerView.ViewHolder) arrayList.get(i2)).itemView);
        }
        thanosEffect.animateGroup(arrayList2, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$animateRemoveGroupImpl$10(arrayList2, arrayList);
            }
        });
        this.thanosViews.add((View) arrayList2.get(0));
        this.recyclerListView.stopScroll();
    }

    public void lambda$animateRemoveGroupImpl$10(ArrayList arrayList, ArrayList arrayList2) {
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

    public void setShouldAnimateEnterFromBottom(boolean z) {
        this.shouldAnimateEnterFromBottom = z;
    }

    public void onDestroy() {
        onAllAnimationsDone();
    }

    public boolean willRemoved(View view) {
        RecyclerView.ViewHolder childViewHolder = this.recyclerListView.getChildViewHolder(view);
        if (childViewHolder != null) {
            return this.mPendingRemovals.contains(childViewHolder) || this.mRemoveAnimations.contains(childViewHolder);
        }
        return false;
    }

    public boolean willAddedFromAlpha(View view) {
        RecyclerView.ViewHolder childViewHolder;
        if (this.shouldAnimateEnterFromBottom || (childViewHolder = this.recyclerListView.getChildViewHolder(view)) == null) {
            return false;
        }
        return this.mPendingAdditions.contains(childViewHolder) || this.mAddAnimations.contains(childViewHolder);
    }

    public void onGreetingStickerTransition(RecyclerView.ViewHolder viewHolder, ChatGreetingsView chatGreetingsView) {
        this.greetingsSticker = viewHolder;
        this.chatGreetingsView = chatGreetingsView;
        this.shouldAnimateEnterFromBottom = false;
    }

    public void setReversePositions(boolean z) {
        this.reversePositions = z;
    }

    class MoveInfoExtended extends DefaultItemAnimator.MoveInfo {
        public boolean animateBackgroundOnly;
        public boolean animateChangeGroupBackground;
        public boolean animateChangeInternal;
        boolean animateImage;
        public boolean animatePinnedBottom;
        boolean animateRemoveGroup;
        int deltaBottom;
        int deltaLeft;
        int deltaRight;
        int deltaTop;
        public int groupOffsetBottom;
        public int groupOffsetLeft;
        public int groupOffsetRight;
        public int groupOffsetTop;
        float imageHeight;
        float imageWidth;
        float imageX;
        float imageY;

        MoveInfoExtended(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
            super(viewHolder, i, i2, i3, i4);
        }
    }

    class ItemHolderInfoExtended extends RecyclerView.ItemAnimator.ItemHolderInfo {
        float imageHeight;
        float imageWidth;
        float imageX;
        float imageY;

        ItemHolderInfoExtended() {
        }
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

    public void setOnSnapMessage(Utilities.Callback0Return callback0Return, Utilities.Callback0Return callback0Return2) {
        this.supportsThanosEffectContainer = callback0Return;
        this.getThanosEffectContainer = callback0Return2;
    }
}
