package uf;

import org.telegram.messenger.R;
public enum w {
    All(0, R.string.SearchMessagesFilterAll, R.string.SearchMessagesFilterAllFrom),
    Private(8, R.string.SearchMessagesFilterPrivate, R.string.SearchMessagesFilterPrivateFrom),
    Groups(4, R.string.SearchMessagesFilterGroup, R.string.SearchMessagesFilterGroupFrom),
    Channels(2, R.string.SearchMessagesFilterChannels, R.string.SearchMessagesFilterChannelsFrom);
    
    public final int f48766a;
    public final int f48767b;
    public final int f48768c;

    w(int i10, int i11, int i12) {
        this.f48766a = i10;
        this.f48767b = i11;
        this.f48768c = i12;
    }
}
