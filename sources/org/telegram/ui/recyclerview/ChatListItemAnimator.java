package org.telegram.ui.recyclerview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.wearable.zzy;
import com.google.zxing.qrcode.decoder.Version;
import fi.iki.elonen.NanoHTTPD;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BotHelpCell;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.UserInfoCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda47;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatGreetingsView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ThanosEffect;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.PeerStoriesView$40$$ExternalSyntheticLambda1;
import org.telegram.ui.TextMessageEnterTransition;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda4;
import org.telegram.ui.VoiceMessageEnterTransition;
import org.telegram.ui.iv.RichBlockInset$$ExternalSyntheticLambda0;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda6;

public abstract class ChatListItemAnimator extends DefaultItemAnimator {
    public static final CubicBezierInterpolator DEFAULT_INTERPOLATOR = new CubicBezierInterpolator(0.19919472913616398d, 0.010644531250000006d, 0.27920937042459737d, 0.91025390625d);
    public final ChatActivity activity;
    public ChatGreetingsView chatGreetingsView;
    public ChatActivity$$ExternalSyntheticLambda47 getThanosEffectContainer;
    public RecyclerView.ViewHolder greetingsSticker;
    public final RecyclerListView recyclerListView;
    public final Theme.ResourcesProvider resourcesProvider;
    public boolean reversePositions;
    public boolean shouldAnimateEnterFromBottom;
    public ChatActivity$$ExternalSyntheticLambda47 supportsThanosEffectContainer;
    public final HashMap willRemovedGroup = new HashMap();
    public final ArrayList willChangedGroups = new ArrayList();
    public final HashMap animators = new HashMap();
    public final ArrayList thanosViews = new ArrayList();
    public final ArrayList runOnAnimationsEnd = new ArrayList();
    public final HashMap groupIdToEnterDelay = new HashMap();
    public final ArrayList toBeSnapped = new ArrayList();

    public final class ItemHolderInfoExtended extends Version.ECB {
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
        this.mSupportsChangeAnimations = false;
    }

    @Override
    public final void animateAdd(RecyclerView.ViewHolder viewHolder) {
        resetAnimation(viewHolder);
        View view = viewHolder.itemView;
        view.setAlpha(0.0f);
        if (!this.shouldAnimateEnterFromBottom) {
            view.setScaleX(0.9f);
            view.setScaleY(0.9f);
        } else if (view instanceof ChatMessageCell) {
            ((ChatMessageCell) view).getTransitionParams().messageEntering = true;
        }
        this.mPendingAdditions.add(viewHolder);
    }

    @Override
    public final boolean animateAppearance(RecyclerView.ViewHolder viewHolder, Version.ECB ecb, Version.ECB ecb2) {
        ArrayList arrayList;
        int height;
        boolean zAnimateAppearance = super.animateAppearance(viewHolder, ecb, ecb2);
        if (zAnimateAppearance && this.shouldAnimateEnterFromBottom) {
            int i = 0;
            boolean z = false;
            while (true) {
                arrayList = this.mPendingAdditions;
                if (i >= arrayList.size()) {
                    break;
                }
                if (((RecyclerView.ViewHolder) arrayList.get(i)).getLayoutPosition() == 0) {
                    z = true;
                }
                i++;
            }
            if (z) {
                height = 0;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    height += ((RecyclerView.ViewHolder) arrayList.get(i2)).itemView.getHeight();
                }
            } else {
                height = 0;
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((RecyclerView.ViewHolder) arrayList.get(i3)).itemView.setTranslationY(height);
            }
        }
        return zAnimateAppearance;
    }

    @Override
    public final boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, Version.ECB ecb, int i, int i2, int i3, int i4) {
        if (viewHolder == viewHolder2) {
            return animateMove(viewHolder, ecb, i, i2, i3, i4);
        }
        View view = viewHolder.itemView;
        float animationOffsetX = view instanceof ChatMessageCell ? ((ChatMessageCell) view).getAnimationOffsetX() : view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        resetAnimation(viewHolder);
        int i5 = (int) ((i3 - i) - animationOffsetX);
        int i6 = (int) ((i4 - i2) - translationY);
        if (view instanceof ChatMessageCell) {
            ((ChatMessageCell) view).setAnimationOffsetX(animationOffsetX);
        } else {
            view.setTranslationX(animationOffsetX);
        }
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        resetAnimation(viewHolder2);
        View view2 = viewHolder2.itemView;
        if (view2 instanceof ChatMessageCell) {
            ((ChatMessageCell) view2).setAnimationOffsetX(-i5);
        } else {
            view2.setTranslationX(-i5);
        }
        view2.setTranslationY(-i6);
        view2.setAlpha(0.0f);
        this.mPendingChanges.add(new DefaultItemAnimator.ChangeInfo(viewHolder, viewHolder2, i, i2, i3, i4));
        checkIsRunning();
        return true;
    }

    @Override
    public final void animateChangeImpl(DefaultItemAnimator.ChangeInfo changeInfo) {
        final DefaultItemAnimator.ChangeInfo changeInfo2;
        RecyclerView.ViewHolder viewHolder = changeInfo.oldHolder;
        final View view = viewHolder == null ? null : viewHolder.itemView;
        RecyclerView.ViewHolder viewHolder2 = changeInfo.newHolder;
        final View view2 = viewHolder2 != null ? viewHolder2.itemView : null;
        ArrayList arrayList = this.mChangeAnimations;
        if (view != null) {
            final ViewPropertyAnimator duration = view.animate().setDuration(250L);
            arrayList.add(changeInfo.oldHolder);
            duration.translationX(changeInfo.toX - changeInfo.fromX);
            duration.translationY(changeInfo.toY - changeInfo.fromY);
            final int i = 0;
            changeInfo2 = changeInfo;
            duration.alpha(0.0f).setListener(new AnimatorListenerAdapter(this) {
                public final ChatListItemAnimator this$0;

                {
                    this.this$0 = this;
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
                            ChatListItemAnimator chatListItemAnimator = this.this$0;
                            ArrayList arrayList2 = chatListItemAnimator.mChangeAnimations;
                            DefaultItemAnimator.ChangeInfo changeInfo3 = changeInfo2;
                            if (arrayList2.remove(changeInfo3.oldHolder)) {
                                chatListItemAnimator.dispatchAnimationFinished(changeInfo3.oldHolder);
                                chatListItemAnimator.dispatchFinishedWhenDone();
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
                            ChatListItemAnimator chatListItemAnimator2 = this.this$0;
                            ArrayList arrayList3 = chatListItemAnimator2.mChangeAnimations;
                            DefaultItemAnimator.ChangeInfo changeInfo4 = changeInfo2;
                            if (arrayList3.remove(changeInfo4.newHolder)) {
                                chatListItemAnimator2.dispatchAnimationFinished(changeInfo4.newHolder);
                                chatListItemAnimator2.dispatchFinishedWhenDone();
                            }
                            break;
                    }
                }

                @Override
                public final void onAnimationStart(Animator animator) {
                    switch (i) {
                        case 0:
                            RecyclerView.ViewHolder viewHolder3 = changeInfo2.oldHolder;
                            this.this$0.getClass();
                            break;
                        default:
                            RecyclerView.ViewHolder viewHolder4 = changeInfo2.newHolder;
                            this.this$0.getClass();
                            break;
                    }
                }
            }).start();
        } else {
            changeInfo2 = changeInfo;
        }
        if (view2 != null) {
            final ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            arrayList.add(changeInfo2.newHolder);
            final int i2 = 1;
            final DefaultItemAnimator.ChangeInfo changeInfo3 = changeInfo2;
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new AnimatorListenerAdapter(this) {
                public final ChatListItemAnimator this$0;

                {
                    this.this$0 = this;
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
                            ChatListItemAnimator chatListItemAnimator = this.this$0;
                            ArrayList arrayList2 = chatListItemAnimator.mChangeAnimations;
                            DefaultItemAnimator.ChangeInfo changeInfo4 = changeInfo3;
                            if (arrayList2.remove(changeInfo4.oldHolder)) {
                                chatListItemAnimator.dispatchAnimationFinished(changeInfo4.oldHolder);
                                chatListItemAnimator.dispatchFinishedWhenDone();
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
                            ChatListItemAnimator chatListItemAnimator2 = this.this$0;
                            ArrayList arrayList3 = chatListItemAnimator2.mChangeAnimations;
                            DefaultItemAnimator.ChangeInfo changeInfo5 = changeInfo3;
                            if (arrayList3.remove(changeInfo5.newHolder)) {
                                chatListItemAnimator2.dispatchAnimationFinished(changeInfo5.newHolder);
                                chatListItemAnimator2.dispatchFinishedWhenDone();
                            }
                            break;
                    }
                }

                @Override
                public final void onAnimationStart(Animator animator) {
                    switch (i2) {
                        case 0:
                            RecyclerView.ViewHolder viewHolder3 = changeInfo3.oldHolder;
                            this.this$0.getClass();
                            break;
                        default:
                            RecyclerView.ViewHolder viewHolder4 = changeInfo3.newHolder;
                            this.this$0.getClass();
                            break;
                    }
                }
            }).start();
        }
    }

    @Override
    public final boolean animateMove(RecyclerView.ViewHolder viewHolder, Version.ECB ecb, int i, int i2, int i3, int i4) {
        int translationX;
        int topMediaOffset;
        ChatMessageCell chatMessageCell;
        ChatActionCell chatActionCell;
        float f;
        float imageY;
        float imageWidth;
        float f2;
        float imageHeight;
        int i5;
        float f3;
        boolean z;
        MessageObject.GroupedMessages groupedMessages;
        int i6;
        int[] iArr;
        View view = viewHolder.itemView;
        if (view instanceof ChatMessageCell) {
            ChatMessageCell chatMessageCell2 = (ChatMessageCell) view;
            translationX = i + ((int) chatMessageCell2.getAnimationOffsetX());
            topMediaOffset = chatMessageCell2.getTransitionParams().lastTopOffset != chatMessageCell2.getTopMediaOffset() ? (chatMessageCell2.getTransitionParams().lastTopOffset - chatMessageCell2.getTopMediaOffset()) + i2 : i2;
            chatMessageCell = chatMessageCell2;
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
        int i7 = translationX;
        View view2 = viewHolder.itemView;
        int translationY = topMediaOffset + ((int) view2.getTranslationY());
        int[] iArr2 = new int[4];
        if (chatMessageCell != null) {
            float imageX = chatMessageCell.getPhotoImage().getImageX();
            imageY = chatMessageCell.getPhotoImage().getImageY();
            imageWidth = chatMessageCell.getPhotoImage().getImageWidth();
            imageHeight = chatMessageCell.getPhotoImage().getImageHeight();
            f = 0.0f;
            for (int i8 = 0; i8 < 4; i8++) {
                iArr2[i8] = chatMessageCell.getPhotoImage().getRoundRadius()[i8];
            }
            f2 = imageX;
        } else {
            f = 0.0f;
            imageY = 0.0f;
            imageWidth = 0.0f;
            f2 = 0.0f;
            imageHeight = 0.0f;
        }
        resetAnimation(viewHolder);
        int i9 = i3 - i7;
        int i10 = i4 - translationY;
        if (i10 != 0) {
            view.setTranslationY(-i10);
        }
        int i11 = i9;
        float f4 = imageHeight;
        float f5 = imageY;
        ChatActionCell chatActionCell2 = chatActionCell;
        float f6 = imageWidth;
        MoveInfoExtended moveInfoExtended = new MoveInfoExtended(viewHolder, i7, translationY, i3, i4);
        if (chatMessageCell != null) {
            ChatMessageCell.TransitionParams transitionParams = chatMessageCell.getTransitionParams();
            transitionParams.getClass();
            MessageObject.GroupedMessages currentMessagesGroup = chatMessageCell.getCurrentMessagesGroup();
            if (i11 != 0) {
                chatMessageCell.setAnimationOffsetX(-i11);
            }
            boolean z2 = ecb instanceof ItemHolderInfoExtended;
            RecyclerListView recyclerListView = this.recyclerListView;
            if (z2) {
                ImageReceiver photoImage = chatMessageCell.getPhotoImage();
                ItemHolderInfoExtended itemHolderInfoExtended = (ItemHolderInfoExtended) ecb;
                boolean z3 = (!transitionParams.wasDraw || itemHolderInfoExtended.imageHeight == f || itemHolderInfoExtended.imageWidth == f) ? false : true;
                moveInfoExtended.animateImage = z3;
                if (z3) {
                    recyclerListView.setClipChildren(false);
                    recyclerListView.invalidate();
                    transitionParams.imageChangeBoundsTransition = true;
                    if (chatMessageCell.getMessageObject().isRoundVideo()) {
                        transitionParams.animateToImageX = f2;
                        transitionParams.animateToImageY = f5;
                        transitionParams.animateToImageW = f6;
                        transitionParams.animateToImageH = f4;
                        transitionParams.animateToRadius = iArr2;
                    } else {
                        transitionParams.animateToImageX = photoImage.getImageX();
                        transitionParams.animateToImageY = photoImage.getImageY();
                        transitionParams.animateToImageW = photoImage.getImageWidth();
                        transitionParams.animateToImageH = photoImage.getImageHeight();
                        transitionParams.animateToRadius = photoImage.getRoundRadius();
                    }
                    transitionParams.animateRadius = false;
                    int i12 = 0;
                    while (true) {
                        iArr = transitionParams.imageRoundRadius;
                        if (i12 >= 4) {
                            break;
                        }
                        if (iArr[i12] != transitionParams.animateToRadius[i12]) {
                            transitionParams.animateRadius = true;
                            break;
                        }
                        i12++;
                    }
                    float f7 = transitionParams.animateToImageX;
                    float f8 = itemHolderInfoExtended.imageX;
                    if (f7 == f8 && transitionParams.animateToImageY == itemHolderInfoExtended.imageY && transitionParams.animateToImageH == itemHolderInfoExtended.imageHeight && transitionParams.animateToImageW == itemHolderInfoExtended.imageWidth && !transitionParams.animateRadius) {
                        transitionParams.imageChangeBoundsTransition = false;
                        moveInfoExtended.animateImage = false;
                    } else {
                        moveInfoExtended.imageX = f8;
                        moveInfoExtended.imageY = itemHolderInfoExtended.imageY;
                        moveInfoExtended.imageWidth = itemHolderInfoExtended.imageWidth;
                        moveInfoExtended.imageHeight = itemHolderInfoExtended.imageHeight;
                        if (currentMessagesGroup != null) {
                            boolean z4 = currentMessagesGroup.hasCaption;
                            MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                            boolean z5 = transitionParams2.drawCaptionLayout;
                            if (z4 != z5) {
                                transitionParams2.captionEnterProgress = z5 ? 1.0f : 0.0f;
                            }
                        }
                        if (transitionParams.animateRadius) {
                            if (transitionParams.animateToRadius == photoImage.getRoundRadius()) {
                                transitionParams.animateToRadius = new int[4];
                                for (int i13 = 0; i13 < 4; i13++) {
                                    transitionParams.animateToRadius[i13] = photoImage.getRoundRadius()[i13];
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
                        recyclerListView.setClipChildren(false);
                        recyclerListView.invalidate();
                    }
                }
            }
            if (currentMessagesGroup != null) {
                ArrayList arrayList = this.willChangedGroups;
                if (arrayList.contains(currentMessagesGroup)) {
                    arrayList.remove(currentMessagesGroup);
                    RecyclerListView recyclerListView2 = (RecyclerListView) view2.getParent();
                    MessageObject.GroupedMessages.TransitionParams transitionParams3 = currentMessagesGroup.transitionParams;
                    int i14 = 0;
                    int i15 = 0;
                    int i16 = 0;
                    int i17 = 0;
                    int i18 = 0;
                    boolean z6 = true;
                    while (i14 < recyclerListView2.getChildCount()) {
                        View childAt = recyclerListView2.getChildAt(i14);
                        int i19 = i14;
                        if (childAt instanceof ChatMessageCell) {
                            ChatMessageCell chatMessageCell3 = (ChatMessageCell) childAt;
                            if (chatMessageCell3.getCurrentMessagesGroup() != currentMessagesGroup || chatMessageCell3.getMessageObject().deleted) {
                                groupedMessages = currentMessagesGroup;
                                i6 = i11;
                            } else {
                                int backgroundDrawableLeft = chatMessageCell3.getBackgroundDrawableLeft() + chatMessageCell3.getLeft();
                                int backgroundDrawableRight = chatMessageCell3.getBackgroundDrawableRight() + chatMessageCell3.getLeft();
                                groupedMessages = currentMessagesGroup;
                                int backgroundDrawableTop = chatMessageCell3.getBackgroundDrawableTop() + chatMessageCell3.getPaddingTop() + chatMessageCell3.getTop();
                                i6 = i11;
                                int backgroundDrawableBottom = chatMessageCell3.getBackgroundDrawableBottom() + chatMessageCell3.getPaddingTop() + chatMessageCell3.getTop();
                                if (i17 == 0 || backgroundDrawableLeft < i17) {
                                    i17 = backgroundDrawableLeft;
                                }
                                if (i18 == 0 || backgroundDrawableRight > i18) {
                                    i18 = backgroundDrawableRight;
                                }
                                if (chatMessageCell3.getTransitionParams().wasDraw || transitionParams3.isNewGroup) {
                                    if (i15 == 0 || backgroundDrawableTop < i15) {
                                        i15 = backgroundDrawableTop;
                                    }
                                    if (i16 == 0 || backgroundDrawableBottom > i16) {
                                        i16 = backgroundDrawableBottom;
                                    }
                                    z6 = false;
                                }
                            }
                        } else {
                            groupedMessages = currentMessagesGroup;
                            i6 = i11;
                        }
                        i14 = i19 + 1;
                        currentMessagesGroup = groupedMessages;
                        i11 = i6;
                    }
                    i5 = i11;
                    transitionParams3.isNewGroup = false;
                    if (i15 == 0 && i16 == 0 && i17 == 0 && i18 == 0) {
                        moveInfoExtended.animateChangeGroupBackground = false;
                        transitionParams3.backgroundChangeBounds = false;
                    } else {
                        int i20 = (-i15) + transitionParams3.top;
                        moveInfoExtended.groupOffsetTop = i20;
                        int i21 = (-i16) + transitionParams3.bottom;
                        moveInfoExtended.groupOffsetBottom = i21;
                        int i22 = (-i17) + transitionParams3.left;
                        moveInfoExtended.groupOffsetLeft = i22;
                        int i23 = (-i18) + transitionParams3.right;
                        moveInfoExtended.groupOffsetRight = i23;
                        moveInfoExtended.animateChangeGroupBackground = true;
                        transitionParams3.backgroundChangeBounds = true;
                        transitionParams3.offsetTop = i20;
                        transitionParams3.offsetBottom = i21;
                        transitionParams3.offsetLeft = i22;
                        transitionParams3.offsetRight = i23;
                        transitionParams3.captionEnterProgress = transitionParams3.drawCaptionLayout ? 1.0f : 0.0f;
                        recyclerListView2.setClipChildren(false);
                        recyclerListView2.invalidate();
                    }
                    transitionParams3.drawBackgroundForDeletedItems = z6;
                } else {
                    i5 = i11;
                }
            } else {
                i5 = i11;
            }
            HashMap map = this.willRemovedGroup;
            MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) map.get(Integer.valueOf(chatMessageCell.getMessageObject().getId()));
            if (groupedMessages2 != null) {
                MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                map.remove(Integer.valueOf(chatMessageCell.getMessageObject().getId()));
                if (transitionParams.wasDraw) {
                    int backgroundDrawableLeft2 = chatMessageCell.getBackgroundDrawableLeft() + chatMessageCell.getLeft();
                    int backgroundDrawableRight2 = chatMessageCell.getBackgroundDrawableRight() + chatMessageCell.getLeft();
                    int backgroundDrawableTop2 = chatMessageCell.getBackgroundDrawableTop() + chatMessageCell.getPaddingTop() + chatMessageCell.getTop();
                    int backgroundDrawableBottom2 = chatMessageCell.getBackgroundDrawableBottom() + chatMessageCell.getPaddingTop() + chatMessageCell.getTop();
                    moveInfoExtended.animateRemoveGroup = true;
                    transitionParams.animateBackgroundBoundsInner = true;
                    int i24 = backgroundDrawableLeft2 - transitionParams4.left;
                    moveInfoExtended.deltaLeft = i24;
                    moveInfoExtended.deltaRight = backgroundDrawableRight2 - transitionParams4.right;
                    moveInfoExtended.deltaTop = backgroundDrawableTop2 - transitionParams4.top;
                    moveInfoExtended.deltaBottom = backgroundDrawableBottom2 - transitionParams4.bottom;
                    moveInfoExtended.animateBackgroundOnly = false;
                    transitionParams.deltaLeft = (int) ((-i24) - chatMessageCell.getAnimationOffsetX());
                    transitionParams.deltaRight = (int) ((-moveInfoExtended.deltaRight) - chatMessageCell.getAnimationOffsetX());
                    transitionParams.deltaTop = (int) ((-moveInfoExtended.deltaTop) - chatMessageCell.getTranslationY());
                    transitionParams.deltaBottom = (int) ((-moveInfoExtended.deltaBottom) - chatMessageCell.getTranslationY());
                    transitionParams.transformGroupToSingleMessage = true;
                    recyclerListView.setClipChildren(false);
                    recyclerListView.invalidate();
                } else {
                    transitionParams4.drawBackgroundForDeletedItems = true;
                }
            }
            MessageObject.GroupedMessagePosition groupedMessagePosition = chatMessageCell.currentPosition;
            if (transitionParams.drawPinnedBottomBackground != (chatMessageCell.mediaBackground || chatMessageCell.drawPinnedBottom || (groupedMessagePosition != null && (groupedMessagePosition.flags & 8) == 0 && chatMessageCell.currentMessagesGroup.isDocuments))) {
                z = true;
                moveInfoExtended.animatePinnedBottom = true;
                f3 = 0.0f;
                transitionParams.changePinnedBottomProgress = 0.0f;
            } else {
                f3 = 0.0f;
                z = true;
            }
            boolean zAnimateChange = transitionParams.animateChange();
            moveInfoExtended.animateChangeInternal = zAnimateChange;
            if (zAnimateChange) {
                transitionParams.animateChange = z;
                transitionParams.animateChangeProgress = f3;
            }
            if (i5 == 0 && i10 == 0 && !moveInfoExtended.animateImage && !moveInfoExtended.animateRemoveGroup && !moveInfoExtended.animateChangeGroupBackground && !moveInfoExtended.animatePinnedBottom && !moveInfoExtended.animateBackgroundOnly && !zAnimateChange) {
                dispatchAnimationFinished(viewHolder);
                return false;
            }
        } else if (chatActionCell2 != null) {
            ChatActionCell.TransitionParams transitionParams5 = chatActionCell2.getTransitionParams();
            transitionParams5.getClass();
            if (i11 != 0) {
                view.setTranslationX(-i11);
            }
            boolean zAnimateChange2 = !transitionParams5.wasDraw ? false : ChatActionCell.this.reactionsLayoutInBubble.animateChange();
            moveInfoExtended.animateChangeInternal = zAnimateChange2;
            if (zAnimateChange2) {
                transitionParams5.animateChange = true;
                transitionParams5.animateChangeProgress = 0.0f;
            }
            if (i11 == 0 && i10 == 0 && !zAnimateChange2) {
                dispatchAnimationFinished(viewHolder);
                return false;
            }
        } else if (view2 instanceof BotHelpCell) {
            ((BotHelpCell) view2).setAnimating(true);
        } else if (view2 instanceof UserInfoCell) {
            ((UserInfoCell) view2).setAnimating(true);
        } else {
            if (i11 == 0 && i10 == 0) {
                dispatchAnimationFinished(viewHolder);
                return false;
            }
            if (i11 != 0) {
                view.setTranslationX(-i11);
            }
        }
        this.mPendingMoves.add(moveInfoExtended);
        checkIsRunning();
        return true;
    }

    @Override
    public final void animateMoveImpl(RecyclerView.ViewHolder viewHolder, DefaultItemAnimator.MoveInfo moveInfo) {
        animateMoveImpl(viewHolder, moveInfo, false);
    }

    @Override
    public final void animateRemove(RecyclerView.ViewHolder viewHolder, Version.ECB ecb) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("animate remove");
        }
        resetAnimation(viewHolder);
        this.mPendingRemovals.add(viewHolder);
        checkIsRunning();
        if (ecb != null) {
            int i = ecb.dataCodewords;
            View view = viewHolder.itemView;
            int top = view.getTop();
            int left = view.getLeft() - ecb.count;
            int i2 = top - i;
            if (i2 != 0) {
                view.setTranslationY(-i2);
            }
            if (!(view instanceof ChatMessageCell)) {
                if (left != 0) {
                    view.setTranslationX(-left);
                    return;
                }
                return;
            }
            ChatMessageCell chatMessageCell = (ChatMessageCell) view;
            if (left != 0) {
                chatMessageCell.setAnimationOffsetX(-left);
            }
            if (ecb instanceof ItemHolderInfoExtended) {
                ItemHolderInfoExtended itemHolderInfoExtended = (ItemHolderInfoExtended) ecb;
                chatMessageCell.setImageCoords(itemHolderInfoExtended.imageX, itemHolderInfoExtended.imageY, itemHolderInfoExtended.imageWidth, itemHolderInfoExtended.imageHeight);
            }
        }
    }

    public final void cancelAnimators() {
        ThanosEffect thanosEffect;
        HashMap map = this.animators;
        ArrayList arrayList = new ArrayList(map.values());
        map.clear();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Animator animator = (Animator) obj;
            if (animator != null) {
                animator.cancel();
            }
        }
        if (this.thanosViews.isEmpty() || (thanosEffect = (ThanosEffect) this.getThanosEffectContainer.run()) == null || thanosEffect.destroyed) {
            return;
        }
        thanosEffect.destroyed = true;
        ArrayList arrayList2 = thanosEffect.toSet;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            ThanosEffect.ToSet toSet = (ThanosEffect.ToSet) obj2;
            Runnable runnable = toSet.doneCallback;
            if (runnable != null) {
                ThanosEffect.ensureRunOnUIThread(runnable);
                toSet.doneCallback = null;
            }
        }
        arrayList2.clear();
        ThanosEffect.DrawingThread drawingThread = thanosEffect.drawThread;
        if (drawingThread != null) {
            drawingThread.kill();
        }
        Runnable runnable2 = thanosEffect.whenDone;
        if (runnable2 != null) {
            thanosEffect.whenDone = null;
            ThanosEffect.ensureRunOnUIThread(runnable2);
        }
    }

    @Override
    public final void endAnimation(RecyclerView.ViewHolder viewHolder) {
        ThanosEffect thanosEffect;
        Animator animator = (Animator) this.animators.remove(viewHolder);
        if (animator != null) {
            animator.cancel();
        }
        boolean zContains = this.thanosViews.contains(viewHolder.itemView);
        View view = viewHolder.itemView;
        if (zContains && (thanosEffect = (ThanosEffect) this.getThanosEffectContainer.run()) != null) {
            thanosEffect.cancel(view);
        }
        super.endAnimation(viewHolder);
        restoreTransitionParams(view);
    }

    @Override
    public void endAnimations() {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("end animations");
        }
        ArrayList arrayList = this.willChangedGroups;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((MessageObject.GroupedMessages) obj).transitionParams.isNewGroup = false;
        }
        arrayList.clear();
        cancelAnimators();
        ChatGreetingsView chatGreetingsView = this.chatGreetingsView;
        if (chatGreetingsView != null) {
            chatGreetingsView.stickerToSendView.setAlpha(1.0f);
        }
        this.greetingsSticker = null;
        this.chatGreetingsView = null;
        ArrayList arrayList2 = this.mPendingMoves;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            DefaultItemAnimator.MoveInfo moveInfo = (DefaultItemAnimator.MoveInfo) arrayList2.get(size2);
            restoreTransitionParams(moveInfo.holder.itemView);
            dispatchAnimationFinished(moveInfo.holder);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.mPendingRemovals;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) arrayList3.get(size3);
            restoreTransitionParams(viewHolder.itemView);
            dispatchAnimationFinished(viewHolder);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.mPendingAdditions;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) arrayList4.get(size4);
            restoreTransitionParams(viewHolder2.itemView);
            dispatchAnimationFinished(viewHolder2);
            arrayList4.remove(size4);
        }
        ArrayList arrayList5 = this.mPendingChanges;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            endChangeAnimationIfNecessary((DefaultItemAnimator.ChangeInfo) arrayList5.get(size5));
        }
        arrayList5.clear();
        if (isRunning()) {
            ArrayList arrayList6 = this.mMovesList;
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                ArrayList arrayList7 = (ArrayList) arrayList6.get(size6);
                for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                    DefaultItemAnimator.MoveInfo moveInfo2 = (DefaultItemAnimator.MoveInfo) arrayList7.get(size7);
                    restoreTransitionParams(moveInfo2.holder.itemView);
                    dispatchAnimationFinished(moveInfo2.holder);
                    arrayList7.remove(size7);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(arrayList7);
                    }
                }
            }
            ArrayList arrayList8 = this.mAdditionsList;
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                ArrayList arrayList9 = (ArrayList) arrayList8.get(size8);
                for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                    RecyclerView.ViewHolder viewHolder3 = (RecyclerView.ViewHolder) arrayList9.get(size9);
                    restoreTransitionParams(viewHolder3.itemView);
                    dispatchAnimationFinished(viewHolder3);
                    arrayList9.remove(size9);
                    if (arrayList9.isEmpty()) {
                        arrayList8.remove(arrayList9);
                    }
                }
            }
            ArrayList arrayList10 = this.mChangesList;
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                ArrayList arrayList11 = (ArrayList) arrayList10.get(size10);
                for (int size11 = arrayList11.size() - 1; size11 >= 0; size11--) {
                    endChangeAnimationIfNecessary((DefaultItemAnimator.ChangeInfo) arrayList11.get(size11));
                    if (arrayList11.isEmpty()) {
                        arrayList10.remove(arrayList11);
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
    public final boolean endChangeAnimationIfNecessary(DefaultItemAnimator.ChangeInfo changeInfo, RecyclerView.ViewHolder viewHolder) {
        ThanosEffect thanosEffect;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("end change if necessary");
        }
        Animator animator = (Animator) this.animators.remove(viewHolder);
        if (animator != null) {
            animator.cancel();
        }
        boolean zContains = this.thanosViews.contains(viewHolder.itemView);
        View view = viewHolder.itemView;
        if (zContains && (thanosEffect = (ThanosEffect) this.getThanosEffectContainer.run()) != null) {
            thanosEffect.cancel(view);
        }
        if (changeInfo.newHolder == viewHolder) {
            changeInfo.newHolder = null;
        } else {
            if (changeInfo.oldHolder != viewHolder) {
                return false;
            }
            changeInfo.oldHolder = null;
        }
        restoreTransitionParams(view);
        dispatchAnimationFinished(viewHolder);
        return true;
    }

    @Override
    public final long getChangeDuration() {
        return 250L;
    }

    @Override
    public final long getMoveAnimationDelay() {
        return 0L;
    }

    @Override
    public final long getMoveDuration() {
        return 250L;
    }

    public final void groupWillChanged(MessageObject.GroupedMessages groupedMessages) {
        if (groupedMessages == null) {
            return;
        }
        if (groupedMessages.messages.size() == 0) {
            groupedMessages.transitionParams.drawBackgroundForDeletedItems = true;
            return;
        }
        MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
        if (transitionParams.top == 0 && transitionParams.bottom == 0 && transitionParams.left == 0 && transitionParams.right == 0) {
            RecyclerListView recyclerListView = this.recyclerListView;
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerListView.getChildAt(i);
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

    @Override
    public void onAllAnimationsDone() {
        this.recyclerListView.setClipChildren(true);
        while (true) {
            ArrayList arrayList = this.runOnAnimationsEnd;
            if (arrayList.isEmpty()) {
                cancelAnimators();
                return;
            }
            ((Runnable) arrayList.remove(0)).run();
        }
    }

    public abstract void onAnimationStart();

    @Override
    public final Version.ECB recordPreLayoutInformation(RecyclerView.State state, RecyclerView.ViewHolder viewHolder, int i, List list) {
        Version.ECB ecbRecordPreLayoutInformation = super.recordPreLayoutInformation(state, viewHolder, i, list);
        View view = viewHolder.itemView;
        if (!(view instanceof ChatMessageCell)) {
            return ecbRecordPreLayoutInformation;
        }
        ItemHolderInfoExtended itemHolderInfoExtended = new ItemHolderInfoExtended();
        itemHolderInfoExtended.count = ecbRecordPreLayoutInformation.count;
        itemHolderInfoExtended.dataCodewords = ecbRecordPreLayoutInformation.dataCodewords;
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
        boolean z = view instanceof BotHelpCell;
        RecyclerListView recyclerListView = this.recyclerListView;
        if (z) {
            int measuredHeight = (recyclerListView.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
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
            int measuredHeight2 = (recyclerListView.getMeasuredHeight() / 2) - (view.getMeasuredHeight() / 2);
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

    @Override
    public final void runPendingAnimations() throws IllegalAccessException, InvocationTargetException {
        boolean z;
        boolean z2;
        boolean z3;
        RecyclerListView recyclerListView;
        ArrayList arrayList;
        long j;
        boolean z4;
        int size;
        boolean z5;
        int i;
        HashMap map;
        boolean z6;
        ArrayList arrayList2;
        int size2;
        int i2;
        final RecyclerView.ViewHolder viewHolder;
        final View view;
        AnimatorSet animatorSet;
        float f;
        long jMax;
        RecyclerListView recyclerListView2;
        boolean z7;
        MessageObject.GroupedMessages currentMessagesGroup;
        HashMap map2;
        Long l;
        ChatGreetingsView chatGreetingsView;
        ChatMessageCell chatMessageCell;
        zzy zzyVar;
        NanoHTTPD.ServerRunnable serverRunnable;
        final RecyclerView.ViewHolder viewHolder2;
        boolean z8;
        final View view2;
        ChatActivity$$ExternalSyntheticLambda47 chatActivity$$ExternalSyntheticLambda47;
        String str;
        MessageObject.GroupedMessages currentMessagesGroup2;
        boolean z9;
        boolean z10;
        MessageObject messageObject;
        ChatActivity$$ExternalSyntheticLambda47 chatActivity$$ExternalSyntheticLambda48;
        ArrayList arrayList3;
        boolean z11;
        ChatActivity chatActivity;
        ChatActivity.AnonymousClass39 anonymousClass39;
        Runnable runnable;
        ChatAttachAlert.AnonymousClass25 anonymousClass25;
        ArrayList arrayList4 = this.mPendingRemovals;
        boolean zIsEmpty = arrayList4.isEmpty();
        ArrayList arrayList5 = this.mPendingMoves;
        boolean zIsEmpty2 = arrayList5.isEmpty();
        ArrayList arrayList6 = this.mPendingChanges;
        boolean zIsEmpty3 = arrayList6.isEmpty();
        ArrayList arrayList7 = this.mPendingAdditions;
        boolean zIsEmpty4 = arrayList7.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        boolean z12 = this.shouldAnimateEnterFromBottom;
        RecyclerListView recyclerListView3 = this.recyclerListView;
        if (z12) {
            z = false;
            for (int i3 = 0; i3 < arrayList7.size(); i3++) {
                if (this.reversePositions) {
                    if (((RecyclerView.ViewHolder) arrayList7.get(i3)).getLayoutPosition() == (recyclerListView3.getAdapter() == null ? 0 : recyclerListView3.getAdapter().getItemCount()) - 1) {
                        z = true;
                    }
                } else if (((RecyclerView.ViewHolder) arrayList7.get(i3)).getLayoutPosition() == 0) {
                    z = true;
                }
            }
        } else {
            z = false;
        }
        onAnimationStart();
        ArrayList arrayList8 = this.mAddAnimations;
        float f2 = 1.0f;
        if (z) {
            boolean zIsEmpty5 = arrayList4.isEmpty();
            boolean zIsEmpty6 = arrayList5.isEmpty();
            boolean zIsEmpty7 = arrayList6.isEmpty();
            boolean zIsEmpty8 = arrayList7.isEmpty();
            if (!zIsEmpty5 || !zIsEmpty6 || !zIsEmpty8 || !zIsEmpty7) {
                int height = 0;
                for (int i4 = 0; i4 < arrayList7.size(); i4++) {
                    View view3 = ((RecyclerView.ViewHolder) arrayList7.get(i4)).itemView;
                    if (view3 instanceof ChatMessageCell) {
                        ChatMessageCell chatMessageCell2 = (ChatMessageCell) view3;
                        if (chatMessageCell2.getCurrentPosition() == null || (chatMessageCell2.getCurrentPosition().flags & 1) != 0) {
                            height += ((RecyclerView.ViewHolder) arrayList7.get(i4)).itemView.getHeight();
                        }
                    } else {
                        height += ((RecyclerView.ViewHolder) arrayList7.get(i4)).itemView.getHeight();
                    }
                }
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj = arrayList4.get(i5);
                    i5++;
                    animateRemoveImpl$1((RecyclerView.ViewHolder) obj);
                }
                arrayList4.clear();
                if (!zIsEmpty6) {
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.addAll(arrayList5);
                    arrayList5.clear();
                    int size4 = arrayList9.size();
                    int i6 = 0;
                    while (i6 < size4) {
                        Object obj2 = arrayList9.get(i6);
                        i6++;
                        DefaultItemAnimator.MoveInfo moveInfo = (DefaultItemAnimator.MoveInfo) obj2;
                        animateMoveImpl(moveInfo.holder, moveInfo, false);
                    }
                    arrayList9.clear();
                }
                if (!zIsEmpty8) {
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.addAll(arrayList7);
                    arrayList7.clear();
                    int size5 = arrayList10.size();
                    int i7 = 0;
                    while (i7 < size5) {
                        int i8 = i7 + 1;
                        RecyclerView.ViewHolder viewHolder3 = (RecyclerView.ViewHolder) arrayList10.get(i7);
                        View view4 = viewHolder3.itemView;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view4.animate();
                        arrayList8.add(viewHolder3);
                        view4.setTranslationY(height);
                        View view5 = viewHolder3.itemView;
                        view5.setScaleX(f2);
                        view5.setScaleY(f2);
                        ChatMessageCell chatMessageCell3 = view5 instanceof ChatMessageCell ? (ChatMessageCell) view5 : null;
                        if (chatMessageCell3 == null || !chatMessageCell3.getTransitionParams().ignoreAlpha) {
                            view5.setAlpha(f2);
                        }
                        ChatActivity chatActivity2 = this.activity;
                        if (chatActivity2 == null || chatMessageCell3 == null) {
                            arrayList3 = arrayList10;
                        } else {
                            ArrayList arrayList11 = chatActivity2.animatingMessageObjects;
                            if (arrayList11.contains(chatMessageCell3.getMessageObject())) {
                                arrayList11.remove(chatMessageCell3.getMessageObject());
                                ChatActivity.AnonymousClass39 anonymousClass310 = chatActivity2.chatActivityEnterView;
                                if (anonymousClass310.moveToSendStateRunnable == null || !((anonymousClass25 = anonymousClass310.messageSendPreview) == null || anonymousClass25.dismissing)) {
                                    arrayList3 = arrayList10;
                                } else {
                                    arrayList3 = arrayList10;
                                    z11 = System.currentTimeMillis() - anonymousClass310.sentFromPreview > 300;
                                    anonymousClass310.sentFromPreview = -1L;
                                    if (!z11) {
                                        if (chatMessageCell3.getMessageObject().isVoice()) {
                                            if (SharedConfig.getDevicePerformanceClass() == 0 && Math.abs(view4.getTranslationY()) < recyclerListView3.getMeasuredHeight()) {
                                                chatActivity = chatActivity2;
                                                ValueAnimator valueAnimator = new TextMessageEnterTransition(chatMessageCell3, chatActivity2, this.recyclerListView, chatActivity2.messageEnterTransitionContainer, this.resourcesProvider).animator;
                                                if (valueAnimator != null) {
                                                    valueAnimator.start();
                                                }
                                            }
                                            anonymousClass39 = chatActivity.chatActivityEnterView;
                                            runnable = anonymousClass39.moveToSendStateRunnable;
                                            if (runnable != null) {
                                                AndroidUtilities.cancelRunOnUIThread(runnable);
                                                anonymousClass39.messageTransitionIsRunning = true;
                                                anonymousClass39.moveToSendStateRunnable.run();
                                                anonymousClass39.moveToSendStateRunnable = null;
                                            }
                                        } else if (Math.abs(view4.getTranslationY()) < view4.getMeasuredHeight() * 3.0f) {
                                            new VoiceMessageEnterTransition(chatMessageCell3, chatActivity2.chatActivityEnterView, this.recyclerListView, chatActivity2.messageEnterTransitionContainer, this.resourcesProvider).animator.start();
                                        }
                                        chatActivity = chatActivity2;
                                        anonymousClass39 = chatActivity.chatActivityEnterView;
                                        runnable = anonymousClass39.moveToSendStateRunnable;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                            anonymousClass39.messageTransitionIsRunning = true;
                                            anonymousClass39.moveToSendStateRunnable.run();
                                            anonymousClass39.moveToSendStateRunnable = null;
                                        }
                                    }
                                }
                                anonymousClass310.sentFromPreview = -1L;
                                if (!z11) {
                                    if (chatMessageCell3.getMessageObject().isVoice()) {
                                        if (SharedConfig.getDevicePerformanceClass() == 0) {
                                        }
                                        anonymousClass39 = chatActivity.chatActivityEnterView;
                                        runnable = anonymousClass39.moveToSendStateRunnable;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                            anonymousClass39.messageTransitionIsRunning = true;
                                            anonymousClass39.moveToSendStateRunnable.run();
                                            anonymousClass39.moveToSendStateRunnable = null;
                                        }
                                    } else if (Math.abs(view4.getTranslationY()) < view4.getMeasuredHeight() * 3.0f) {
                                        new VoiceMessageEnterTransition(chatMessageCell3, chatActivity2.chatActivityEnterView, this.recyclerListView, chatActivity2.messageEnterTransitionContainer, this.resourcesProvider).animator.start();
                                    }
                                    chatActivity = chatActivity2;
                                    anonymousClass39 = chatActivity.chatActivityEnterView;
                                    runnable = anonymousClass39.moveToSendStateRunnable;
                                    if (runnable != null) {
                                        AndroidUtilities.cancelRunOnUIThread(runnable);
                                        anonymousClass39.messageTransitionIsRunning = true;
                                        anonymousClass39.moveToSendStateRunnable.run();
                                        anonymousClass39.moveToSendStateRunnable = null;
                                    }
                                }
                            } else {
                                arrayList3 = arrayList10;
                            }
                        }
                        viewPropertyAnimatorAnimate.translationY(0.0f).setDuration(250L).setInterpolator(this.translationInterpolator).setListener(new ProfileActivity.AnonymousClass47(this, viewHolder3, view4, viewPropertyAnimatorAnimate, 5)).start();
                        i7 = i8;
                        height = height;
                        arrayList10 = arrayList3;
                        f2 = 1.0f;
                    }
                    arrayList10.clear();
                }
            }
        } else {
            boolean zIsEmpty9 = arrayList4.isEmpty();
            boolean zIsEmpty10 = arrayList5.isEmpty();
            boolean zIsEmpty11 = arrayList6.isEmpty();
            boolean zIsEmpty12 = arrayList7.isEmpty();
            if (!zIsEmpty9 || !zIsEmpty10 || !zIsEmpty12 || !zIsEmpty11) {
                boolean z13 = (this.getThanosEffectContainer == null || (chatActivity$$ExternalSyntheticLambda48 = this.supportsThanosEffectContainer) == null || !((Boolean) chatActivity$$ExternalSyntheticLambda48.run()).booleanValue()) ? false : true;
                ArrayList arrayList12 = this.thanosViews;
                ArrayList arrayList13 = this.mRemoveAnimations;
                ArrayList arrayList14 = this.toBeSnapped;
                char c = 1;
                if (z13) {
                    LongSparseArray longSparseArray = null;
                    int i9 = 0;
                    j = 0;
                    while (i9 < arrayList4.size()) {
                        RecyclerView.ViewHolder viewHolder4 = (RecyclerView.ViewHolder) arrayList4.get(i9);
                        if (arrayList14.contains(viewHolder4)) {
                            z9 = zIsEmpty9;
                            View view6 = viewHolder4.itemView;
                            z10 = zIsEmpty10;
                            if ((view6 instanceof ChatMessageCell) && ((ChatMessageCell) view6).getCurrentMessagesGroup() != null && (messageObject = ((ChatMessageCell) viewHolder4.itemView).getMessageObject()) != null && messageObject.getGroupId() != 0) {
                                if (longSparseArray == null) {
                                    longSparseArray = new LongSparseArray();
                                }
                                ArrayList arrayList15 = (ArrayList) longSparseArray.get(messageObject.getGroupId());
                                if (arrayList15 == null) {
                                    long groupId = messageObject.getGroupId();
                                    arrayList15 = new ArrayList();
                                    longSparseArray.put(groupId, arrayList15);
                                }
                                arrayList14.remove(viewHolder4);
                                arrayList4.remove(i9);
                                i9--;
                                arrayList15.add(viewHolder4);
                            }
                            i9++;
                            zIsEmpty9 = z9;
                            zIsEmpty10 = z10;
                            recyclerListView3 = recyclerListView3;
                            arrayList8 = arrayList8;
                        } else {
                            z9 = zIsEmpty9;
                            z10 = zIsEmpty10;
                        }
                        i9++;
                        zIsEmpty9 = z9;
                        zIsEmpty10 = z10;
                        recyclerListView3 = recyclerListView3;
                        arrayList8 = arrayList8;
                    }
                    z2 = zIsEmpty9;
                    z3 = zIsEmpty10;
                    recyclerListView = recyclerListView3;
                    arrayList = arrayList8;
                    if (longSparseArray != null) {
                        z4 = false;
                        for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
                            ArrayList arrayList16 = (ArrayList) longSparseArray.valueAt(i10);
                            if (arrayList16.size() > 0) {
                                View view7 = ((RecyclerView.ViewHolder) arrayList16.get(0)).itemView;
                                if (!(view7 instanceof ChatMessageCell) || (currentMessagesGroup2 = ((ChatMessageCell) view7).getCurrentMessagesGroup()) == null || currentMessagesGroup2.messages.size() <= arrayList16.size()) {
                                    if (BuildVars.LOGS_ENABLED) {
                                        FileLog.d("animate remove group impl with thanos");
                                    }
                                    arrayList13.addAll(arrayList16);
                                    ThanosEffect thanosEffect = (ThanosEffect) this.getThanosEffectContainer.run();
                                    for (int i11 = 0; i11 < arrayList16.size(); i11++) {
                                    }
                                    ArrayList arrayList17 = new ArrayList();
                                    for (int i12 = 0; i12 < arrayList16.size(); i12++) {
                                        arrayList17.add(((RecyclerView.ViewHolder) arrayList16.get(i12)).itemView);
                                    }
                                    EglRenderer$$ExternalSyntheticLambda6 eglRenderer$$ExternalSyntheticLambda6 = new EglRenderer$$ExternalSyntheticLambda6(this, arrayList17, arrayList16, 4);
                                    ThanosEffect.DrawingThread drawingThread = thanosEffect.drawThread;
                                    if (drawingThread != null) {
                                        drawingThread.animateGroup(arrayList17, eglRenderer$$ExternalSyntheticLambda6);
                                        Choreographer.getInstance().postFrameCallback(thanosEffect.frameCallback);
                                    } else {
                                        thanosEffect.toSet.add(new ThanosEffect.ToSet(arrayList17, eglRenderer$$ExternalSyntheticLambda6));
                                    }
                                    arrayList12.add((View) arrayList17.get(0));
                                    recyclerListView.stopScroll();
                                    z4 = true;
                                } else {
                                    arrayList4.addAll(arrayList16);
                                }
                            }
                        }
                    }
                    size = arrayList4.size();
                    z5 = z4;
                    i = 0;
                    while (true) {
                        map = this.animators;
                        if (i < size) {
                            break;
                        }
                        Object obj3 = arrayList4.get(i);
                        i++;
                        viewHolder2 = (RecyclerView.ViewHolder) obj3;
                        if (arrayList14.remove(viewHolder2) || !z13) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        if (!BuildVars.LOGS_ENABLED) {
                            if (z8) {
                                str = " with thanos";
                            } else {
                                str = "";
                            }
                            FileLog.d("animate remove impl ".concat(str));
                        }
                        view2 = viewHolder2.itemView;
                        arrayList13.add(viewHolder2);
                        if (z8 || (chatActivity$$ExternalSyntheticLambda47 = this.getThanosEffectContainer) == null) {
                            Property property = View.ALPHA;
                            float[] fArr = new float[2];
                            fArr[0] = view2.getAlpha();
                            fArr[c] = 0.0f;
                            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, fArr);
                            objectAnimatorOfFloat.setDuration(this.mRemoveDuration);
                            final int i13 = 1;
                            objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationCancel(Animator animator) {
                                    switch (i13) {
                                        case 0:
                                            view2.setAlpha(1.0f);
                                            break;
                                        default:
                                            super.onAnimationCancel(animator);
                                            break;
                                    }
                                }

                                @Override
                                public final void onAnimationEnd(Animator animator) {
                                    switch (i13) {
                                        case 0:
                                            animator.removeAllListeners();
                                            View view8 = view2;
                                            view8.setAlpha(1.0f);
                                            view8.setScaleX(1.0f);
                                            view8.setScaleY(1.0f);
                                            view8.setTranslationY(0.0f);
                                            view8.setTranslationY(0.0f);
                                            ChatListItemAnimator chatListItemAnimator = this;
                                            ArrayList arrayList18 = chatListItemAnimator.mAddAnimations;
                                            RecyclerView.ViewHolder viewHolder5 = viewHolder2;
                                            if (arrayList18.remove(viewHolder5)) {
                                                chatListItemAnimator.getClass();
                                                chatListItemAnimator.dispatchAnimationFinished(viewHolder5);
                                                chatListItemAnimator.dispatchFinishedWhenDone();
                                            }
                                            break;
                                        default:
                                            animator.removeAllListeners();
                                            View view9 = view2;
                                            view9.setAlpha(1.0f);
                                            view9.setScaleX(1.0f);
                                            view9.setScaleY(1.0f);
                                            view9.setTranslationX(0.0f);
                                            view9.setTranslationY(0.0f);
                                            ChatListItemAnimator chatListItemAnimator2 = this;
                                            ArrayList arrayList19 = chatListItemAnimator2.mRemoveAnimations;
                                            RecyclerView.ViewHolder viewHolder6 = viewHolder2;
                                            if (arrayList19.remove(viewHolder6)) {
                                                chatListItemAnimator2.dispatchAnimationFinished(viewHolder6);
                                                chatListItemAnimator2.dispatchFinishedWhenDone();
                                            }
                                            break;
                                    }
                                }

                                @Override
                                public void onAnimationStart(Animator animator) {
                                    switch (i13) {
                                        case 0:
                                            this.getClass();
                                            break;
                                        default:
                                            super.onAnimationStart(animator);
                                            break;
                                    }
                                }
                            });
                            map.put(viewHolder2, objectAnimatorOfFloat);
                            objectAnimatorOfFloat.start();
                        } else {
                            ThanosEffect thanosEffect2 = (ThanosEffect) chatActivity$$ExternalSyntheticLambda47.run();
                            EglRenderer$$ExternalSyntheticLambda6 eglRenderer$$ExternalSyntheticLambda7 = new EglRenderer$$ExternalSyntheticLambda6(this, view2, viewHolder2, 5);
                            ThanosEffect.DrawingThread drawingThread2 = thanosEffect2.drawThread;
                            if (drawingThread2 != null) {
                                drawingThread2.animate(view2, 1.0f, eglRenderer$$ExternalSyntheticLambda7);
                                Choreographer.getInstance().postFrameCallback(thanosEffect2.frameCallback);
                            } else {
                                thanosEffect2.toSet.add(new ThanosEffect.ToSet(view2, eglRenderer$$ExternalSyntheticLambda7));
                            }
                            arrayList12.add(view2);
                        }
                        recyclerListView.stopScroll();
                        arrayList12 = arrayList12;
                        if (z8) {
                            z5 = true;
                        } else {
                            z5 = z5;
                        }
                        c = 1;
                    }
                    z6 = z5;
                    arrayList4.clear();
                    if (!z3) {
                        ArrayList arrayList18 = new ArrayList();
                        arrayList18.addAll(arrayList5);
                        this.mMovesList.add(arrayList18);
                        arrayList5.clear();
                        serverRunnable = new NanoHTTPD.ServerRunnable(this, arrayList18, z6, 2);
                        if (this.delayAnimations || z2) {
                            serverRunnable.run();
                        } else {
                            View view8 = ((DefaultItemAnimator.MoveInfo) arrayList18.get(0)).holder.itemView;
                            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                            view8.postOnAnimationDelayed(serverRunnable, j);
                        }
                    }
                    if (!zIsEmpty11) {
                        ArrayList arrayList19 = new ArrayList();
                        arrayList19.addAll(arrayList6);
                        this.mChangesList.add(arrayList19);
                        arrayList6.clear();
                        zzyVar = new zzy(13, this, arrayList19);
                        if (this.delayAnimations || z2) {
                            zzyVar.run();
                        } else {
                            View view9 = ((DefaultItemAnimator.ChangeInfo) arrayList19.get(0)).oldHolder.itemView;
                            WeakHashMap weakHashMap2 = ViewCompat.sViewPropertyAnimatorMap;
                            view9.postOnAnimationDelayed(zzyVar, 0L);
                        }
                    }
                    if (!zIsEmpty12) {
                        arrayList2 = new ArrayList();
                        arrayList2.addAll(arrayList7);
                        arrayList7.clear();
                        Collections.sort(arrayList2, new OAuthSheet$$ExternalSyntheticLambda3(22));
                        size2 = arrayList2.size();
                        i2 = 0;
                        while (i2 < size2) {
                            int i14 = i2 + 1;
                            viewHolder = (RecyclerView.ViewHolder) arrayList2.get(i2);
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("animate add impl");
                            }
                            view = viewHolder.itemView;
                            ArrayList arrayList20 = arrayList;
                            arrayList20.add(viewHolder);
                            if (viewHolder == this.greetingsSticker) {
                                view.setAlpha(1.0f);
                            }
                            animatorSet = new AnimatorSet();
                            if (view instanceof ChatMessageCell) {
                                chatMessageCell = (ChatMessageCell) view;
                                if (chatMessageCell.getAnimationOffsetX() != 0.0f) {
                                    animatorSet.playTogether(ObjectAnimator.ofFloat(chatMessageCell, chatMessageCell.ANIMATION_OFFSET_X, chatMessageCell.getAnimationOffsetX(), 0.0f));
                                }
                                chatMessageCell.setPivotX(((chatMessageCell.getBackgroundDrawableRight() - chatMessageCell.getBackgroundDrawableLeft()) / 2.0f) + chatMessageCell.getBackgroundDrawableLeft());
                                f = 0.0f;
                                view.animate().translationY(0.0f).setDuration(this.mAddDuration).start();
                            } else {
                                f = 0.0f;
                                view.animate().translationX(0.0f).translationY(0.0f).setDuration(this.mAddDuration).start();
                            }
                            jMax = (long) ((1.0f - Math.max(f, Math.min(1.0f, view.getBottom() / recyclerListView.getMeasuredHeight()))) * 100.0f);
                            if (view instanceof ChatMessageCell) {
                                if (viewHolder == this.greetingsSticker) {
                                    chatGreetingsView = this.chatGreetingsView;
                                    if (chatGreetingsView != null) {
                                        chatGreetingsView.stickerToSendView.setAlpha(0.0f);
                                    }
                                    RecyclerListView recyclerListView4 = recyclerListView;
                                    recyclerListView4.setClipChildren(false);
                                    final ChatMessageCell chatMessageCell4 = (ChatMessageCell) view;
                                    View view10 = (View) this.chatGreetingsView.getParent();
                                    float x = view10.getX() + this.chatGreetingsView.getX() + this.chatGreetingsView.stickerToSendView.getX();
                                    float y = view10.getY() + this.chatGreetingsView.getY() + this.chatGreetingsView.stickerToSendView.getY();
                                    float x2 = chatMessageCell4.getX() + recyclerListView4.getX() + chatMessageCell4.getPhotoImage().getImageX();
                                    float y2 = chatMessageCell4.getY() + recyclerListView4.getY() + chatMessageCell4.getPhotoImage().getImageY();
                                    recyclerListView2 = recyclerListView4;
                                    final float width = this.chatGreetingsView.stickerToSendView.getWidth();
                                    final float height2 = this.chatGreetingsView.stickerToSendView.getHeight();
                                    final float imageWidth = chatMessageCell4.getPhotoImage().getImageWidth();
                                    final float imageHeight = chatMessageCell4.getPhotoImage().getImageHeight();
                                    final float f3 = x - x2;
                                    final float f4 = y - y2;
                                    final float imageX = chatMessageCell4.getPhotoImage().getImageX();
                                    final float imageY = chatMessageCell4.getPhotoImage().getImageY();
                                    chatMessageCell4.getTransitionParams().imageChangeBoundsTransition = true;
                                    chatMessageCell4.getTransitionParams().animateDrawingTimeAlpha = true;
                                    chatMessageCell4.getPhotoImage().setImageCoords(imageX + f3, imageX + f4, width, height2);
                                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                        @Override
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            ChatMessageCell chatMessageCell5 = chatMessageCell4;
                                            chatMessageCell5.getTransitionParams().animateChangeProgress = fFloatValue;
                                            if (chatMessageCell5.getTransitionParams().animateChangeProgress > 1.0f) {
                                                chatMessageCell5.getTransitionParams().animateChangeProgress = 1.0f;
                                            }
                                            float f5 = 1.0f - fFloatValue;
                                            chatMessageCell5.getPhotoImage().setImageCoords((f3 * f5) + imageX, (f4 * f5) + imageY, (imageWidth * fFloatValue) + (width * f5), (imageHeight * fFloatValue) + (height2 * f5));
                                            chatMessageCell5.invalidate();
                                        }
                                    });
                                    valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                                        @Override
                                        public final void onAnimationEnd(Animator animator) {
                                            ChatMessageCell chatMessageCell5 = chatMessageCell4;
                                            chatMessageCell5.getTransitionParams().resetAnimation();
                                            chatMessageCell5.getPhotoImage().setImageCoords(imageX, imageY, imageWidth, imageHeight);
                                            ChatGreetingsView chatGreetingsView2 = ChatListItemAnimator.this.chatGreetingsView;
                                            if (chatGreetingsView2 != null) {
                                                chatGreetingsView2.stickerToSendView.setAlpha(1.0f);
                                            }
                                            chatMessageCell5.invalidate();
                                        }
                                    });
                                    animatorSet.play(valueAnimatorOfFloat);
                                    jMax = jMax;
                                    z7 = false;
                                } else {
                                    recyclerListView2 = recyclerListView;
                                    currentMessagesGroup = ((ChatMessageCell) view).getCurrentMessagesGroup();
                                    if (currentMessagesGroup != null) {
                                        map2 = this.groupIdToEnterDelay;
                                        l = (Long) map2.get(Long.valueOf(currentMessagesGroup.groupId));
                                        if (l == null) {
                                            map2.put(Long.valueOf(currentMessagesGroup.groupId), Long.valueOf(jMax));
                                            jMax = jMax;
                                        } else {
                                            jMax = l.longValue();
                                        }
                                    } else {
                                        jMax = jMax;
                                    }
                                    if (currentMessagesGroup != null && currentMessagesGroup.transitionParams.backgroundChangeBounds) {
                                        animatorSet.setStartDelay(140L);
                                    }
                                }
                                view.setAlpha(0.0f);
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 1.0f));
                                if (z7) {
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
                                final int i15 = 0;
                                animatorSet.addListener(new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationCancel(Animator animator) {
                                        switch (i15) {
                                            case 0:
                                                view.setAlpha(1.0f);
                                                break;
                                            default:
                                                super.onAnimationCancel(animator);
                                                break;
                                        }
                                    }

                                    @Override
                                    public final void onAnimationEnd(Animator animator) {
                                        switch (i15) {
                                            case 0:
                                                animator.removeAllListeners();
                                                View view11 = view;
                                                view11.setAlpha(1.0f);
                                                view11.setScaleX(1.0f);
                                                view11.setScaleY(1.0f);
                                                view11.setTranslationY(0.0f);
                                                view11.setTranslationY(0.0f);
                                                ChatListItemAnimator chatListItemAnimator = this;
                                                ArrayList arrayList110 = chatListItemAnimator.mAddAnimations;
                                                RecyclerView.ViewHolder viewHolder5 = viewHolder;
                                                if (arrayList110.remove(viewHolder5)) {
                                                    chatListItemAnimator.getClass();
                                                    chatListItemAnimator.dispatchAnimationFinished(viewHolder5);
                                                    chatListItemAnimator.dispatchFinishedWhenDone();
                                                }
                                                break;
                                            default:
                                                animator.removeAllListeners();
                                                View view12 = view;
                                                view12.setAlpha(1.0f);
                                                view12.setScaleX(1.0f);
                                                view12.setScaleY(1.0f);
                                                view12.setTranslationX(0.0f);
                                                view12.setTranslationY(0.0f);
                                                ChatListItemAnimator chatListItemAnimator2 = this;
                                                ArrayList arrayList111 = chatListItemAnimator2.mRemoveAnimations;
                                                RecyclerView.ViewHolder viewHolder6 = viewHolder;
                                                if (arrayList111.remove(viewHolder6)) {
                                                    chatListItemAnimator2.dispatchAnimationFinished(viewHolder6);
                                                    chatListItemAnimator2.dispatchFinishedWhenDone();
                                                }
                                                break;
                                        }
                                    }

                                    @Override
                                    public void onAnimationStart(Animator animator) {
                                        switch (i15) {
                                            case 0:
                                                this.getClass();
                                                break;
                                            default:
                                                super.onAnimationStart(animator);
                                                break;
                                        }
                                    }
                                });
                                map.put(viewHolder, animatorSet);
                                animatorSet.start();
                                i2 = i14;
                                arrayList = arrayList20;
                                recyclerListView = recyclerListView2;
                            } else {
                                recyclerListView2 = recyclerListView;
                            }
                            z7 = true;
                            view.setAlpha(0.0f);
                            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 1.0f));
                            if (z7) {
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
                            final int i16 = 0;
                            animatorSet.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationCancel(Animator animator) {
                                    switch (i16) {
                                        case 0:
                                            view.setAlpha(1.0f);
                                            break;
                                        default:
                                            super.onAnimationCancel(animator);
                                            break;
                                    }
                                }

                                @Override
                                public final void onAnimationEnd(Animator animator) {
                                    switch (i16) {
                                        case 0:
                                            animator.removeAllListeners();
                                            View view11 = view;
                                            view11.setAlpha(1.0f);
                                            view11.setScaleX(1.0f);
                                            view11.setScaleY(1.0f);
                                            view11.setTranslationY(0.0f);
                                            view11.setTranslationY(0.0f);
                                            ChatListItemAnimator chatListItemAnimator = this;
                                            ArrayList arrayList110 = chatListItemAnimator.mAddAnimations;
                                            RecyclerView.ViewHolder viewHolder5 = viewHolder;
                                            if (arrayList110.remove(viewHolder5)) {
                                                chatListItemAnimator.getClass();
                                                chatListItemAnimator.dispatchAnimationFinished(viewHolder5);
                                                chatListItemAnimator.dispatchFinishedWhenDone();
                                            }
                                            break;
                                        default:
                                            animator.removeAllListeners();
                                            View view12 = view;
                                            view12.setAlpha(1.0f);
                                            view12.setScaleX(1.0f);
                                            view12.setScaleY(1.0f);
                                            view12.setTranslationX(0.0f);
                                            view12.setTranslationY(0.0f);
                                            ChatListItemAnimator chatListItemAnimator2 = this;
                                            ArrayList arrayList111 = chatListItemAnimator2.mRemoveAnimations;
                                            RecyclerView.ViewHolder viewHolder6 = viewHolder;
                                            if (arrayList111.remove(viewHolder6)) {
                                                chatListItemAnimator2.dispatchAnimationFinished(viewHolder6);
                                                chatListItemAnimator2.dispatchFinishedWhenDone();
                                            }
                                            break;
                                    }
                                }

                                @Override
                                public void onAnimationStart(Animator animator) {
                                    switch (i16) {
                                        case 0:
                                            this.getClass();
                                            break;
                                        default:
                                            super.onAnimationStart(animator);
                                            break;
                                    }
                                }
                            });
                            map.put(viewHolder, animatorSet);
                            animatorSet.start();
                            i2 = i14;
                            arrayList = arrayList20;
                            recyclerListView = recyclerListView2;
                        }
                        arrayList2.clear();
                    }
                } else {
                    z2 = zIsEmpty9;
                    z3 = zIsEmpty10;
                    recyclerListView = recyclerListView3;
                    arrayList = arrayList8;
                    j = 0;
                }
                z4 = false;
                size = arrayList4.size();
                z5 = z4;
                i = 0;
                while (true) {
                    map = this.animators;
                    if (i < size) {
                        break;
                        break;
                    }
                    Object obj4 = arrayList4.get(i);
                    i++;
                    viewHolder2 = (RecyclerView.ViewHolder) obj4;
                    if (arrayList14.remove(viewHolder2)) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (!BuildVars.LOGS_ENABLED) {
                        if (z8) {
                            str = " with thanos";
                        } else {
                            str = "";
                        }
                        FileLog.d("animate remove impl ".concat(str));
                    }
                    view2 = viewHolder2.itemView;
                    arrayList13.add(viewHolder2);
                    if (z8) {
                        Property property2 = View.ALPHA;
                        float[] fArr2 = new float[2];
                        fArr2[0] = view2.getAlpha();
                        fArr2[c] = 0.0f;
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property2, fArr2);
                        objectAnimatorOfFloat2.setDuration(this.mRemoveDuration);
                        final int i17 = 1;
                        objectAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationCancel(Animator animator) {
                                switch (i17) {
                                    case 0:
                                        view2.setAlpha(1.0f);
                                        break;
                                    default:
                                        super.onAnimationCancel(animator);
                                        break;
                                }
                            }

                            @Override
                            public final void onAnimationEnd(Animator animator) {
                                switch (i17) {
                                    case 0:
                                        animator.removeAllListeners();
                                        View view11 = view2;
                                        view11.setAlpha(1.0f);
                                        view11.setScaleX(1.0f);
                                        view11.setScaleY(1.0f);
                                        view11.setTranslationY(0.0f);
                                        view11.setTranslationY(0.0f);
                                        ChatListItemAnimator chatListItemAnimator = this;
                                        ArrayList arrayList110 = chatListItemAnimator.mAddAnimations;
                                        RecyclerView.ViewHolder viewHolder5 = viewHolder2;
                                        if (arrayList110.remove(viewHolder5)) {
                                            chatListItemAnimator.getClass();
                                            chatListItemAnimator.dispatchAnimationFinished(viewHolder5);
                                            chatListItemAnimator.dispatchFinishedWhenDone();
                                        }
                                        break;
                                    default:
                                        animator.removeAllListeners();
                                        View view12 = view2;
                                        view12.setAlpha(1.0f);
                                        view12.setScaleX(1.0f);
                                        view12.setScaleY(1.0f);
                                        view12.setTranslationX(0.0f);
                                        view12.setTranslationY(0.0f);
                                        ChatListItemAnimator chatListItemAnimator2 = this;
                                        ArrayList arrayList111 = chatListItemAnimator2.mRemoveAnimations;
                                        RecyclerView.ViewHolder viewHolder6 = viewHolder2;
                                        if (arrayList111.remove(viewHolder6)) {
                                            chatListItemAnimator2.dispatchAnimationFinished(viewHolder6);
                                            chatListItemAnimator2.dispatchFinishedWhenDone();
                                        }
                                        break;
                                }
                            }

                            @Override
                            public void onAnimationStart(Animator animator) {
                                switch (i17) {
                                    case 0:
                                        this.getClass();
                                        break;
                                    default:
                                        super.onAnimationStart(animator);
                                        break;
                                }
                            }
                        });
                        map.put(viewHolder2, objectAnimatorOfFloat2);
                        objectAnimatorOfFloat2.start();
                    } else {
                        Property property3 = View.ALPHA;
                        float[] fArr3 = new float[2];
                        fArr3[0] = view2.getAlpha();
                        fArr3[c] = 0.0f;
                        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property3, fArr3);
                        objectAnimatorOfFloat3.setDuration(this.mRemoveDuration);
                        final int i18 = 1;
                        objectAnimatorOfFloat3.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationCancel(Animator animator) {
                                switch (i18) {
                                    case 0:
                                        view2.setAlpha(1.0f);
                                        break;
                                    default:
                                        super.onAnimationCancel(animator);
                                        break;
                                }
                            }

                            @Override
                            public final void onAnimationEnd(Animator animator) {
                                switch (i18) {
                                    case 0:
                                        animator.removeAllListeners();
                                        View view11 = view2;
                                        view11.setAlpha(1.0f);
                                        view11.setScaleX(1.0f);
                                        view11.setScaleY(1.0f);
                                        view11.setTranslationY(0.0f);
                                        view11.setTranslationY(0.0f);
                                        ChatListItemAnimator chatListItemAnimator = this;
                                        ArrayList arrayList110 = chatListItemAnimator.mAddAnimations;
                                        RecyclerView.ViewHolder viewHolder5 = viewHolder2;
                                        if (arrayList110.remove(viewHolder5)) {
                                            chatListItemAnimator.getClass();
                                            chatListItemAnimator.dispatchAnimationFinished(viewHolder5);
                                            chatListItemAnimator.dispatchFinishedWhenDone();
                                        }
                                        break;
                                    default:
                                        animator.removeAllListeners();
                                        View view12 = view2;
                                        view12.setAlpha(1.0f);
                                        view12.setScaleX(1.0f);
                                        view12.setScaleY(1.0f);
                                        view12.setTranslationX(0.0f);
                                        view12.setTranslationY(0.0f);
                                        ChatListItemAnimator chatListItemAnimator2 = this;
                                        ArrayList arrayList111 = chatListItemAnimator2.mRemoveAnimations;
                                        RecyclerView.ViewHolder viewHolder6 = viewHolder2;
                                        if (arrayList111.remove(viewHolder6)) {
                                            chatListItemAnimator2.dispatchAnimationFinished(viewHolder6);
                                            chatListItemAnimator2.dispatchFinishedWhenDone();
                                        }
                                        break;
                                }
                            }

                            @Override
                            public void onAnimationStart(Animator animator) {
                                switch (i18) {
                                    case 0:
                                        this.getClass();
                                        break;
                                    default:
                                        super.onAnimationStart(animator);
                                        break;
                                }
                            }
                        });
                        map.put(viewHolder2, objectAnimatorOfFloat3);
                        objectAnimatorOfFloat3.start();
                    }
                    recyclerListView.stopScroll();
                    arrayList12 = arrayList12;
                    if (z8) {
                        z5 = true;
                    } else {
                        z5 = z5;
                    }
                    c = 1;
                }
                z6 = z5;
                arrayList4.clear();
                if (!z3) {
                    ArrayList arrayList110 = new ArrayList();
                    arrayList110.addAll(arrayList5);
                    this.mMovesList.add(arrayList110);
                    arrayList5.clear();
                    serverRunnable = new NanoHTTPD.ServerRunnable(this, arrayList110, z6, 2);
                    if (this.delayAnimations) {
                        serverRunnable.run();
                    } else {
                        serverRunnable.run();
                    }
                }
                if (!zIsEmpty11) {
                    ArrayList arrayList111 = new ArrayList();
                    arrayList111.addAll(arrayList6);
                    this.mChangesList.add(arrayList111);
                    arrayList6.clear();
                    zzyVar = new zzy(13, this, arrayList111);
                    if (this.delayAnimations) {
                        zzyVar.run();
                    } else {
                        zzyVar.run();
                    }
                }
                if (!zIsEmpty12) {
                    arrayList2 = new ArrayList();
                    arrayList2.addAll(arrayList7);
                    arrayList7.clear();
                    Collections.sort(arrayList2, new OAuthSheet$$ExternalSyntheticLambda3(22));
                    size2 = arrayList2.size();
                    i2 = 0;
                    while (i2 < size2) {
                        int i19 = i2 + 1;
                        viewHolder = (RecyclerView.ViewHolder) arrayList2.get(i2);
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("animate add impl");
                        }
                        view = viewHolder.itemView;
                        ArrayList arrayList21 = arrayList;
                        arrayList21.add(viewHolder);
                        if (viewHolder == this.greetingsSticker) {
                            view.setAlpha(1.0f);
                        }
                        animatorSet = new AnimatorSet();
                        if (view instanceof ChatMessageCell) {
                            chatMessageCell = (ChatMessageCell) view;
                            if (chatMessageCell.getAnimationOffsetX() != 0.0f) {
                                animatorSet.playTogether(ObjectAnimator.ofFloat(chatMessageCell, chatMessageCell.ANIMATION_OFFSET_X, chatMessageCell.getAnimationOffsetX(), 0.0f));
                            }
                            chatMessageCell.setPivotX(((chatMessageCell.getBackgroundDrawableRight() - chatMessageCell.getBackgroundDrawableLeft()) / 2.0f) + chatMessageCell.getBackgroundDrawableLeft());
                            f = 0.0f;
                            view.animate().translationY(0.0f).setDuration(this.mAddDuration).start();
                        } else {
                            f = 0.0f;
                            view.animate().translationX(0.0f).translationY(0.0f).setDuration(this.mAddDuration).start();
                        }
                        jMax = (long) ((1.0f - Math.max(f, Math.min(1.0f, view.getBottom() / recyclerListView.getMeasuredHeight()))) * 100.0f);
                        if (view instanceof ChatMessageCell) {
                            if (viewHolder == this.greetingsSticker) {
                                chatGreetingsView = this.chatGreetingsView;
                                if (chatGreetingsView != null) {
                                    chatGreetingsView.stickerToSendView.setAlpha(0.0f);
                                }
                                RecyclerListView recyclerListView5 = recyclerListView;
                                recyclerListView5.setClipChildren(false);
                                final ChatMessageCell chatMessageCell5 = (ChatMessageCell) view;
                                View view11 = (View) this.chatGreetingsView.getParent();
                                float x3 = view11.getX() + this.chatGreetingsView.getX() + this.chatGreetingsView.stickerToSendView.getX();
                                float y3 = view11.getY() + this.chatGreetingsView.getY() + this.chatGreetingsView.stickerToSendView.getY();
                                float x4 = chatMessageCell5.getX() + recyclerListView5.getX() + chatMessageCell5.getPhotoImage().getImageX();
                                float y4 = chatMessageCell5.getY() + recyclerListView5.getY() + chatMessageCell5.getPhotoImage().getImageY();
                                recyclerListView2 = recyclerListView5;
                                final float width2 = this.chatGreetingsView.stickerToSendView.getWidth();
                                final float height3 = this.chatGreetingsView.stickerToSendView.getHeight();
                                final float imageWidth2 = chatMessageCell5.getPhotoImage().getImageWidth();
                                final float imageHeight2 = chatMessageCell5.getPhotoImage().getImageHeight();
                                final float f5 = x3 - x4;
                                final float f6 = y3 - y4;
                                final float imageX2 = chatMessageCell5.getPhotoImage().getImageX();
                                final float imageY2 = chatMessageCell5.getPhotoImage().getImageY();
                                chatMessageCell5.getTransitionParams().imageChangeBoundsTransition = true;
                                chatMessageCell5.getTransitionParams().animateDrawingTimeAlpha = true;
                                chatMessageCell5.getPhotoImage().setImageCoords(imageX2 + f5, imageX2 + f6, width2, height3);
                                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                                valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    @Override
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                        float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                        ChatMessageCell chatMessageCell6 = chatMessageCell5;
                                        chatMessageCell6.getTransitionParams().animateChangeProgress = fFloatValue;
                                        if (chatMessageCell6.getTransitionParams().animateChangeProgress > 1.0f) {
                                            chatMessageCell6.getTransitionParams().animateChangeProgress = 1.0f;
                                        }
                                        float f7 = 1.0f - fFloatValue;
                                        chatMessageCell6.getPhotoImage().setImageCoords((f5 * f7) + imageX2, (f6 * f7) + imageY2, (imageWidth2 * fFloatValue) + (width2 * f7), (imageHeight2 * fFloatValue) + (height3 * f7));
                                        chatMessageCell6.invalidate();
                                    }
                                });
                                valueAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() {
                                    @Override
                                    public final void onAnimationEnd(Animator animator) {
                                        ChatMessageCell chatMessageCell6 = chatMessageCell5;
                                        chatMessageCell6.getTransitionParams().resetAnimation();
                                        chatMessageCell6.getPhotoImage().setImageCoords(imageX2, imageY2, imageWidth2, imageHeight2);
                                        ChatGreetingsView chatGreetingsView2 = ChatListItemAnimator.this.chatGreetingsView;
                                        if (chatGreetingsView2 != null) {
                                            chatGreetingsView2.stickerToSendView.setAlpha(1.0f);
                                        }
                                        chatMessageCell6.invalidate();
                                    }
                                });
                                animatorSet.play(valueAnimatorOfFloat2);
                                jMax = jMax;
                                z7 = false;
                            } else {
                                recyclerListView2 = recyclerListView;
                                currentMessagesGroup = ((ChatMessageCell) view).getCurrentMessagesGroup();
                                if (currentMessagesGroup != null) {
                                    map2 = this.groupIdToEnterDelay;
                                    l = (Long) map2.get(Long.valueOf(currentMessagesGroup.groupId));
                                    if (l == null) {
                                        map2.put(Long.valueOf(currentMessagesGroup.groupId), Long.valueOf(jMax));
                                        jMax = jMax;
                                    } else {
                                        jMax = l.longValue();
                                    }
                                } else {
                                    jMax = jMax;
                                }
                                if (currentMessagesGroup != null) {
                                    animatorSet.setStartDelay(140L);
                                }
                            }
                            view.setAlpha(0.0f);
                            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 1.0f));
                            if (z7) {
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
                            final int i110 = 0;
                            animatorSet.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationCancel(Animator animator) {
                                    switch (i110) {
                                        case 0:
                                            view.setAlpha(1.0f);
                                            break;
                                        default:
                                            super.onAnimationCancel(animator);
                                            break;
                                    }
                                }

                                @Override
                                public final void onAnimationEnd(Animator animator) {
                                    switch (i110) {
                                        case 0:
                                            animator.removeAllListeners();
                                            View view12 = view;
                                            view12.setAlpha(1.0f);
                                            view12.setScaleX(1.0f);
                                            view12.setScaleY(1.0f);
                                            view12.setTranslationY(0.0f);
                                            view12.setTranslationY(0.0f);
                                            ChatListItemAnimator chatListItemAnimator = this;
                                            ArrayList arrayList112 = chatListItemAnimator.mAddAnimations;
                                            RecyclerView.ViewHolder viewHolder5 = viewHolder;
                                            if (arrayList112.remove(viewHolder5)) {
                                                chatListItemAnimator.getClass();
                                                chatListItemAnimator.dispatchAnimationFinished(viewHolder5);
                                                chatListItemAnimator.dispatchFinishedWhenDone();
                                            }
                                            break;
                                        default:
                                            animator.removeAllListeners();
                                            View view13 = view;
                                            view13.setAlpha(1.0f);
                                            view13.setScaleX(1.0f);
                                            view13.setScaleY(1.0f);
                                            view13.setTranslationX(0.0f);
                                            view13.setTranslationY(0.0f);
                                            ChatListItemAnimator chatListItemAnimator2 = this;
                                            ArrayList arrayList113 = chatListItemAnimator2.mRemoveAnimations;
                                            RecyclerView.ViewHolder viewHolder6 = viewHolder;
                                            if (arrayList113.remove(viewHolder6)) {
                                                chatListItemAnimator2.dispatchAnimationFinished(viewHolder6);
                                                chatListItemAnimator2.dispatchFinishedWhenDone();
                                            }
                                            break;
                                    }
                                }

                                @Override
                                public void onAnimationStart(Animator animator) {
                                    switch (i110) {
                                        case 0:
                                            this.getClass();
                                            break;
                                        default:
                                            super.onAnimationStart(animator);
                                            break;
                                    }
                                }
                            });
                            map.put(viewHolder, animatorSet);
                            animatorSet.start();
                            i2 = i19;
                            arrayList = arrayList21;
                            recyclerListView = recyclerListView2;
                        } else {
                            recyclerListView2 = recyclerListView;
                        }
                        z7 = true;
                        view.setAlpha(0.0f);
                        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 1.0f));
                        if (z7) {
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
                        final int i111 = 0;
                        animatorSet.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationCancel(Animator animator) {
                                switch (i111) {
                                    case 0:
                                        view.setAlpha(1.0f);
                                        break;
                                    default:
                                        super.onAnimationCancel(animator);
                                        break;
                                }
                            }

                            @Override
                            public final void onAnimationEnd(Animator animator) {
                                switch (i111) {
                                    case 0:
                                        animator.removeAllListeners();
                                        View view12 = view;
                                        view12.setAlpha(1.0f);
                                        view12.setScaleX(1.0f);
                                        view12.setScaleY(1.0f);
                                        view12.setTranslationY(0.0f);
                                        view12.setTranslationY(0.0f);
                                        ChatListItemAnimator chatListItemAnimator = this;
                                        ArrayList arrayList112 = chatListItemAnimator.mAddAnimations;
                                        RecyclerView.ViewHolder viewHolder5 = viewHolder;
                                        if (arrayList112.remove(viewHolder5)) {
                                            chatListItemAnimator.getClass();
                                            chatListItemAnimator.dispatchAnimationFinished(viewHolder5);
                                            chatListItemAnimator.dispatchFinishedWhenDone();
                                        }
                                        break;
                                    default:
                                        animator.removeAllListeners();
                                        View view13 = view;
                                        view13.setAlpha(1.0f);
                                        view13.setScaleX(1.0f);
                                        view13.setScaleY(1.0f);
                                        view13.setTranslationX(0.0f);
                                        view13.setTranslationY(0.0f);
                                        ChatListItemAnimator chatListItemAnimator2 = this;
                                        ArrayList arrayList113 = chatListItemAnimator2.mRemoveAnimations;
                                        RecyclerView.ViewHolder viewHolder6 = viewHolder;
                                        if (arrayList113.remove(viewHolder6)) {
                                            chatListItemAnimator2.dispatchAnimationFinished(viewHolder6);
                                            chatListItemAnimator2.dispatchFinishedWhenDone();
                                        }
                                        break;
                                }
                            }

                            @Override
                            public void onAnimationStart(Animator animator) {
                                switch (i111) {
                                    case 0:
                                        this.getClass();
                                        break;
                                    default:
                                        super.onAnimationStart(animator);
                                        break;
                                }
                            }
                        });
                        map.put(viewHolder, animatorSet);
                        animatorSet.start();
                        i2 = i19;
                        arrayList = arrayList21;
                        recyclerListView = recyclerListView2;
                    }
                    arrayList2.clear();
                }
            }
        }
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat3.addUpdateListener(new VoIPFragment$$ExternalSyntheticLambda4(this, 25));
        valueAnimatorOfFloat3.setDuration(this.mRemoveDuration + 250);
        valueAnimatorOfFloat3.start();
    }

    public final void setOnSnapMessage(ChatActivity$$ExternalSyntheticLambda47 chatActivity$$ExternalSyntheticLambda47, ChatActivity$$ExternalSyntheticLambda47 chatActivity$$ExternalSyntheticLambda48) {
        this.supportsThanosEffectContainer = chatActivity$$ExternalSyntheticLambda47;
        this.getThanosEffectContainer = chatActivity$$ExternalSyntheticLambda48;
    }

    public final boolean willAddedFromAlpha(View view) {
        RecyclerView.ViewHolder childViewHolder;
        if (this.shouldAnimateEnterFromBottom || (childViewHolder = this.recyclerListView.getChildViewHolder(view)) == null) {
            return false;
        }
        return this.mPendingAdditions.contains(childViewHolder) || this.mAddAnimations.contains(childViewHolder);
    }

    public final boolean willRemoved(View view) {
        RecyclerView.ViewHolder childViewHolder = this.recyclerListView.getChildViewHolder(view);
        if (childViewHolder != null) {
            return this.mPendingRemovals.contains(childViewHolder) || this.mRemoveAnimations.contains(childViewHolder);
        }
        return false;
    }

    public final void animateMoveImpl(final RecyclerView.ViewHolder viewHolder, DefaultItemAnimator.MoveInfo moveInfo, boolean z) {
        final MoveInfoExtended moveInfoExtended;
        float f;
        boolean z2;
        final int i;
        final int i2;
        char c;
        int[] iArr;
        final int i3 = 0;
        final int i4 = 1;
        final View view = viewHolder.itemView;
        final int i5 = moveInfo.toY - moveInfo.fromY;
        AnimatorSet animatorSet = new AnimatorSet();
        if (i5 != 0) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
        }
        this.mMoveAnimations.add(viewHolder);
        MoveInfoExtended moveInfoExtended2 = (MoveInfoExtended) moveInfo;
        View view2 = viewHolder.itemView;
        ChatActivity chatActivity = this.activity;
        if (chatActivity != null && (view2 instanceof BotHelpCell)) {
            final BotHelpCell botHelpCell = (BotHelpCell) view2;
            final float translationY = botHelpCell.getTranslationY();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
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
                            float measuredHeight = chatListItemAnimator.recyclerListView.getMeasuredHeight();
                            ChatActivity chatActivity2 = chatListItemAnimator.activity;
                            float f2 = ((measuredHeight - chatActivity2.chatListViewPaddingTop) - chatActivity2.blurredViewBottomOffset) / 2.0f;
                            BotHelpCell botHelpCell2 = (BotHelpCell) botHelpCell;
                            float measuredHeight2 = (f2 - (botHelpCell2.getMeasuredHeight() / 2.0f)) + chatListItemAnimator.activity.chatListViewPaddingTop;
                            botHelpCell2.setTranslationY(((((float) botHelpCell2.getTop()) > measuredHeight2 ? measuredHeight2 - botHelpCell2.getTop() : 0.0f) * fFloatValue) + ((1.0f - fFloatValue) * translationY));
                            break;
                        default:
                            float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ChatListItemAnimator chatListItemAnimator2 = this.this$0;
                            float measuredHeight3 = chatListItemAnimator2.recyclerListView.getMeasuredHeight();
                            ChatActivity chatActivity3 = chatListItemAnimator2.activity;
                            float f3 = ((measuredHeight3 - chatActivity3.chatListViewPaddingTop) - chatActivity3.blurredViewBottomOffset) / 2.0f;
                            UserInfoCell userInfoCell = (UserInfoCell) botHelpCell;
                            float measuredHeight4 = (f3 - (userInfoCell.getMeasuredHeight() / 2.0f)) + chatListItemAnimator2.activity.chatListViewPaddingTop;
                            userInfoCell.setTranslationY(((((float) userInfoCell.getTop()) > measuredHeight4 ? measuredHeight4 - userInfoCell.getTop() : 0.0f) * fFloatValue2) + ((1.0f - fFloatValue2) * translationY));
                            break;
                    }
                }
            });
            animatorSet.playTogether(valueAnimatorOfFloat);
        } else if (chatActivity != null && (view2 instanceof UserInfoCell)) {
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
                    switch (i4) {
                        case 0:
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ChatListItemAnimator chatListItemAnimator = this.this$0;
                            float measuredHeight = chatListItemAnimator.recyclerListView.getMeasuredHeight();
                            ChatActivity chatActivity2 = chatListItemAnimator.activity;
                            float f2 = ((measuredHeight - chatActivity2.chatListViewPaddingTop) - chatActivity2.blurredViewBottomOffset) / 2.0f;
                            BotHelpCell botHelpCell2 = (BotHelpCell) userInfoCell;
                            float measuredHeight2 = (f2 - (botHelpCell2.getMeasuredHeight() / 2.0f)) + chatListItemAnimator.activity.chatListViewPaddingTop;
                            botHelpCell2.setTranslationY(((((float) botHelpCell2.getTop()) > measuredHeight2 ? measuredHeight2 - botHelpCell2.getTop() : 0.0f) * fFloatValue) + ((1.0f - fFloatValue) * translationY2));
                            break;
                        default:
                            float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ChatListItemAnimator chatListItemAnimator2 = this.this$0;
                            float measuredHeight3 = chatListItemAnimator2.recyclerListView.getMeasuredHeight();
                            ChatActivity chatActivity3 = chatListItemAnimator2.activity;
                            float f3 = ((measuredHeight3 - chatActivity3.chatListViewPaddingTop) - chatActivity3.blurredViewBottomOffset) / 2.0f;
                            UserInfoCell userInfoCell2 = (UserInfoCell) userInfoCell;
                            float measuredHeight4 = (f3 - (userInfoCell2.getMeasuredHeight() / 2.0f)) + chatListItemAnimator2.activity.chatListViewPaddingTop;
                            userInfoCell2.setTranslationY(((((float) userInfoCell2.getTop()) > measuredHeight4 ? measuredHeight4 - userInfoCell2.getTop() : 0.0f) * fFloatValue2) + ((1.0f - fFloatValue2) * translationY2));
                            break;
                    }
                }
            });
            animatorSet.playTogether(valueAnimatorOfFloat2);
        } else if (view2 instanceof ChatMessageCell) {
            final ChatMessageCell chatMessageCell = (ChatMessageCell) view2;
            final ChatMessageCell.TransitionParams transitionParams = chatMessageCell.getTransitionParams();
            animatorSet.playTogether(ObjectAnimator.ofFloat(chatMessageCell, chatMessageCell.ANIMATION_OFFSET_X, 0.0f));
            if (moveInfoExtended2.animateImage) {
                chatMessageCell.setImageCoords(moveInfoExtended2.imageX, moveInfoExtended2.imageY, moveInfoExtended2.imageWidth, moveInfoExtended2.imageHeight);
                ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                final float f2 = chatMessageCell.getCurrentMessagesGroup() == null ? transitionParams.captionEnterProgress : chatMessageCell.getCurrentMessagesGroup().transitionParams.captionEnterProgress;
                final float fHasCaptionLayout = chatMessageCell.getCurrentMessagesGroup() == null ? chatMessageCell.hasCaptionLayout() : chatMessageCell.getCurrentMessagesGroup().hasCaption;
                final boolean z3 = f2 != fHasCaptionLayout;
                if (transitionParams.animateRadius) {
                    c = 0;
                    iArr = new int[4];
                    for (int i6 = 0; i6 < 4; i6++) {
                        iArr[i6] = chatMessageCell.getPhotoImage().getRoundRadius()[i6];
                    }
                } else {
                    c = 0;
                    iArr = null;
                }
                final int[] iArr2 = iArr;
                moveInfoExtended = moveInfoExtended2;
                f = 0.0f;
                valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        ChatListItemAnimator.MoveInfoExtended moveInfoExtended3 = moveInfoExtended;
                        float f3 = 1.0f - fFloatValue;
                        float f4 = moveInfoExtended3.imageX * f3;
                        ChatMessageCell.TransitionParams transitionParams2 = transitionParams;
                        float f5 = (transitionParams2.animateToImageX * fFloatValue) + f4;
                        float f6 = (transitionParams2.animateToImageY * fFloatValue) + (moveInfoExtended3.imageY * f3);
                        float f7 = (transitionParams2.animateToImageW * fFloatValue) + (moveInfoExtended3.imageWidth * f3);
                        float f8 = (transitionParams2.animateToImageH * fFloatValue) + (moveInfoExtended3.imageHeight * f3);
                        boolean z4 = z3;
                        ChatMessageCell chatMessageCell2 = chatMessageCell;
                        if (z4) {
                            float f9 = (fHasCaptionLayout * fFloatValue) + (f2 * f3);
                            transitionParams2.captionEnterProgress = f9;
                            if (chatMessageCell2.getCurrentMessagesGroup() != null) {
                                chatMessageCell2.getCurrentMessagesGroup().transitionParams.captionEnterProgress = f9;
                            }
                        }
                        if (transitionParams2.animateRadius) {
                            ImageReceiver photoImage = chatMessageCell2.getPhotoImage();
                            int[] iArr3 = iArr2;
                            float f10 = iArr3[0] * f3;
                            int[] iArr4 = transitionParams2.animateToRadius;
                            photoImage.setRoundRadius((int) ((iArr4[0] * fFloatValue) + f10), (int) ((iArr4[1] * fFloatValue) + (iArr3[1] * f3)), (int) ((iArr4[2] * fFloatValue) + (iArr3[2] * f3)), (int) ((iArr4[3] * fFloatValue) + (iArr3[3] * f3)));
                        }
                        chatMessageCell2.setImageCoords(f5, f6, f7, f8);
                        viewHolder.itemView.invalidate();
                    }
                });
                Animator[] animatorArr = new Animator[1];
                animatorArr[c] = valueAnimatorOfFloat3;
                animatorSet.playTogether(animatorArr);
            } else {
                moveInfoExtended = moveInfoExtended2;
                f = 0.0f;
            }
            if (moveInfoExtended.deltaBottom == 0 && moveInfoExtended.deltaRight == 0 && moveInfoExtended.deltaTop == 0 && moveInfoExtended.deltaLeft == 0) {
                transitionParams.toDeltaLeft = f;
                transitionParams.toDeltaRight = f;
                z2 = false;
            } else {
                RecyclerListView recyclerListView = this.recyclerListView;
                recyclerListView.setClipChildren(false);
                recyclerListView.invalidate();
                ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
                if (moveInfoExtended.animateBackgroundOnly) {
                    transitionParams.toDeltaLeft = -moveInfoExtended.deltaLeft;
                    transitionParams.toDeltaRight = -moveInfoExtended.deltaRight;
                } else {
                    transitionParams.toDeltaLeft = (-moveInfoExtended.deltaLeft) - chatMessageCell.getAnimationOffsetX();
                    transitionParams.toDeltaRight = (-moveInfoExtended.deltaRight) - chatMessageCell.getAnimationOffsetX();
                }
                valueAnimatorOfFloat4.addUpdateListener(new PeerStoriesView$40$$ExternalSyntheticLambda1(moveInfoExtended, transitionParams, chatMessageCell, 6));
                z2 = false;
                animatorSet.playTogether(valueAnimatorOfFloat4);
            }
            MessageObject.GroupedMessages currentMessagesGroup = chatMessageCell.getCurrentMessagesGroup();
            if (currentMessagesGroup == null) {
                moveInfoExtended.animateChangeGroupBackground = z2;
            }
            if (moveInfoExtended.animateChangeGroupBackground) {
                ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(1.0f, 0.0f);
                final MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                final RecyclerListView recyclerListView2 = (RecyclerListView) view2.getParent();
                final float f3 = currentMessagesGroup.transitionParams.captionEnterProgress;
                final float f4 = currentMessagesGroup.hasCaption ? 1.0f : 0.0f;
                final boolean z4 = f3 != f4;
                final MoveInfoExtended moveInfoExtended3 = moveInfoExtended;
                valueAnimatorOfFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        ChatListItemAnimator.MoveInfoExtended moveInfoExtended4 = moveInfoExtended3;
                        float f5 = moveInfoExtended4.groupOffsetTop * fFloatValue;
                        MessageObject.GroupedMessages.TransitionParams transitionParams3 = transitionParams2;
                        transitionParams3.offsetTop = f5;
                        transitionParams3.offsetBottom = moveInfoExtended4.groupOffsetBottom * fFloatValue;
                        transitionParams3.offsetLeft = moveInfoExtended4.groupOffsetLeft * fFloatValue;
                        transitionParams3.offsetRight = moveInfoExtended4.groupOffsetRight * fFloatValue;
                        if (z4) {
                            transitionParams3.captionEnterProgress = DiffUtil.m(1.0f, fFloatValue, f4, f3 * fFloatValue);
                        }
                        RecyclerListView recyclerListView3 = recyclerListView2;
                        if (recyclerListView3 != null) {
                            recyclerListView3.invalidate();
                        }
                    }
                });
                valueAnimatorOfFloat5.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public final void onAnimationEnd(Animator animator) {
                        MessageObject.GroupedMessages.TransitionParams transitionParams3 = transitionParams2;
                        transitionParams3.backgroundChangeBounds = false;
                        transitionParams3.drawBackgroundForDeletedItems = false;
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
                                transitionParams.changePinnedBottomProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                chatMessageCell.invalidate();
                                break;
                            default:
                                transitionParams.animateChangeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                chatMessageCell.invalidate();
                                break;
                        }
                    }
                });
                i2 = 1;
                Animator[] animatorArr2 = new Animator[1];
                animatorArr2[i] = valueAnimatorOfFloat6;
                animatorSet.playTogether(animatorArr2);
            } else {
                i2 = 1;
            }
            if (moveInfoExtended.animateChangeInternal) {
                ValueAnimator valueAnimatorOfFloat7 = ValueAnimator.ofFloat(0.0f, 1.0f);
                transitionParams.animateChange = i2;
                valueAnimatorOfFloat7.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i2) {
                            case 0:
                                transitionParams.changePinnedBottomProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                chatMessageCell.invalidate();
                                break;
                            default:
                                transitionParams.animateChangeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                chatMessageCell.invalidate();
                                break;
                        }
                    }
                });
                Animator[] animatorArr3 = new Animator[i2];
                animatorArr3[0] = valueAnimatorOfFloat7;
                animatorSet.playTogether(animatorArr3);
            }
        } else if (view2 instanceof ChatActionCell) {
            ChatActionCell chatActionCell = (ChatActionCell) view2;
            ChatActionCell.TransitionParams transitionParams3 = chatActionCell.getTransitionParams();
            if (moveInfoExtended2.animateChangeInternal) {
                ValueAnimator valueAnimatorOfFloat8 = ValueAnimator.ofFloat(0.0f, 1.0f);
                transitionParams3.animateChange = true;
                valueAnimatorOfFloat8.addUpdateListener(new RichBlockInset$$ExternalSyntheticLambda0(1, transitionParams3, chatActionCell));
                animatorSet.playTogether(valueAnimatorOfFloat8);
            }
        }
        if (z) {
            animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        } else {
            CubicBezierInterpolator cubicBezierInterpolator = this.translationInterpolator;
            if (cubicBezierInterpolator != null) {
                animatorSet.setInterpolator(cubicBezierInterpolator);
            }
        }
        animatorSet.setDuration((long) (250 * (z ? 1.9f : 1.0f)));
        animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public final void onAnimationCancel(Animator animator) {
                if (i5 != 0) {
                    view.setTranslationY(0.0f);
                }
            }

            @Override
            public final void onAnimationEnd(Animator animator) {
                animator.removeAllListeners();
                RecyclerView.ViewHolder viewHolder2 = viewHolder;
                View view3 = viewHolder2.itemView;
                ChatListItemAnimator chatListItemAnimator = this;
                chatListItemAnimator.restoreTransitionParams(view3);
                View view4 = viewHolder2.itemView;
                if (view4 instanceof ChatMessageCell) {
                    ChatMessageCell chatMessageCell2 = (ChatMessageCell) view4;
                    if (chatMessageCell2.makeVisibleAfterChange) {
                        chatMessageCell2.makeVisibleAfterChange = false;
                        chatMessageCell2.setVisibility(0);
                    }
                    MessageObject.GroupedMessages currentMessagesGroup2 = chatMessageCell2.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 != null) {
                        currentMessagesGroup2.transitionParams.reset();
                    }
                }
                if (chatListItemAnimator.mMoveAnimations.remove(viewHolder2)) {
                    chatListItemAnimator.dispatchAnimationFinished(viewHolder2);
                    chatListItemAnimator.dispatchFinishedWhenDone();
                }
            }

            @Override
            public final void onAnimationStart(Animator animator) {
                this.getClass();
            }
        });
        animatorSet.start();
        this.animators.put(viewHolder, animatorSet);
    }
}
