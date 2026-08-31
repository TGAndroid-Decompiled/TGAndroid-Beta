package uf;

import org.telegram.messenger.R;
public enum w {
    All(0, R.string.SearchMessagesFilterAll, R.string.SearchMessagesFilterAllFrom),
    Private(8, R.string.SearchMessagesFilterPrivate, R.string.SearchMessagesFilterPrivateFrom),
    Groups(4, R.string.SearchMessagesFilterGroup, R.string.SearchMessagesFilterGroupFrom),
    Channels(2, R.string.SearchMessagesFilterChannels, R.string.SearchMessagesFilterChannelsFrom);
    
    public final int f48730a;
    public final int f48731b;
    public final int f48732c;

    w(int i10, int i11, int i12) {
        this.f48730a = i10;
        this.f48731b = i11;
        this.f48732c = i12;
    }
}
