package s3;

import j$.util.DesugarCollections;
import java.util.List;
public final class d extends b {
    public final long f46489a;
    public final long f46490b;
    public final List f46491c;

    public d(long j3, long j10, List list) {
        this.f46489a = j3;
        this.f46490b = j10;
        this.f46491c = DesugarCollections.unmodifiableList(list);
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb2.append(this.f46489a);
        sb2.append(", programSplicePlaybackPositionUs= ");
        return a4.a.s(sb2, this.f46490b, " }");
    }
}
