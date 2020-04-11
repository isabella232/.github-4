// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/routes/v1/waypoint.proto

package com.google.maps.routes.v1;

public interface LocationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.maps.routes.v1.Location)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The waypoint's geographic coordinates.
   * </pre>
   *
   * <code>.google.type.LatLng lat_lng = 1;</code>
   * @return Whether the latLng field is set.
   */
  boolean hasLatLng();
  /**
   * <pre>
   * The waypoint's geographic coordinates.
   * </pre>
   *
   * <code>.google.type.LatLng lat_lng = 1;</code>
   * @return The latLng.
   */
  com.google.type.LatLng getLatLng();
  /**
   * <pre>
   * The waypoint's geographic coordinates.
   * </pre>
   *
   * <code>.google.type.LatLng lat_lng = 1;</code>
   */
  com.google.type.LatLngOrBuilder getLatLngOrBuilder();

  /**
   * <pre>
   * The compass heading associated with the direction of the flow of traffic.
   * This value is used to specify the side of the road to use for pickup and
   * drop-off. Heading values can be from 0 to 360, where 0 specifies a heading
   * of due North, 90 specifies a heading of due East, etc. You can use this
   * field only for `DRIVE` and `TWO_WHEELER` travel modes.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value heading = 2;</code>
   * @return Whether the heading field is set.
   */
  boolean hasHeading();
  /**
   * <pre>
   * The compass heading associated with the direction of the flow of traffic.
   * This value is used to specify the side of the road to use for pickup and
   * drop-off. Heading values can be from 0 to 360, where 0 specifies a heading
   * of due North, 90 specifies a heading of due East, etc. You can use this
   * field only for `DRIVE` and `TWO_WHEELER` travel modes.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value heading = 2;</code>
   * @return The heading.
   */
  com.google.protobuf.Int32Value getHeading();
  /**
   * <pre>
   * The compass heading associated with the direction of the flow of traffic.
   * This value is used to specify the side of the road to use for pickup and
   * drop-off. Heading values can be from 0 to 360, where 0 specifies a heading
   * of due North, 90 specifies a heading of due East, etc. You can use this
   * field only for `DRIVE` and `TWO_WHEELER` travel modes.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value heading = 2;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getHeadingOrBuilder();
}
