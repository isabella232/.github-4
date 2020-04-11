// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/maps/routes/v1/compute_routes_request.proto

package com.google.maps.routes.v1;

public interface RouteModifiersOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.maps.routes.v1.RouteModifiers)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specifies whether to avoid toll roads. Applies only to the `DRIVE` and
   * `TWO_WHEELER` travel modes.
   * </pre>
   *
   * <code>bool avoid_tolls = 1;</code>
   * @return The avoidTolls.
   */
  boolean getAvoidTolls();

  /**
   * <pre>
   * Specifies whether to avoid highways. Applies only to the `DRIVE` and
   * `TWO_WHEELER` travel modes.
   * </pre>
   *
   * <code>bool avoid_highways = 2;</code>
   * @return The avoidHighways.
   */
  boolean getAvoidHighways();

  /**
   * <pre>
   * Specifies whether to avoid ferries. Applies only to the `DRIVE` and
   * `TWO_WHEELER` travel modes.
   * </pre>
   *
   * <code>bool avoid_ferries = 3;</code>
   * @return The avoidFerries.
   */
  boolean getAvoidFerries();

  /**
   * <pre>
   * Specifies whether to avoid navigating indoors. Applies only to the `WALK`
   * travel mode.
   * </pre>
   *
   * <code>bool avoid_indoor = 4;</code>
   * @return The avoidIndoor.
   */
  boolean getAvoidIndoor();

  /**
   * <pre>
   * Optional. Specifies the vehicle information.
   * </pre>
   *
   * <code>.google.maps.routes.v1.VehicleInfo vehicle_info = 5;</code>
   * @return Whether the vehicleInfo field is set.
   */
  boolean hasVehicleInfo();
  /**
   * <pre>
   * Optional. Specifies the vehicle information.
   * </pre>
   *
   * <code>.google.maps.routes.v1.VehicleInfo vehicle_info = 5;</code>
   * @return The vehicleInfo.
   */
  com.google.maps.routes.v1.VehicleInfo getVehicleInfo();
  /**
   * <pre>
   * Optional. Specifies the vehicle information.
   * </pre>
   *
   * <code>.google.maps.routes.v1.VehicleInfo vehicle_info = 5;</code>
   */
  com.google.maps.routes.v1.VehicleInfoOrBuilder getVehicleInfoOrBuilder();

  /**
   * <pre>
   * Encapsulates information about toll passes.
   * TollPass is unset means no available pass.
   * Applies only to the DRIVE and TWO_WHEELER travel modes.
   * </pre>
   *
   * <code>repeated .google.maps.routes.v1.TollPass toll_passes = 6;</code>
   * @return A list containing the tollPasses.
   */
  java.util.List<com.google.maps.routes.v1.TollPass> getTollPassesList();
  /**
   * <pre>
   * Encapsulates information about toll passes.
   * TollPass is unset means no available pass.
   * Applies only to the DRIVE and TWO_WHEELER travel modes.
   * </pre>
   *
   * <code>repeated .google.maps.routes.v1.TollPass toll_passes = 6;</code>
   * @return The count of tollPasses.
   */
  int getTollPassesCount();
  /**
   * <pre>
   * Encapsulates information about toll passes.
   * TollPass is unset means no available pass.
   * Applies only to the DRIVE and TWO_WHEELER travel modes.
   * </pre>
   *
   * <code>repeated .google.maps.routes.v1.TollPass toll_passes = 6;</code>
   * @param index The index of the element to return.
   * @return The tollPasses at the given index.
   */
  com.google.maps.routes.v1.TollPass getTollPasses(int index);
  /**
   * <pre>
   * Encapsulates information about toll passes.
   * TollPass is unset means no available pass.
   * Applies only to the DRIVE and TWO_WHEELER travel modes.
   * </pre>
   *
   * <code>repeated .google.maps.routes.v1.TollPass toll_passes = 6;</code>
   * @return A list containing the enum numeric values on the wire for tollPasses.
   */
  java.util.List<java.lang.Integer>
  getTollPassesValueList();
  /**
   * <pre>
   * Encapsulates information about toll passes.
   * TollPass is unset means no available pass.
   * Applies only to the DRIVE and TWO_WHEELER travel modes.
   * </pre>
   *
   * <code>repeated .google.maps.routes.v1.TollPass toll_passes = 6;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of tollPasses at the given index.
   */
  int getTollPassesValue(int index);
}
